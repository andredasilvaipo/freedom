package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sgeqvclifor generated by hbm2java
 */
@Entity
@Table(name = "SGEQVCLIFOR")
public class Sgeqvclifor implements java.io.Serializable {

	private SgeqvcliforId id;
	private Cpforneced cpforneced;
	private Vdcliente vdcliente;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgeqvclifor() {
	}

	public Sgeqvclifor(SgeqvcliforId id, Cpforneced cpforneced,
			Vdcliente vdcliente, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.cpforneced = cpforneced;
		this.vdcliente = vdcliente;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgeqvclifor(SgeqvcliforId id, Cpforneced cpforneced,
			Vdcliente vdcliente, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.cpforneced = cpforneced;
		this.vdcliente = vdcliente;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcli", column = @Column(name = "CODCLI", nullable = false)),
			@AttributeOverride(name = "codfilialcl", column = @Column(name = "CODFILIALCL", nullable = false)),
			@AttributeOverride(name = "codempcl", column = @Column(name = "CODEMPCL", nullable = false)),
			@AttributeOverride(name = "codfor", column = @Column(name = "CODFOR", nullable = false)),
			@AttributeOverride(name = "codfilialfr", column = @Column(name = "CODFILIALFR", nullable = false)),
			@AttributeOverride(name = "codempfr", column = @Column(name = "CODEMPFR", nullable = false)) })
	public SgeqvcliforId getId() {
		return this.id;
	}

	public void setId(SgeqvcliforId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFOR", referencedColumnName = "CODFOR", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALFR", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPFR", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Cpforneced getCpforneced() {
		return this.cpforneced;
	}

	public void setCpforneced(Cpforneced cpforneced) {
		this.cpforneced = cpforneced;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCLI", referencedColumnName = "CODCLI", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALCL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPCL", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
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
