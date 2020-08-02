package com.dheerendra.utility;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MysqlHibernateUtil {
	private static SessionFactory factory;

	static {
		Configuration cfg = null;
		try {
			cfg = new Configuration();
			cfg = cfg.configure("com/dheerendra/cfgs/mysql-hibernate.cfg.xml");
			if (cfg != null)
				factory = cfg.buildSessionFactory();

		} catch (HibernateException he) {
			// TODO: handle exception
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}

	}

	public static void closeSeesionFactory() {
		if (factory != null)
			factory.close();

	}

	public static Session getSession() {
		Session ses = null;
		if (factory != null)
			ses = factory.openSession();
		return ses;
	}
	
	public static void closeSession(Session ses) {
		if(ses!=null)
		ses.close();
	}

}
