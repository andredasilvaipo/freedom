package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * EqtipoexpedicaoId generated by hbm2java
 */
public class EqtipoexpedicaoId implements java.io.Serializable {

	private int codtipoexped;
	private short codfilial;
	private int codemp;

	public EqtipoexpedicaoId() {
	}

	public EqtipoexpedicaoId(int codtipoexped, short codfilial, int codemp) {
		this.codtipoexped = codtipoexped;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodtipoexped() {
		return this.codtipoexped;
	}

	public void setCodtipoexped(int codtipoexped) {
		this.codtipoexped = codtipoexped;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

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
		if (!(other instanceof EqtipoexpedicaoId))
			return false;
		EqtipoexpedicaoId castOther = (EqtipoexpedicaoId) other;

		return (this.getCodtipoexped() == castOther.getCodtipoexped())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodtipoexped();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
