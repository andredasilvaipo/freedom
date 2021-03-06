package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SgacessomgId generated by hbm2java
 */
@Embeddable
public class SgacessomgId implements java.io.Serializable {

	private int codmenu;
	private int codmodu;
	private int codsis;
	private String idgrpusu;
	private short codfilial;
	private int codemp;

	public SgacessomgId() {
	}

	public SgacessomgId(int codmenu, int codmodu, int codsis, String idgrpusu,
			short codfilial, int codemp) {
		this.codmenu = codmenu;
		this.codmodu = codmodu;
		this.codsis = codsis;
		this.idgrpusu = idgrpusu;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODMENU", nullable = false)
	public int getCodmenu() {
		return this.codmenu;
	}

	public void setCodmenu(int codmenu) {
		this.codmenu = codmenu;
	}

	@Column(name = "CODMODU", nullable = false)
	public int getCodmodu() {
		return this.codmodu;
	}

	public void setCodmodu(int codmodu) {
		this.codmodu = codmodu;
	}

	@Column(name = "CODSIS", nullable = false)
	public int getCodsis() {
		return this.codsis;
	}

	public void setCodsis(int codsis) {
		this.codsis = codsis;
	}

	@Column(name = "IDGRPUSU", nullable = false, length = 8)
	public String getIdgrpusu() {
		return this.idgrpusu;
	}

	public void setIdgrpusu(String idgrpusu) {
		this.idgrpusu = idgrpusu;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SgacessomgId))
			return false;
		SgacessomgId castOther = (SgacessomgId) other;

		return (this.getCodmenu() == castOther.getCodmenu())
				&& (this.getCodmodu() == castOther.getCodmodu())
				&& (this.getCodsis() == castOther.getCodsis())
				&& ((this.getIdgrpusu() == castOther.getIdgrpusu()) || (this
						.getIdgrpusu() != null
						&& castOther.getIdgrpusu() != null && this
						.getIdgrpusu().equals(castOther.getIdgrpusu())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodmenu();
		result = 37 * result + this.getCodmodu();
		result = 37 * result + this.getCodsis();
		result = 37 * result
				+ (getIdgrpusu() == null ? 0 : this.getIdgrpusu().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
