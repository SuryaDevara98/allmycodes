package com.te.servicelayer;

import com.te.dtolayer.Players;

public interface PlayersService {

	public boolean addPlayer(Players player);

	public boolean updatePlayer(Players player);

	public Players fetchPlayer(int jersyid);

	public boolean deletePlayer(int jersyid);

}
