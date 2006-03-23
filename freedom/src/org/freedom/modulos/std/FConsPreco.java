/**
 * @version 09/07/2004 <BR>
 * @author Setpoint Inform�tica Ltda./Robson Sanchez <BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.std <BR>
 * Classe: @(#)FConsPreco.java <BR>
 * 
 * Este programa � licenciado de acordo com a LPG-PC (Licen�a P�blica Geral para Programas de Computador), <BR>
 * vers�o 2.1.0 ou qualquer vers�o posterior. <BR>
 * A LPG-PC deve acompanhar todas PUBLICA��ES, DISTRIBUI��ES e REPRODU��ES deste Programa. <BR>
 * Caso uma c�pia da LPG-PC n�o esteja dispon�vel junto com este Programa, voc� pode contatar <BR>
 * o LICENCIADOR ou ent�o pegar uma c�pia em: <BR>
 * Licen�a: http://www.lpg.adv.br/licencas/lpgpc.rtf <BR>
 * Para poder USAR, PUBLICAR, DISTRIBUIR, REPRODUZIR ou ALTERAR este Programa � preciso estar <BR>
 * de acordo com os termos da LPG-PC <BR> <BR>
 *
 * Coment�rios sobre a classe...
 */

package org.freedom.modulos.std;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JScrollPane;

import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JPanelPad;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.StringDireita;
import org.freedom.componentes.Tabela;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FFilho;


/**
 * @author robson
 *
 * Tela de consulta de pre�os
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class FConsPreco extends FFilho implements KeyListener/*, FocusListener */{
	private static final long serialVersionUID = 1L;
    private JPanelPad pinCab = new JPanelPad(800,55);
    private Tabela tbPreco = new Tabela();
    private JScrollPane spPreco = new JScrollPane(tbPreco);
    private JTextFieldPad txtCodProd = new JTextFieldPad(JTextFieldPad.TP_STRING,13,0);
    private JTextFieldPad txtDescProd = new JTextFieldPad(JTextFieldPad.TP_STRING,50,10);
	
	public FConsPreco() {
		super(false);
		setTitulo("Consulta de pre�os");
		setAtribos(50,50,778,500);		
	}
	
	private void montaTela() {
		tbPreco.adicColuna("C�d.prod.");
		tbPreco.adicColuna("Refer�ncia");
		tbPreco.adicColuna("Descri��o");
		tbPreco.adicColuna("Pre�o");
		tbPreco.adicColuna("Saldo");
		tbPreco.setTamColuna(100,0);
		tbPreco.setTamColuna(100,1);
		tbPreco.setTamColuna(350,2);
		tbPreco.setTamColuna(100,3);
		tbPreco.setTamColuna(100,4);
		tbPreco.setFont( new Font("Tomoha", Font.PLAIN, 14) );
		montaTabela();

		pinCab.adic(new JLabelPad("C�digo do produto:"),7,2,120,20);
		pinCab.adic(txtCodProd,7,25,120,20);
		pinCab.adic(new JLabelPad("Pesquisa produto pela descri��o:"),130,2,200,20);
		pinCab.adic(txtDescProd,130,25,300,20);
		
		pnCliente.add(pinCab, BorderLayout.NORTH);
		pnCliente.add(spPreco, BorderLayout.CENTER);
		
		adicBotaoSair();
		
		tbPreco.addKeyListener(this);
		txtDescProd.addKeyListener(this);
		txtCodProd.addKeyListener(this);
		txtCodProd.setPK(true);
	}

	private void pesqDescProd(String sDescProd) {
		int iPesq = -1;
		try {
			iPesq = tbPreco.pesqLinha(2,sDescProd.trim());
			if (iPesq!=-1) {
				tbPreco.changeSelection(iPesq,0,true,true);
				tbPreco.setLinhaSel(iPesq);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			iPesq = 0;
		}
	}
	
	private void pesqCodProd(String sCodProd) {
		Vector vtemp = null;
		int iPesq = -1;
		try {
			for(int i=0; i<tbPreco.getNumLinhas(); i++) {
				vtemp = tbPreco.getLinha(i);
				if(sCodProd.equals(((StringDireita)vtemp.elementAt(0)).toString().trim())) {
					iPesq = i;
					break;
				}
			}
			if (iPesq!=-1) {
				tbPreco.changeSelection(iPesq,0,true,true);
				tbPreco.setLinhaSel(iPesq);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			vtemp = null;
			iPesq = 0;
		}
	}
	
	private void montaTabela() {
	    ResultSet rs = null;
	    PreparedStatement ps = null;
	    String sSql = "SELECT P.CODPROD,P.REFPROD,P.DESCPROD,PP.PRECOPROD,P.SLDLIQPROD " +
	    		"FROM EQPRODUTO P, VDPRECOPROD PP, SGPREFERE1 PF " +
	    		"WHERE P.ATIVOPROD='S' AND TIPOPROD IN ('P','S','F') AND CVPROD IN ('V','A') AND " +
	    		"PP.CODEMP=P.CODEMP AND PP.CODFILIAL=P.CODFILIAL AND PP.CODPROD=P.CODPROD AND " +
				"PF.CODEMPPG=PP.CODEMPPG AND PF.CODFILIALPG=PP.CODFILIALPG AND PF.CODPLANOPAG=PP.CODPLANOPAG AND " +
				"PF.CODEMPTB=PP.CODEMPTB AND PF.CODFILIALTB=PP.CODFILIALTB AND PF.CODTAB=PP.CODTAB AND " +
	    		"( (PF.CODCLASCLI IS NULL) OR " +
	    		"(PF.CODEMPCE=PP.CODEMPCC AND PF.CODFILIALCE=PP.CODFILIALCC AND PF.CODCLASCLI=PP.CODCLASCLI ) ) " +
	    		"AND PF.CODEMP=" + Aplicativo.iCodEmp + 
	    		" ORDER BY P.DESCPROD";
	    Vector vLinha = null;
	    try {
	    	ps = con.prepareStatement(sSql);
	    	rs = ps.executeQuery();
	    	tbPreco.limpa();
	    	while (rs.next()) {
	    		vLinha = new Vector();
	    		vLinha.addElement(new StringDireita(String.valueOf(rs.getInt("CODPROD"))));
	    		vLinha.addElement(new StringDireita(rs.getString("REFPROD")));
	    		vLinha.addElement(rs.getString("DESCPROD"));
	    		vLinha.addElement(new StringDireita(Funcoes.strDecimalToStrCurrency(15,2,rs.getDouble("PRECOPROD")+"")));
	    		vLinha.addElement(new StringDireita(rs.getDouble("SLDLIQPROD")+""));
	    		tbPreco.adicLinha(vLinha);
	    	}
	    	if (!con.getAutoCommit()) {
	    		con.commit();
	    	}
	    	rs.close();
	    	ps.close();
	    }
	    catch (SQLException err) {
	    	Funcoes.mensagemErro(null,"Erro consultando a tabela de pre�os!\n"+err.getMessage(),true,con,err);
	    }
	    finally {
	    	rs = null;
	    	ps = null;
	    	sSql = null;
	    	vLinha = null;
	    }
	}
	
	public void setConexao(Connection cn) {
	    super.setConexao(cn);
		montaTela();
    }
	
	public void keyTyped(KeyEvent e) { }

	public void keyPressed(KeyEvent e) {
		if (e.getSource()==txtDescProd)
			pesqDescProd(((JTextFieldPad) e.getSource()).getText().trim());
		else if (e.getSource()==txtCodProd && e.getKeyCode()==KeyEvent.VK_ENTER) {
			if(Aplicativo.bBuscaCodProdGen) {
				DLCodProd dl = new DLCodProd(con);
				dl.buscaCodProd(txtCodProd.getVlrString());
				if(dl.OK){
					txtCodProd.setVlrString(String.valueOf(dl.getCodProd()));
					pesqCodProd(txtCodProd.getVlrString().trim());
					tbPreco.requestFocus();
				}
				dl.dispose();
			} else {
				pesqCodProd(txtCodProd.getVlrString().trim());
				tbPreco.requestFocus();
			}
		}
	}
	
	public void keyReleased(KeyEvent e) {
		if (e.getSource()==tbPreco ) {
			if (e.getKeyCode()==KeyEvent.VK_F2)
				txtDescProd.requestFocus();
		}
	}
	
}

