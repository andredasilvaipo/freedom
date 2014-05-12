package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AtatendenteId generated by hbm2java
 */
@Embeddable
public class AtatendenteId implements java.io.Serializable {

	private int codatend;
	private short codfilial;
	private int codemp;

	public AtatendenteId() {
	}

	public AtatendenteId(int codatend, short codfilial, int codemp) {
		this.codatend = codatend;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODATEND", nullable = false)
	public int getCodatend() {
		return this.codatend;
	}

	public void setCodatend(int codatend) {
		this.codatend = codatend;
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
		if (!(other instanceof AtatendenteId))
			return false;
		AtatendenteId castOther = (AtatendenteId) other;

		return (this.getCodatend() == castOther.getCodatend())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodatend();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
