package com.ymhw.website.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.jfinal.kit.StrKit;
import com.jfinal.plugin.activerecord.Page;
import com.ymhw.website.model.base.BaseCar;
import com.ymhw.website.utils.DateUtil;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Car extends BaseCar<Car> {
	public static final Car dao = new Car();
	
	public List<Car> getNCars(int count, Date day) {
		String sql = "select * from car order by lastUpdateTime desc";
		if (count != 0)
		{
//			sql = "select * from car order by lastUpdateTime desc limit ?";
//			return dao.find(sql, count);
			sql = "SELECT car.*,tmp.status FROM car LEFT JOIN (SELECT * from carrentstatus WHERE isValid = 1 and `day`='"
					+DateUtil.date2String(day, DateUtil.FORMAT0)+"') tmp "+
						"on car.id = tmp.carId WHERE car.isValid = 1 ORDER BY car.lastUpdateTime DESC LIMIT ?";
			return dao.find(sql,  count);
		}
		return dao.find(sql);
	}
	
	public Car getCarById(int carId) {
		return dao.findFirst("select * from car where isValid = 1 and id=?", carId);
	}
	
	public List<Car> queryCarsByConditon(Map<String, Object> param) {
		int gearType = (Integer) param.get("gearType");
		int factoryId = (Integer) param.get("factoryId");
		String types = (String) param.get("types");
		String prices = (String) param.get("prices");
		String rentStartTime = (String) param.get("rentStartTime");
		String sql = "select * from car where isValid = 1 ";
		
		List<Object> params = new ArrayList<Object>();
		sql += " and gearType = ?";
		params.add(gearType);
		
		if (factoryId != 0) {
			sql += " and factoryId = ?";
			params.add(factoryId);
		}
		if (!StrKit.isBlank(types) && !types.contains("0")) {
			sql += " and type in (?)";
			params.add(types);
		}
		if (!StrKit.isBlank(prices) && !"0,0".equals(prices)) {
			sql += " and price BETWEEN ? and ?";
			params.add(prices.split(",")[0]);
			params.add(prices.split(",")[1]);
		}
		sql += " order by lastUpdateTime desc limit 100";
		List<Car> cars =  Car.dao.find(sql, params.toArray());
		List<Car> results =  new ArrayList<Car>();
		for (Car car : cars) {
			Carrentstatus carrentstatus = Carrentstatus.dao.getByComposeId(car.getId(), DateUtil.string2Date(rentStartTime, DateUtil.FORMAT0));
			if (carrentstatus != null) {
				car.setStatus(carrentstatus.getStatus());
			}
			results.add(car);
		}
		return results;
	}

	public Page<Car> paginateByCondition(int pageNumber, int pageSize, Map<String, Object> param) {
		String keyword = (String) param.get("keyword");
		int type = (int) param.get("type");
		int factoryId = (int) param.get("factoryId");
		String start = "SELECT c.*,cf.name as factory FROM car c,carFactory cf "
				+ "WHERE c.isValid = 1 and cf.isValid = 1 and c.factoryId = cf.id ";
		String end = " ORDER BY c.lastUpdateTime DESC";
		String middle = "";
		List<Object> paras = new ArrayList<>();
		if (type != 0) {
			middle += " and c.type = ? ";
			paras.add(type);
		}
		if (factoryId != 0) {
			middle += " and c.factoryId = ? ";
			paras.add(factoryId);
		}
		if (!StrKit.isBlank(keyword)) {
			middle += " and c.name like ? ";
			paras.add("%"+keyword+"%");
		}
		String sql = start + middle + end;
		return paras.size()==0 ? dao.paginate(pageNumber, pageSize, sql) : dao.paginate(pageNumber, pageSize, sql, paras.toArray());
	}
	
}
