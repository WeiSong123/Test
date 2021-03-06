package com.ymhw.website.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("activity", "id", Activity.class);
		arp.addMapping("activitybill", "id", Activitybill.class);
		arp.addMapping("activityitem", "id", Activityitem.class);
		arp.addMapping("activityorderdetail", "id", Activityorderdetail.class);
		arp.addMapping("activityproperty", "id", Activityproperty.class);
		arp.addMapping("activitytype", "id", Activitytype.class);
		arp.addMapping("advice", "id", Advice.class);
		arp.addMapping("article", "id", Article.class);
		arp.addMapping("car", "id", Car.class);
		arp.addMapping("carfactory", "id", Carfactory.class);
		arp.addMapping("carorderdetail", "id", Carorderdetail.class);
		// Composite Primary Key order: carId,day
		arp.addMapping("carrentstatus", "carId,day", Carrentstatus.class);
		arp.addMapping("contact", "id", Contact.class);
		arp.addMapping("equip", "id", Equip.class);
		arp.addMapping("equiporderdetail", "id", Equiporderdetail.class);
		arp.addMapping("farmstay", "id", Farmstay.class);
		arp.addMapping("feedback", "id", Feedback.class);
		arp.addMapping("hotel", "id", Hotel.class);
		arp.addMapping("info", "info_id", Info.class);
		// Composite Primary Key order: info_id,tag_id
		arp.addMapping("info_has_tag", "info_id,tag_id", InfoHasTag.class);
		arp.addMapping("info_module", "info_module_id", InfoModule.class);
		arp.addMapping("info_tag", "tag_id", InfoTag.class);
		arp.addMapping("order", "id", Order.class);
		arp.addMapping("permission", "id", Permission.class);
		arp.addMapping("product", "id", Product.class);
		arp.addMapping("productorderdetail", "id", Productorderdetail.class);
		arp.addMapping("role", "id", Role.class);
		// Composite Primary Key order: permissionId,roleId
		arp.addMapping("role_permission", "permissionId,roleId", RolePermission.class);
		arp.addMapping("signup", "id", Signup.class);
		arp.addMapping("strategy", "id", Strategy.class);
		arp.addMapping("user", "id", User.class);
		arp.addMapping("welfare", "id", Welfare.class);
	}
}

