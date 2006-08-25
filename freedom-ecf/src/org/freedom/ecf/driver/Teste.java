package org.freedom.ecf.driver;

import java.util.Date;

import org.freedom.ecf.com.Serial;

public class Teste {
	
	private Teste(){
		System.out.println("teste");
	}
	
	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		final ECFBematech ecf = new ECFBematech(Serial.COM1);
		
		Date data = new Date();
		System.out.println("Inicio --> " + data.getHours() + ":" + data.getMinutes() + ":" + data.getSeconds() );
		
		
		//ecf.programaMoedaSingular( "Real" );
		
		//ecf.programaMoedaPlural( "reais" );
		
		//System.out.println("\nRetorno de Variaveis\n");
	
		//System.out.println("\n" + ecf.retornoVariaveis( ecf.V_FORMAS_PAG ) + "\n" );
		
		
		/*
		ecf.aberturaDeCupom();
		
		//ecf.programaUnidadeMedida("KG");
		//ecf.aumentaDescItem("Caneta                       0123456789" );
		
		ecf.vendaItem("0000000000001", "Caneta                       ", "FF", 1f, 0.12f, 0f);
		
		//ecf.vendaItemTresCasas("0000000000001", "Caneta                       ", "FF", 1f, 0.125f, 0f);
		
		//ecf.vendaItemDepartamento("FF", 15.001f, 1f, 0.001f, 0.001f, 3, "UN", "0000000000001", "Caneta");
		
		*/
		
		ecf.iniciaFechamentoCupom(ECFBematech.DESCONTO_PERC,0);
		ecf.efetuaFormaPagamento("01",1f,"to testando...");
		ecf.terminaFechamentoCupom("Obrigado pela Preferencia!!!");		
		
		

		//ecf.autenticacaoDeDocumento();
		
		//ecf.programaFormaPagamento("Cartao Credito  ");// 2
		//ecf.programaFormaPagamento("A vista         ");// 3		

		//ecf.comprovanteNFiscalNVinculado("SU",100,"");
		
		data = new Date();
		System.out.println("Fim -----> " + data.getHours() + ":" + data.getMinutes() + ":" + data.getSeconds() );
				
		System.exit(0);
	}

}
