package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Spnatoper generated by hbm2java
 */
@Entity
@Table(name = "SPNATOPER")
public class Spnatoper implements java.io.Serializable {

	private SpnatoperId id;
	private String descProd;
	private Date dtIni;
	private Date dtFim;
	private String ncm;
	private String ncmEx;
	private String exIpi;
	private String unid;
	private BigDecimal aliqPis;
	private BigDecimal aliqCofin;
	private String exTabOperSemCsl;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set lfclfiscals = new HashSet(0);

	public Spnatoper() {
	}

	public Spnatoper(SpnatoperId id, String descProd, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt) {
		this.id = id;
		this.descProd = descProd;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
	}

	public Spnatoper(SpnatoperId id, String descProd, Date dtIni, Date dtFim,
			String ncm, String ncmEx, String exIpi, String unid,
			BigDecimal aliqPis, BigDecimal aliqCofin, String exTabOperSemCsl,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set lfclfiscals) {
		this.id = id;
		this.descProd = descProd;
		this.dtIni = dtIni;
		this.dtFim = dtFim;
		this.ncm = ncm;
		this.ncmEx = ncmEx;
		this.exIpi = exIpi;
		this.unid = unid;
		this.aliqPis = aliqPis;
		this.aliqCofin = aliqCofin;
		this.exTabOperSemCsl = exTabOperSemCsl;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.lfclfiscals = lfclfiscals;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigo", column = @Column(name = "CODIGO", nullable = false, length = 10)),
			@AttributeOverride(name = "cst", column = @Column(name = "CST", nullable = false, length = 2)) })
	public SpnatoperId getId() {
		return this.id;
	}

	public void setId(SpnatoperId id) {
		this.id = id;
	}

	@Column(name = "DESC_PROD", nullable = false, length = 500)
	public String getDescProd() {
		return this.descProd;
	}

	public void setDescProd(String descProd) {
		this.descProd = descProd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_INI", length = 10)
	public Date getDtIni() {
		return this.dtIni;
	}

	public void setDtIni(Date dtIni) {
		this.dtIni = dtIni;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_FIM", length = 10)
	public Date getDtFim() {
		return this.dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	@Column(name = "NCM", length = 1000)
	public String getNcm() {
		return this.ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	@Column(name = "NCM_EX", length = 1000)
	public String getNcmEx() {
		return this.ncmEx;
	}

	public void setNcmEx(String ncmEx) {
		this.ncmEx = ncmEx;
	}

	@Column(name = "EX_IPI", length = 1000)
	public String getExIpi() {
		return this.exIpi;
	}

	public void setExIpi(String exIpi) {
		this.exIpi = exIpi;
	}

	@Column(name = "UNID", length = 250)
	public String getUnid() {
		return this.unid;
	}

	public void setUnid(String unid) {
		this.unid = unid;
	}

	@Column(name = "ALIQ_PIS", precision = 10)
	public BigDecimal getAliqPis() {
		return this.aliqPis;
	}

	public void setAliqPis(BigDecimal aliqPis) {
		this.aliqPis = aliqPis;
	}

	@Column(name = "ALIQ_COFIN", precision = 10)
	public BigDecimal getAliqCofin() {
		return this.aliqCofin;
	}

	public void setAliqCofin(BigDecimal aliqCofin) {
		this.aliqCofin = aliqCofin;
	}

	@Column(name = "EX_TAB_OPER_SEM_CSL", length = 1000)
	public String getExTabOperSemCsl() {
		return this.exTabOperSemCsl;
	}

	public void setExTabOperSemCsl(String exTabOperSemCsl) {
		this.exTabOperSemCsl = exTabOperSemCsl;
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

	@Column(name = "IDUSUINS", nullable = false, length = 128)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", nullable = false, length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", nullable = false, length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", length = 128)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

/*	@OneToMany(fetch = FetchType.LAZY, mappedBy = "spnatoper")
	public Set getLfclfiscals() {
		return this.lfclfiscals;
	}

	public void setLfclfiscals(Set lfclfiscals) {
		this.lfclfiscals = lfclfiscals;
	}
*/
}
