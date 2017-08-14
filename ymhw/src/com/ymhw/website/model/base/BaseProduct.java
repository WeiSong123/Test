package com.ymhw.website.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseProduct<M extends BaseProduct<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setDestId(java.lang.Integer destId) {
		set("destId", destId);
	}

	public java.lang.Integer getDestId() {
		return get("destId");
	}

	public void setFarmId(java.lang.Integer farmId) {
		set("farmId", farmId);
	}

	public java.lang.Integer getFarmId() {
		return get("farmId");
	}

	public void setType(java.lang.Integer type) {
		set("type", type);
	}

	public java.lang.Integer getType() {
		return get("type");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}

	public java.lang.String getTitle() {
		return get("title");
	}

	public void setSubhead(java.lang.String subhead) {
		set("subhead", subhead);
	}

	public java.lang.String getSubhead() {
		return get("subhead");
	}

	public void setPrice(java.math.BigDecimal price) {
		set("price", price);
	}

	public java.math.BigDecimal getPrice() {
		return get("price");
	}

	public void setPics(java.lang.String pics) {
		set("pics", pics);
	}

	public java.lang.String getPics() {
		return get("pics");
	}

	public void setBuynote(java.lang.String buynote) {
		set("buynote", buynote);
	}

	public java.lang.String getBuynote() {
		return get("buynote");
	}

	public void setDetail(java.lang.String detail) {
		set("detail", detail);
	}

	public java.lang.String getDetail() {
		return get("detail");
	}

	public void setSoldNum(java.lang.Integer soldNum) {
		set("soldNum", soldNum);
	}

	public java.lang.Integer getSoldNum() {
		return get("soldNum");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("createTime", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("createTime");
	}

	public void setLastUpdateTime(java.util.Date lastUpdateTime) {
		set("lastUpdateTime", lastUpdateTime);
	}

	public java.util.Date getLastUpdateTime() {
		return get("lastUpdateTime");
	}

	public void setIsValid(java.lang.Integer isValid) {
		set("isValid", isValid);
	}

	public java.lang.Integer getIsValid() {
		return get("isValid");
	}

}
