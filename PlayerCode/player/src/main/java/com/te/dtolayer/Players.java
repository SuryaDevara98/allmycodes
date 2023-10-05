package com.te.dtolayer;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonRootName;

@Entity
@JsonRootName("players")
public class Players implements Serializable {
	@Id
	private int jersyId;
	private String name;
	private String sportName;
	private String country;

	public Players(int jersyId, String name, String sportName, String country) {
		super();
		this.jersyId = jersyId;
		this.name = name;
		this.sportName = sportName;
		this.country = country;
	}

	public Players() {
		super();
	}

	public int getJersyId() {
		return jersyId;
	}

	public void setJersyId(int jersyId) {
		this.jersyId = jersyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
