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
		
		for(int i=0;i<10;i++){
			
			UserDetailsClass user = new UserDetailsClass();
			user.setUserName("User"+i);
			session.save(user);
			
		}

		session.getTransaction().commit();
		session.close();
		
	}
}
