package org.akshaya.jdo.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {

	@Id @GeneratedValue
	private int vehicleId;
	private String vehicleName;
	@ManyToOne
	private Collection<UserDetailsClass> userList = new ArrayList<UserDetailsClass>();
	
	public Collection<UserDetailsClass> getUserList() {
		return userList;
	}

	public void setUserList(Collection<UserDetailsClass> userList) {
		this.userList = userList;
	}

	public int getVehicleId() {
		return vehicleId;
	}
	
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
}
