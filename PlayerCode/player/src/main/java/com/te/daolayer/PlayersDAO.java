package com.te.daolayer;

import com.te.dtolayer.Players;

public interface PlayersDAO {

	public boolean addPlayer(Players player);

	public boolean updatePlayer(Players player);

	public Players fetchPlayer(int jersyid);

	public boolean deletePlayer(int jersyid);

}
