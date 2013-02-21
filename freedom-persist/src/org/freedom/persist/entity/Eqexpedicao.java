package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Eqexpedicao generated by hbm2java
 */
@Entity
@Table(name = "EQEXPEDICAO")
public class Eqexpedicao implements java.io.Serializable {

	private EqexpedicaoId id;
	private Eqproduto eqproduto;
	private Vdveiculo vdveiculo;
	private Vdmotorista vdmotorista;
	private Eqtipoexpedicao eqtipoexpedicao;
	private Vdromaneio vdromaneio;
	private Eqalmox eqalmox;
	private Vdtransp vdtransp;
	private String refprod;
	private String status;
	private char tipofrete;
	private Date dtsaida;
	private BigDecimal pesoentrada;
	private BigDecimal pesosaida;
	private BigDecimal qtdinformada;
	private BigDecimal precopeso;
	private String obsexped;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Lffrete> lffretes = new HashSet<Lffrete>(0);
	private Set<Eqitexpedicao> eqitexpedicaos = new HashSet<Eqitexpedicao>(0);
	private Set<Vdromaneio> vdromaneios = new HashSet<Vdromaneio>(0);

	public Eqexpedicao() {
	}

	public Eqexpedicao(EqexpedicaoId id, Eqtipoexpedicao eqtipoexpedicao,
			String status, char tipofrete, Date dtsaida, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.eqtipoexpedicao = eqtipoexpedicao;
		this.status = status;
		this.tipofrete = tipofrete;
		this.dtsaida = dtsaida;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqexpedicao(EqexpedicaoId id, Eqproduto eqproduto,
			Vdveiculo vdveiculo, Vdmotorista vdmotorista,
			Eqtipoexpedicao eqtipoexpedicao, Vdromaneio vdromaneio,
			Eqalmox eqalmox, Vdtransp vdtransp, String refprod, String status,
			char tipofrete, Date dtsaida, BigDecimal pesoentrada,
			BigDecimal pesosaida, BigDecimal qtdinformada,
			BigDecimal precopeso, String obsexped, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Lffrete> lffretes, Set<Eqitexpedicao> eqitexpedicaos,
			Set<Vdromaneio> vdromaneios) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.vdveiculo = vdveiculo;
		this.vdmotorista = vdmotorista;
		this.eqtipoexpedicao = eqtipoexpedicao;
		this.vdromaneio = vdromaneio;
		this.eqalmox = eqalmox;
		this.vdtransp = vdtransp;
		this.refprod = refprod;
		this.status = status;
		this.tipofrete = tipofrete;
		this.dtsaida = dtsaida;
		this.pesoentrada = pesoentrada;
		this.pesosaida = pesosaida;
		this.qtdinformada = qtdinformada;
		this.precopeso = precopeso;
		this.obsexped = obsexped;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.lffretes = lffretes;
		this.eqitexpedicaos = eqitexpedicaos;
		this.vdromaneios = vdromaneios;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "ticket", column = @Column(name = "TICKET", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public EqexpedicaoId getId() {
		return this.id;
	}

	public void setId(EqexpedicaoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD"),
			@JoinColumn(name = "CODFILIALPD", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPPD", referencedColumnName = "CODEMP") })
	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVEIC", referencedColumnName = "CODVEIC"),
			@JoinColumn(name = "CODFILIALVE", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPVE", referencedColumnName = "CODEMP") })
	public Vdveiculo getVdveiculo() {
		return this.vdveiculo;
	}

	public void setVdveiculo(Vdveiculo vdveiculo) {
		this.vdveiculo = vdveiculo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODMOT", referencedColumnName = "CODMOT"),
			@JoinColumn(name = "CODFILIALMT", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPMT", referencedColumnName = "CODEMP") })
	public Vdmotorista getVdmotorista() {
		return this.vdmotorista;
	}

	public void setVdmotorista(Vdmotorista vdmotorista) {
		this.vdmotorista = vdmotorista;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOEXPED", referencedColumnName = "CODTIPOEXPED", nullable = false),
			@JoinColumn(name = "CODFILIALTE", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPTE", referencedColumnName = "CODEMP", nullable = false) })
	public Eqtipoexpedicao getEqtipoexpedicao() {
		return this.eqtipoexpedicao;
	}

	public void setEqtipoexpedicao(Eqtipoexpedicao eqtipoexpedicao) {
		this.eqtipoexpedicao = eqtipoexpedicao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODROMA", referencedColumnName = "CODROMA"),
			@JoinColumn(name = "CODFILIALRO", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPRO", referencedColumnName = "CODEMP") })
	public Vdromaneio getVdromaneio() {
		return this.vdromaneio;
	}

	public void setVdromaneio(Vdromaneio vdromaneio) {
		this.vdromaneio = vdromaneio;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODALMOX", referencedColumnName = "CODALMOX"),
			@JoinColumn(name = "CODFILIALAX", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPAX", referencedColumnName = "CODEMP") })
	public Eqalmox getEqalmox() {
		return this.eqalmox;
	}

	public void setEqalmox(Eqalmox eqalmox) {
		this.eqalmox = eqalmox;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTRAN", referencedColumnName = "CODTRAN"),
			@JoinColumn(name = "CODFILIALTN", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTN", referencedColumnName = "CODEMP") })
	public Vdtransp getVdtransp() {
		return this.vdtransp;
	}

	public void setVdtransp(Vdtransp vdtransp) {
		this.vdtransp = vdtransp;
	}

	@Column(name = "REFPROD", length = 20)
	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	@Column(name = "STATUS", nullable = false, length = 2)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "TIPOFRETE", nullable = false, length = 1)
	public char getTipofrete() {
		return this.tipofrete;
	}

	public void setTipofrete(char tipofrete) {
		this.tipofrete = tipofrete;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTSAIDA", nullable = false, length = 10)
	public Date getDtsaida() {
		return this.dtsaida;
	}

	public void setDtsaida(Date dtsaida) {
		this.dtsaida = dtsaida;
	}

	@Column(name = "PESOENTRADA", precision = 15, scale = 5)
	public BigDecimal getPesoentrada() {
		return this.pesoentrada;
	}

	public void setPesoentrada(BigDecimal pesoentrada) {
		this.pesoentrada = pesoentrada;
	}

	@Column(name = "PESOSAIDA", precision = 15, scale = 5)
	public BigDecimal getPesosaida() {
		return this.pesosaida;
	}

	public void setPesosaida(BigDecimal pesosaida) {
		this.pesosaida = pesosaida;
	}

	@Column(name = "QTDINFORMADA", precision = 15, scale = 5)
	public BigDecimal getQtdinformada() {
		return this.qtdinformada;
	}

	public void setQtdinformada(BigDecimal qtdinformada) {
		this.qtdinformada = qtdinformada;
	}

	@Column(name = "PRECOPESO", precision = 15, scale = 5)
	public BigDecimal getPrecopeso() {
		return this.precopeso;
	}

	public void setPrecopeso(BigDecimal precopeso) {
		this.precopeso = precopeso;
	}

	@Column(name = "OBSEXPED", length = 1000)
	public String getObsexped() {
		return this.obsexped;
	}

	public void setObsexped(String obsexped) {
		this.obsexped = obsexped;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", nullable = false, length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", nullable = false, length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Column(name = "IDUSUINS", nullable = false, length = 8)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqexpedicao")
	public Set<Lffrete> getLffretes() {
		return this.lffretes;
	}

	public void setLffretes(Set<Lffrete> lffretes) {
		this.lffretes = lffretes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqexpedicao")
	public Set<Eqitexpedicao> getEqitexpedicaos() {
		return this.eqitexpedicaos;
	}

	public void setEqitexpedicaos(Set<Eqitexpedicao> eqitexpedicaos) {
		this.eqitexpedicaos = eqitexpedicaos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqexpedicao")
	public Set<Vdromaneio> getVdromaneios() {
		return this.vdromaneios;
	}

	public void setVdromaneios(Set<Vdromaneio> vdromaneios) {
		this.vdromaneios = vdromaneios;
	}

}