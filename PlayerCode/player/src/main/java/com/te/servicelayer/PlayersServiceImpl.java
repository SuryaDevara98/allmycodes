package com.te.servicelayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.daolayer.PlayersDAO;
import com.te.dtolayer.Players;

@Service
public class PlayersServiceImpl implements PlayersService {

	@Autowired
	private PlayersDAO dao;

	@Override
	public boolean addPlayer(Players player) {
		return dao.addPlayer(player);
	}

	@Override
	public boolean updatePlayer(Players player) {
		return dao.updatePlayer(player);
	}

	@Override
	public boolean deletePlayer(int jersyid) {
		return dao.deletePlayer(jersyid);
	}

	@Override
	public Players fetchPlayer(int jersyid) {
		return dao.fetchPlayer(jersyid);
	}

}
