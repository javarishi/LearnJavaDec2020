package com.h2kinfosys.day11;

import java.sql.Timestamp;

public class ActorTO {
	
	public ActorTO() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "ActorTO [actorId=" + actorId + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdate="
				+ lastUpdate + "]";
	}


	int actorId;
	String firstName = null;
	String lastName = null;
	Timestamp lastUpdate = null;
	/**
	 * @return the actorId
	 */
	public int getActorId() {
		return actorId;
	}
	/**
	 * @param actorId the actorId to set
	 */
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the lastUpdate
	 */
	public Timestamp getLastUpdate() {
		return lastUpdate;
	}
	/**
	 * @param lastUpdate the lastUpdate to set
	 */
	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}
