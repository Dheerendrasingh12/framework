package com.dheerendra.generator;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SessionImplementor arg0, Object arg1) throws HibernateException {
	int id=0;
	Random rad=null;
	rad=new Random();
	id=rad.nextInt(10);
	return "TM00"+id;
		
	}

}
