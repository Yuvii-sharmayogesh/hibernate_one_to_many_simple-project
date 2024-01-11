package com.jspider.hibernate_one_to_many.service;

import java.util.List;

import com.jspider.hibernate_one_to_many.dao.MobileSimDao;
import com.jspider.hibernate_one_to_many.dto.Mobile;
import com.jspider.hibernate_one_to_many.dto.Sim;



public class MobileSimService {
	MobileSimDao mobileSimDao=new MobileSimDao();
	
	/*
	 * Mobile sim insert sim
	 */
	public Mobile saveMobileSimService(Mobile mobile, List<Sim> sims) {
		return mobileSimDao.saveMobileSimDao(mobile,sims);
	}
		/*
		 * get mobile and sim data by mobile id
		 */

	public Mobile getMobileSimByMobileIdService(int mobileid) {
		return mobileSimDao.getMobileSimByMobileIdDao(mobileid);
	}
	/*
	 * delete sim by mobile id
	 */
	public void deleteSimByMobileIdService(int mobileId,int simId) {
		mobileSimDao.deleteSimByMobileIdDao(mobileId, simId);
	}
	/*
	 * Display
	 */

	public List<Mobile> getAllMobileSimService() {
		
		return mobileSimDao.getAllMobileSimDao();
	}
	
}
