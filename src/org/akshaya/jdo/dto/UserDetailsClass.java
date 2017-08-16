package org.akshaya.jdo.dto;

import org.akshaya.jdo.dto.Vehicle;
import java.util.ArrayList;
import java.util.Collection;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;

import javax.persistence.Table;

//Data Model Class - Entity class

@Entity
@Table (name ="USER_DETAILS")
public class UserDetailsClass {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	
	@ManyToMany
    Collection<Vehicle> vehicle =new ArrayList<Vehicle>();

	
	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	
	public int getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
