package com.ymhw.website.model;

import java.util.Date;

import com.ymhw.website.model.base.BaseCarrentstatus;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Carrentstatus extends BaseCarrentstatus<Carrentstatus> {
	public static final Carrentstatus dao = new Carrentstatus();
	
	public Carrentstatus getByComposeId(int carId, Date day) {
		return dao.findFirst("select * from carrentstatus where isValid = 1 and carId = ? and day = ?", carId, day);
	}
	
	public void getInfo(int carId, Date start, Date end) {
		
	}
}