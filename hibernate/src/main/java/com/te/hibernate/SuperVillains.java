package com.te.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SuperVillains {
	@Id
	private String villiansName;
	private String villiansWeapon;
	private int villianspower;

	public SuperVillains(String villiansName, String villiansWeapon, int villianspower) {
		super();
		this.villiansName = villiansName;
		this.villiansWeapon = villiansWeapon;
		this.villianspower = villianspower;
	}

	private String getVilliansName() {
		return villiansName;
	}

	private void setVilliansName(String villiansName) {
		this.villiansName = villiansName;
	}

	private String getVilliansWeapon() {
		return villiansWeapon;
	}

	private void setVilliansWeapon(String villiansWeapon) {
		this.villiansWeapon = villiansWeapon;
	}

	private int getVillianspower() {
		return villianspower;
	}

	private void setVillianspower(int villianspower) {
		this.villianspower = villianspower;
	}

	@Override
	public String toString() {
		return "SuperVillains [villiansName=" + villiansName + ", villiansWeapon=" + villiansWeapon + ", villianspower="
				+ villianspower + "]";
	}

}
