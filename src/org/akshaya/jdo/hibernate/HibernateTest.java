package org.akshaya.jdo.hibernate;



import org.akshaya.jdo.dto.UserDetailsClass;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args){
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		
		UserDetailsClass user = (UserDetailsClass)session.get(UserDetailsClass.class,6);
		session.delete(user);
		session.getTransaction().commit();
		session.close();
		
	}
}
