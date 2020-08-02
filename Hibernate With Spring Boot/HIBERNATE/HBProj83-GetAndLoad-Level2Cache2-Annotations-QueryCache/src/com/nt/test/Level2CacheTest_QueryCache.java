package com.nt.test;

import java.util.List;

import org.hibernate.Cache;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nt.domain.InsurancePolicy;

public class Level2CacheTest_QueryCache {

	public static void main(String[] args) {
		SessionFactory factory=null;
		Session ses=null;
		InsurancePolicy policy=null;
		Query query=null;
		List<InsurancePolicy> list=null;
		//get Session object
		factory=new Configuration().configure("/com/nt/cfgs/hibernate.cfg.xml").buildSessionFactory();
		//get SEssion
		ses=factory.openSession();
        //prepare Query
		query=ses.createQuery("from InsurancePolicy");
		query.setCacheable(true);
		//query.setCacheRegion("region1");
		
		list=query.list();
		list.forEach(ip->{
			System.out.println(ip.getPolicyId()+"  "+ip.getPolicyName()+" "+ip.getPremium()+" "+ip.getTenure());
		});
		
		ses.clear();
		
		System.out.println("-------------------------");
		list=query.list();
		list.forEach(ip->{
			System.out.println(ip.getPolicyId()+"  "+ip.getPolicyName()+" "+ip.getPremium()+" "+ip.getTenure());
		});
		ses.clear();
		
		try{
		Thread.sleep(3000);
		}
		catch(Exception e){ e.printStackTrace(); }
		
		System.out.println("-------------------------");
		list=query.list();
		list.forEach(ip->{
			System.out.println(ip.getPolicyId()+"  "+ip.getPolicyName()+" "+ip.getPremium()+" "+ip.getTenure());
		});
		ses.clear();
		Cache cache=factory.getCache();
		cache.evictDefaultQueryRegion();
		System.out.println("-------------------------");
		list=query.list();
		list.forEach(ip->{
			System.out.println(ip.getPolicyId()+"  "+ip.getPolicyName()+" "+ip.getPremium()+" "+ip.getTenure());
		});
		
		//close objs
		ses.close();
		factory.close();
	}//main
}//class
