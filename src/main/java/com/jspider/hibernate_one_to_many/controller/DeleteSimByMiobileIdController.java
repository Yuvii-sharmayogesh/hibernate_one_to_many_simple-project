package com.jspider.hibernate_one_to_many.controller;

import com.jspider.hibernate_one_to_many.service.MobileSimService;

public class DeleteSimByMiobileIdController {
	public static void main(String[] args) {
		MobileSimService mobileSimService = new MobileSimService();
		
		/*
		 * 1st parameter mobileid.....2nd parameter simId
		 */
		mobileSimService.deleteSimByMobileIdService(234, 456);
	}

}
