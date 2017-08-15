package org.akshaya.jdo.hibernate;



import org.akshaya.jdo.dto.UserDetailsClass;
import org.akshaya.jdo.dto.Vehicle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args){
		
		UserDetailsClass user = new UserDetailsClass();
		user.setUserName("Thirusangu");
		
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setVehicleName("Mercedes");
		
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("Jet");
		
		user.getVehicle().add(vehicle1);
		user.getVehicle().add(vehicle2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle1);
		session.save(vehicle2);
		session.getTransaction().commit();
		session.close();
		
	}
}
