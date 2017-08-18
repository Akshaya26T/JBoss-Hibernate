package org.akshaya.jdo.hibernate;

import java.util.List;

import org.akshaya.jdo.dto.UserDetailsClass;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HibernateTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		
		
		Query query =session.getNamedQuery("UserDetailsClass.byName");
		query.setString(0,"user10");
		
		
		List<UserDetailsClass> users = (List<UserDetailsClass>) query.list();
		session.getTransaction().commit();
		session.close();
		
		for(UserDetailsClass u:users){
			System.out.println(u.getUserName());
		}
		
	}
}
