package com.ymhw.website.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseEquiporderdetail<M extends BaseEquiporderdetail<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setOrderNo(java.lang.String orderNo) {
		set("orderNo", orderNo);
	}

	public java.lang.String getOrderNo() {
		return get("orderNo");
	}

	public void setEquipName(java.lang.String equipName) {
		set("equipName", equipName);
	}

	public java.lang.String getEquipName() {
		return get("equipName");
	}

}
