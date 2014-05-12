package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

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
 * Fnfbncodret generated by hbm2java
 */
@Entity
@Table(name = "FNFBNCODRET")
public class Fnfbncodret implements java.io.Serializable {

	private FnfbncodretId id;
	private Sgitprefere6 sgitprefere6;
	private String descret;
	private String tiporet;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set fnitfbncodrets = new HashSet(0);

	public Fnfbncodret() {
	}

	public Fnfbncodret(FnfbncodretId id, Sgitprefere6 sgitprefere6,
			String descret, String tiporet, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.sgitprefere6 = sgitprefere6;
		this.descret = descret;
		this.tiporet = tiporet;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Fnfbncodret(FnfbncodretId id, Sgitprefere6 sgitprefere6,
			String descret, String tiporet, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set fnitfbncodrets) {
		this.id = id;
		this.sgitprefere6 = sgitprefere6;
		this.descret = descret;
		this.tiporet = tiporet;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.fnitfbncodrets = fnitfbncodrets;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codret", column = @Column(name = "CODRET", nullable = false, length = 4)),
			@AttributeOverride(name = "tipofebraban", column = @Column(name = "TIPOFEBRABAN", nullable = false, length = 2)),
			@AttributeOverride(name = "codbanco", column = @Column(name = "CODBANCO", nullable = false, length = 3)),
			@AttributeOverride(name = "codfilialbo", column = @Column(name = "CODFILIALBO", nullable = false)),
			@AttributeOverride(name = "codempbo", column = @Column(name = "CODEMPBO", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public FnfbncodretId getId() {
		return this.id;
	}

	public void setId(FnfbncodretId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODBANCO", referencedColumnName = "CODBANCO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "TIPOFEBRABAN", referencedColumnName = "TIPOFEBRABAN", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALBO", referencedColumnName = "CODFILIALBO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPBO", referencedColumnName = "CODEMPBO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgitprefere6 getSgitprefere6() {
		return this.sgitprefere6;
	}

	public void setSgitprefere6(Sgitprefere6 sgitprefere6) {
		this.sgitprefere6 = sgitprefere6;
	}

	@Column(name = "DESCRET", nullable = false, length = 100)
	public String getDescret() {
		return this.descret;
	}

	public void setDescret(String descret) {
		this.descret = descret;
	}

	@Column(name = "TIPORET", nullable = false, length = 2)
	public String getTiporet() {
		return this.tiporet;
	}

	public void setTiporet(String tiporet) {
		this.tiporet = tiporet;
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

	@Column(name = "IDUSUALT", nullable = false, length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnfbncodret")
	public Set getFnitfbncodrets() {
		return this.fnitfbncodrets;
	}

	public void setFnitfbncodrets(Set fnitfbncodrets) {
		this.fnitfbncodrets = fnitfbncodrets;
	}
*/
}
