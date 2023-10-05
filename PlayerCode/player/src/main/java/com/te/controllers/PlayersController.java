package com.te.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.dtolayer.PlayerResponse;
import com.te.dtolayer.Players;
import com.te.servicelayer.PlayersService;

@RestController
public class PlayersController {

	@Autowired
	private PlayersService service;

	@PostMapping(path = "/addplayer", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public PlayerResponse addPlayer(@RequestBody Players player) {
		PlayerResponse responce = new PlayerResponse();

		if (service.addPlayer(player)) {
			responce.setStatusCode(200);
			responce.setMessage("success");
			responce.setDiscription("Hello Mr." + player.getName() + "   your details are added successfully");
		} else {
			responce.setStatusCode(100);
			responce.setMessage("falied");
			responce.setDiscription("Hello Mr." + player.getName()
					+ "your details are not added successfully. Please try some other time!!!");
		}

		return responce;

	}

	@PutMapping(path = "/update", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public PlayerResponse updateMyPlayer(@RequestBody Players player) {

		PlayerResponse response = new PlayerResponse();
		if (service.updatePlayer(player)) {
			response.setStatusCode(200);
			response.setMessage("Successfull");
			response.setDiscription("Player with Jersey Number: " + player.getJersyId() + " updated successfully");
		} else {
			response.setStatusCode(400);
			response.setMessage("Failed");
			response.setDiscription("Player with Jersey Number: " + player.getJersyId() + " failed to update");
		}
		return response;
	}

	@GetMapping(path = "/get/{jersyid}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public PlayerResponse fetchPlayer(@PathVariable("jersyid") int jersyid) {
		PlayerResponse response = new PlayerResponse();
		Players myPlayer = service.fetchPlayer(jersyid);
		if (myPlayer != null) {
			response.setStatusCode(200);
			response.setMessage("Successfull");
			response.setDiscription("Below are the details of the player you are looking for:");
			response.setPlayer(myPlayer);
		} else {
			response.setStatusCode(400);
			response.setMessage("Failed");
			response.setDiscription("Unable to fetch the data of the player with Jersey number : " + jersyid);
		}

		return response;
	}

	@DeleteMapping(path = "/delete/{jno}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public PlayerResponse deletePlayer(@PathVariable("jno") int jersyid) {
		PlayerResponse response = new PlayerResponse();
		if (service.deletePlayer(jersyid)) {
			response.setStatusCode(200);
			response.setMessage("Successfull");
			response.setDiscription("Player with Jerysey Number : " + jersyid + " was fired!!");

		} else {
			response.setStatusCode(400);
			response.setMessage("Failed");
			response.setDiscription(
					"Unable to delete the player with Jersey Number : " + jersyid + ". Please try cheiu tarwata");
		}

		return response;
	}

}
