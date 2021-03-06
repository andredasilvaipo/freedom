package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cpcompravenda generated by hbm2java
 */
@Entity
@Table(name = "CPCOMPRAVENDA")
public class Cpcompravenda implements java.io.Serializable {

	private CpcompravendaId id;
	private Cpitcompra cpitcompra;
	private Vditvenda vditvenda;
	private BigDecimal qtddev;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Cpcompravenda() {
	}

	public Cpcompravenda(Cpitcompra cpitcompra, Vditvenda vditvenda,
			BigDecimal qtddev, Date dtins, Date hins, String idusuins) {
		this.cpitcompra = cpitcompra;
		this.vditvenda = vditvenda;
		this.qtddev = qtddev;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cpcompravenda(Cpitcompra cpitcompra, Vditvenda vditvenda,
			BigDecimal qtddev, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.cpitcompra = cpitcompra;
		this.vditvenda = vditvenda;
		this.qtddev = qtddev;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "coditcompra", column = @Column(name = "CODITCOMPRA", nullable = false)),
			@AttributeOverride(name = "codcompra", column = @Column(name = "CODCOMPRA", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public CpcompravendaId getId() {
		return this.id;
	}

	public void setId(CpcompravendaId id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Cpitcompra getCpitcompra() {
		return this.cpitcompra;
	}

	public void setCpitcompra(Cpitcompra cpitcompra) {
		this.cpitcompra = cpitcompra;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVENDA", referencedColumnName = "CODVENDA", nullable = false),
			@JoinColumn(name = "CODITVENDA", referencedColumnName = "CODITVENDA", nullable = false),
			@JoinColumn(name = "TIPOVENDA", referencedColumnName = "TIPOVENDA", nullable = false),
			@JoinColumn(name = "CODFILIALVD", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPVD", referencedColumnName = "CODEMP", nullable = false) })
	public Vditvenda getVditvenda() {
		return this.vditvenda;
	}

	public void setVditvenda(Vditvenda vditvenda) {
		this.vditvenda = vditvenda;
	}

	@Column(name = "QTDDEV", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtddev() {
		return this.qtddev;
	}

	public void setQtddev(BigDecimal qtddev) {
		this.qtddev = qtddev;
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

}
