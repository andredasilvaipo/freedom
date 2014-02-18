package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Atatendimentovw04Id generated by hbm2java
 */
public class Atatendimentovw04Id implements java.io.Serializable {

	private Date dataatendo;
	private Integer codempct;
	private Short codfilialct;
	private Integer codcontr;
	private Short coditcontr;
	private Short anoatendo;
	private Short mesatendo;
	private BigDecimal totalhorastrab;
	private Integer codempoc;
	private Short codfilialoc;
	private Character tipoorc;
	private Integer codorc;

	public Atatendimentovw04Id() {
	}

	public Atatendimentovw04Id(Date dataatendo, Integer codempct,
			Short codfilialct, Integer codcontr, Short coditcontr,
			Short anoatendo, Short mesatendo, BigDecimal totalhorastrab,
			Integer codempoc, Short codfilialoc, Character tipoorc,
			Integer codorc) {
		this.dataatendo = dataatendo;
		this.codempct = codempct;
		this.codfilialct = codfilialct;
		this.codcontr = codcontr;
		this.coditcontr = coditcontr;
		this.anoatendo = anoatendo;
		this.mesatendo = mesatendo;
		this.totalhorastrab = totalhorastrab;
		this.codempoc = codempoc;
		this.codfilialoc = codfilialoc;
		this.tipoorc = tipoorc;
		this.codorc = codorc;
	}

	public Date getDataatendo() {
		return this.dataatendo;
	}

	public void setDataatendo(Date dataatendo) {
		this.dataatendo = dataatendo;
	}

	public Integer getCodempct() {
		return this.codempct;
	}

	public void setCodempct(Integer codempct) {
		this.codempct = codempct;
	}

	public Short getCodfilialct() {
		return this.codfilialct;
	}

	public void setCodfilialct(Short codfilialct) {
		this.codfilialct = codfilialct;
	}

	public Integer getCodcontr() {
		return this.codcontr;
	}

	public void setCodcontr(Integer codcontr) {
		this.codcontr = codcontr;
	}

	public Short getCoditcontr() {
		return this.coditcontr;
	}

	public void setCoditcontr(Short coditcontr) {
		this.coditcontr = coditcontr;
	}

	public Short getAnoatendo() {
		return this.anoatendo;
	}

	public void setAnoatendo(Short anoatendo) {
		this.anoatendo = anoatendo;
	}

	public Short getMesatendo() {
		return this.mesatendo;
	}

	public void setMesatendo(Short mesatendo) {
		this.mesatendo = mesatendo;
	}

	public BigDecimal getTotalhorastrab() {
		return this.totalhorastrab;
	}

	public void setTotalhorastrab(BigDecimal totalhorastrab) {
		this.totalhorastrab = totalhorastrab;
	}

	public Integer getCodempoc() {
		return this.codempoc;
	}

	public void setCodempoc(Integer codempoc) {
		this.codempoc = codempoc;
	}

	public Short getCodfilialoc() {
		return this.codfilialoc;
	}

	public void setCodfilialoc(Short codfilialoc) {
		this.codfilialoc = codfilialoc;
	}

	public Character getTipoorc() {
		return this.tipoorc;
	}

	public void setTipoorc(Character tipoorc) {
		this.tipoorc = tipoorc;
	}

	public Integer getCodorc() {
		return this.codorc;
	}

	public void setCodorc(Integer codorc) {
		this.codorc = codorc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Atatendimentovw04Id))
			return false;
		Atatendimentovw04Id castOther = (Atatendimentovw04Id) other;

		return ((this.getDataatendo() == castOther.getDataatendo()) || (this
				.getDataatendo() != null && castOther.getDataatendo() != null && this
				.getDataatendo().equals(castOther.getDataatendo())))
				&& ((this.getCodempct() == castOther.getCodempct()) || (this
						.getCodempct() != null
						&& castOther.getCodempct() != null && this
						.getCodempct().equals(castOther.getCodempct())))
				&& ((this.getCodfilialct() == castOther.getCodfilialct()) || (this
						.getCodfilialct() != null
						&& castOther.getCodfilialct() != null && this
						.getCodfilialct().equals(castOther.getCodfilialct())))
				&& ((this.getCodcontr() == castOther.getCodcontr()) || (this
						.getCodcontr() != null
						&& castOther.getCodcontr() != null && this
						.getCodcontr().equals(castOther.getCodcontr())))
				&& ((this.getCoditcontr() == castOther.getCoditcontr()) || (this
						.getCoditcontr() != null
						&& castOther.getCoditcontr() != null && this
						.getCoditcontr().equals(castOther.getCoditcontr())))
				&& ((this.getAnoatendo() == castOther.getAnoatendo()) || (this
						.getAnoatendo() != null
						&& castOther.getAnoatendo() != null && this
						.getAnoatendo().equals(castOther.getAnoatendo())))
				&& ((this.getMesatendo() == castOther.getMesatendo()) || (this
						.getMesatendo() != null
						&& castOther.getMesatendo() != null && this
						.getMesatendo().equals(castOther.getMesatendo())))
				&& ((this.getTotalhorastrab() == castOther.getTotalhorastrab()) || (this
						.getTotalhorastrab() != null
						&& castOther.getTotalhorastrab() != null && this
						.getTotalhorastrab().equals(
								castOther.getTotalhorastrab())))
				&& ((this.getCodempoc() == castOther.getCodempoc()) || (this
						.getCodempoc() != null
						&& castOther.getCodempoc() != null && this
						.getCodempoc().equals(castOther.getCodempoc())))
				&& ((this.getCodfilialoc() == castOther.getCodfilialoc()) || (this
						.getCodfilialoc() != null
						&& castOther.getCodfilialoc() != null && this
						.getCodfilialoc().equals(castOther.getCodfilialoc())))
				&& ((this.getTipoorc() == castOther.getTipoorc()) || (this
						.getTipoorc() != null && castOther.getTipoorc() != null && this
						.getTipoorc().equals(castOther.getTipoorc())))
				&& ((this.getCodorc() == castOther.getCodorc()) || (this
						.getCodorc() != null && castOther.getCodorc() != null && this
						.getCodorc().equals(castOther.getCodorc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getDataatendo() == null ? 0 : this.getDataatendo()
						.hashCode());
		result = 37 * result
				+ (getCodempct() == null ? 0 : this.getCodempct().hashCode());
		result = 37
				* result
				+ (getCodfilialct() == null ? 0 : this.getCodfilialct()
						.hashCode());
		result = 37 * result
				+ (getCodcontr() == null ? 0 : this.getCodcontr().hashCode());
		result = 37
				* result
				+ (getCoditcontr() == null ? 0 : this.getCoditcontr()
						.hashCode());
		result = 37 * result
				+ (getAnoatendo() == null ? 0 : this.getAnoatendo().hashCode());
		result = 37 * result
				+ (getMesatendo() == null ? 0 : this.getMesatendo().hashCode());
		result = 37
				* result
				+ (getTotalhorastrab() == null ? 0 : this.getTotalhorastrab()
						.hashCode());
		result = 37 * result
				+ (getCodempoc() == null ? 0 : this.getCodempoc().hashCode());
		result = 37
				* result
				+ (getCodfilialoc() == null ? 0 : this.getCodfilialoc()
						.hashCode());
		result = 37 * result
				+ (getTipoorc() == null ? 0 : this.getTipoorc().hashCode());
		result = 37 * result
				+ (getCodorc() == null ? 0 : this.getCodorc().hashCode());
		return result;
	}

}
