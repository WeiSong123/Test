package com.ymhw.website.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePermission<M extends BasePermission<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setPermissionCode(java.lang.String permissionCode) {
		set("permissionCode", permissionCode);
	}

	public java.lang.String getPermissionCode() {
		return get("permissionCode");
	}

	public void setPermissionDesc(java.lang.String permissionDesc) {
		set("permissionDesc", permissionDesc);
	}

	public java.lang.String getPermissionDesc() {
		return get("permissionDesc");
	}

}