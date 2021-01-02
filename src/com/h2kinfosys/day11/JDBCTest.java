package com.h2kinfosys.day11;

public class JDBCTest {

	public static void main(String[] args) {
		ActorDAO actorDAO = new ActorDAO();
		try {
			actorDAO.getActors();
			//actorDAO.getActorWithId(200);
			// actorDAO.getActorWithIdAndFirstName(100, "A");
			/*
			 * ActorTO actor = new ActorTO(); actor.setActorId(209);
			 * actor.setFirstName("NEIL"); actor.setLastName("ARMSTRONG");;
			 * actorDAO.updateActor(actor);
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
