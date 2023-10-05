package com.te.daolayer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.dtolayer.Players;

@Repository
public class PlayersDAOImpl implements PlayersDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("players");

	@Override
	public boolean addPlayer(Players player) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isInserted = false;
		try {
			transaction.begin();
			manager.persist(player);
			transaction.commit();
			isInserted = true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return isInserted;
	}

	@Override
	public boolean updatePlayer(Players newPlayer) {
		boolean isUpdated = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		Players player = manager.find(Players.class, newPlayer.getJersyId());
		try {
			if (player.getName() != null && player.getName() != "") {
				player.setName(newPlayer.getName());
			}
			if (player.getSportName() != null && player.getSportName() != "") {
				player.setSportName(newPlayer.getSportName());
			}
			trans.commit();

			isUpdated = true;

		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}

		return isUpdated;
	}

	@Override
	public Players fetchPlayer(int jersyId) {

		EntityManager manager = factory.createEntityManager();
		Players myPlayers = manager.find(Players.class, jersyId);
		return myPlayers;
	}

	@Override
	public boolean deletePlayer(int jersyId) {
		boolean isDeleted = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();

		Players myPlayers = manager.find(Players.class, jersyId);
		try {
			trans.begin();
			manager.remove(myPlayers);
			trans.commit();
			isDeleted = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isDeleted;
	}

}
