package com.ymhw.website.model;

import java.util.List;

import com.ymhw.website.model.base.BaseProduct;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Product extends BaseProduct<Product> {
	public static final Product dao = new Product();
	
	public Product getOneById(int id) {
		return dao.findFirst("select * from product where isValid = 1 and id=?", id);
	}
	
	public Product getOneByFarmId(int farmId) {
		return dao.findFirst("select * from product where isValid = 1 and farmId = ? order by lastUpdateTime desc", farmId);
	}
	
	public List<Product> getProductsByFarmId(int farmId) {
		return dao.find("select product.*,substring_index(pics, ',', 1) as img from product where isValid = 1 and farmId = ? order by lastUpdateTime desc", farmId);
	}
}
