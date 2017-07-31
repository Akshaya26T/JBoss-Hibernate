package org.akshaya.jdo.hibernate;

import java.util.Date;

import org.akshaya.jdo.dto.UserDetailsClass;
import org.akshaya.jdo.dto.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args){
		
		UserDetailsClass user = new UserDetailsClass();
		Address addr1=new Address();
		addr1.setCity("Pondy");
		addr1.setCountry("India");
		addr1.setState("TN");
		addr1.setStreet("Pondy steert");
		addr1.setZip(98725);
		
		user.setJoinDate(new Date());
		user.setUserName("Thirusangu");
		user.setDescription("Man");
		
		Address addr2=new Address();
		addr2.setCity("mumbai");
		addr2.setCountry("India");
		addr2.setState("maharashtra");
		addr2.setStreet("mumbai steert");
		addr2.setZip(98785);
		
		user.getListOfAddresses().add(addr1);
		user.getListOfAddresses().add(addr2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
	}
}
