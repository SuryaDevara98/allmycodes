package com.te.jpawithhibernatedemo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Room {
	@Id
	private int roomNumber;
	private String ac;
	private int lights;
	private String beds;

	@OneToMany
	List<Tenants> tenants;

	public Room(int roomNumber, String ac, int lights, String beds, List<Tenants> tenants) {
		super();
		this.roomNumber = roomNumber;
		this.ac = ac;
		this.lights = lights;
		this.beds = beds;
		this.tenants = tenants;
	}

	public Room() {
		super();
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getAc() {
		return ac;
	}

	public void setAc(String ac) {
		this.ac = ac;
	}

	public int getLights() {
		return lights;
	}

	public void setLights(int lights) {
		this.lights = lights;
	}

	public String getBeds() {
		return beds;
	}

	public void setBeds(String beds) {
		this.beds = beds;
	}

	public List<Tenants> getTenants() {
		return tenants;
	}

	public void setTenants(List<Tenants> tenants) {
		this.tenants = tenants;
	}

	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", ac=" + ac + ", lights=" + lights + ", beds=" + beds + ", tenants="
				+ tenants + "]";
	}

}
