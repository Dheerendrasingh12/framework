package com.dheerendra.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SessionImplementor ses, Object object) throws HibernateException {
		
		try {
			Connection con=ses.connection();
			PreparedStatement ps=con.prepareStatement("select Lucky_Draw_Sequence.nextVal from dual ");
			ResultSet rs=ps.executeQuery();
			System.out.println("after sequence");
			int val=0;
			if(rs.next()) {
				val=rs.getInt(1);
			}
			if(val<10) {
				return "TM00"+val;
			}
			else if(val<100) {
				return "TM0"+val;
			}else {
				return "TM"+val;
			}
			
			
		}catch(SQLException se) {
		se.printStackTrace();
			return "failed to generated id value";
		}
		
	}

}
