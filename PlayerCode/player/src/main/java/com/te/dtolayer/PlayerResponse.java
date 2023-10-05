package com.te.dtolayer;

import org.springframework.beans.factory.annotation.Autowired;

public class PlayerResponse {
	private int statusCode;
	private String message;
	private String discription;

	@Autowired
	private Players player;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Players getPlayer() {
		return player;
	}

	public void setPlayer(Players player) {
		this.player = player;
	}

	public PlayerResponse(int statusCode, String message, String discription, Players player) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.discription = discription;
		this.player = player;
	}

	public PlayerResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

}
