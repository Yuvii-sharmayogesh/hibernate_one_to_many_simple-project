package com.jspider.hibernate_one_to_many.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.jspider.hibernate_one_to_many.dto.Mobile;
import com.jspider.hibernate_one_to_many.dto.Sim;
import com.jspider.hibernate_one_to_many.service.MobileSimService;

public class MobileSimInsertController {
	
	public static void main(String[] args) {
		MobileSimService mobileSimService = new MobileSimService();
		
		Sim sim1 = new Sim(325, "prepaid", "Airtel", "4G");
		
		Sim sim2 = new Sim(358, "postpaid", "Airtel", "5G");
		
		List<Sim> sims = new ArrayList<Sim>(Arrays.asList(sim1, sim2));
		
		Mobile mobile = new Mobile(102, "Samsung", "Black", 65000, sims);
		
		/*
		 * 1st parameter mobile,2nd parameter list of sim
		 */
		mobileSimService.saveMobileSimService(mobile, sims);
	}
}
