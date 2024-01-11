package com.jspider.hibernate_one_to_many.dao;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.hibernate_one_to_many.dto.Mobile;
import com.jspider.hibernate_one_to_many.dto.Sim;


public class MobileSimDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("yogesh");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	/*
	 * Mobile SIM insert method
	 */
	public Mobile saveMobileSimDao(Mobile mobile, List<Sim> sims) {
		entityTransaction.begin();
		entityManager.persist(mobile);
		for (Sim sim : sims) {
			entityManager.persist(sim);	
		}
		entityTransaction .commit();
		return mobile;
	}
	/*
	 * 
	 */
	public Mobile getMobileSimByMobileIdDao(int mobileId) {
		return entityManager.find(Mobile.class, mobileId);
	}
	/*
	 * Display
	 */
	public java.util.List<Mobile> getAllMobileSimDao(){
		return entityManager.createQuery("FROM Mobile").getResultList();
	}
	/*
	 * Delete sim by mobile Id
	 */
	public void deleteSimByMobileIdDao(int mobileId,int simId) {
		
	Mobile mobile=getMobileSimByMobileIdDao(mobileId);
	
	if(mobile!=null) {
		
		List<Sim> sims =mobile.getSims();
		
		for (Sim sim : sims) {
			if((sim!=null)&&(sim.getSimId()==simId)) {
				
				entityTransaction.begin();
				entityManager.remove(sim);
				entityTransaction.commit();
			}
			
		}
	}else {
		System.out.println("id is not present");
		}
	}

}
