package com.te.jpawithhibernatemanytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class WifiRouters {

	@Id
	private int routerId;
	private String model;
	private String service;
	private double speed;

	@ManyToMany
	private List<WifiUsers> users;

	public WifiRouters(int routerId, String model, String service, double speed, List<WifiUsers> users) {
		super();
		this.routerId = routerId;
		this.model = model;
		this.service = service;
		this.speed = speed;
		this.users = users;
	}

	public WifiRouters() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRouterId() {
		return routerId;
	}

	public void setRouterId(int routerId) {
		this.routerId = routerId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public List<WifiUsers> getUsers() {
		return users;
	}

	public void setUsers(List<WifiUsers> users) {
		this.users = users;
	}

}
