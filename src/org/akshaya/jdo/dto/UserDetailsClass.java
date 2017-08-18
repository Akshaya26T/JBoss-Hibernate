package org.akshaya.jdo.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;



//Data Model Class - Entity class

@Entity
@NamedQuery(name="UserDetailsClass.byId", query = "from UserDetailsClass where userId = ?")
@NamedNativeQuery(name="UserDetailsClass.byName", query ="select * from UserDetailsClass where userName =?", resultClass=UserDetailsClass.class)
public class UserDetailsClass {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	

	
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
