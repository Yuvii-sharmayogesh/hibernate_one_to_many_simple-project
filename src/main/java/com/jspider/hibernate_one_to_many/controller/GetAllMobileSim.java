package com.jspider.hibernate_one_to_many.controller;

import java.util.List;

import com.jspider.hibernate_one_to_many.dto.Mobile;
import com.jspider.hibernate_one_to_many.dto.Sim;
import com.jspider.hibernate_one_to_many.service.MobileSimService;


public class GetAllMobileSim {
public static void main(String[] args) {
		
	MobileSimService mobileSimService = new MobileSimService();
	
	List<Mobile> mobiles = mobileSimService.getAllMobileSimService();
		
		for (Mobile mobile : mobiles) {
			
			if(mobile!=null) {
				System.out.println("mobile------Details-----");
				System.out.println("mobileid = "+mobile.getMobileId());
				System.out.println("mobileName = "+mobile.getMobileName());
				System.out.println("mobilePrice = "+mobile.getMobilePrice());
				System.out.println("mobileColor = "+mobile.getMobileColor());
				
				List<Sim>sims =mobile.getSims();
				System.out.println("Sim------Details-----");
				for (Sim sim : sims) {
					if(sim!=null) {
						System.out.println("**********************************************");
						System.out.println("simId = "+sim.getSimId());
						System.out.println("simNetworkType = "+sim.getSimNetworkType());
						System.out.println("simOperatorName = "+sim.getSimOperatorNameString());
						System.out.println("simType = "+sim.getSimType());
						System.out.println("***********************************************");
					}
				}
				
			}
		}
	}
}



