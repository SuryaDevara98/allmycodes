package com.te.jpawithhibernatedemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Tenants {
	@Id
	private int aadharNumber;
	private String name;
	private String gender;
	private int mob;

	@ManyToOne
	private Room room;

	public Tenants(int aadharNumber, String name, String gender, int mob, Room room) {
		super();
		this.aadharNumber = aadharNumber;
		this.name = name;
		this.gender = gender;
		this.mob = mob;
		this.room = room;
	}

	public Tenants() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMob() {
		return mob;
	}

	public void setMob(int mob) {
		this.mob = mob;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "Tenants [aadharNumber=" + aadharNumber + ", name=" + name + ", gender=" + gender + ", mob=" + mob
				+ ", room=" + room + "]";
	}

}
