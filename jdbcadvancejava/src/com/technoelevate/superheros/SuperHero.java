package com.technoelevate.superheros;

public class SuperHero {

	private int superId;
	private String superName;
	private String superPower;
	private String weapon;

	public SuperHero(int superId, String superName, String superPower, String weapon) {
		super();
		this.superId = superId;
		this.superName = superName;
		this.superPower = superPower;
		this.weapon = weapon;
	}

	public int getSuperId() {
		return superId;
	}

	public void setSuperId(int superId) {
		this.superId = superId;
	}

	public String getSuperName() {
		return superName;
	}

	public void setSuperName(String superName) {
		this.superName = superName;
	}

	public String getSuperPower() {
		return superPower;
	}

	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "SuperHero [superId=" + superId + ", superName=" + superName + ", superPower=" + superPower + ", weapon="
				+ weapon + "]";
	}

}
