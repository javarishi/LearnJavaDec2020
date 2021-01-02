package com.h2kinfosys.day11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ActorDAO {

	// CRUD Operation for Actor Table
	static String sqlQuery = "select * from actor";
	static String sqlQuery_where = "select * from actor where actor_id = ?";
	static String sqlQuery_firstName = "select * from actor where actor_id > ? and first_name like ?";
	
	static String insert_actor = "INSERT INTO actor (first_name, last_name, last_update) VALUES (?, ?, CURRENT_TIMESTAMP)";
	static String update_actor = "UPDATE actor SET  first_name = ?, last_name = ?, last_update = CURRENT_TIMESTAMP WHERE actor_id = ?";
	
	// Please add DeleteActor method
	
	
	public boolean updateActor(ActorTO actor) throws Exception {
		Connection conn = null;
		boolean successFlag = false;
		try {
			conn = ConnectionUtil.getConnection();
			PreparedStatement pStat = conn.prepareStatement(update_actor);
			pStat.setString(1, actor.getFirstName());
			pStat.setString(2, actor.getLastName());
			pStat.setInt(3, actor.getActorId());
			// INSERT, UPDATE or DELETE
			int numberOfRowsAffectedbyQuery = pStat.executeUpdate();
			if(numberOfRowsAffectedbyQuery > 0) {
				successFlag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}finally {
			ConnectionUtil.closeConnection(conn);
		}
		return successFlag;
	}
	
	
	public boolean createActor(ActorTO actor) throws Exception {
		Connection conn = null;
		boolean successFlag = false;
		try {
			conn = ConnectionUtil.getConnection();
			PreparedStatement pStat = conn.prepareStatement(insert_actor);
			pStat.setString(1, actor.getFirstName());
			pStat.setString(2, actor.getLastName());
			// INSERT, UPDATE or DELETE
			int numberOfRowsAffectedbyQuery = pStat.executeUpdate();
			if(numberOfRowsAffectedbyQuery > 0) {
				successFlag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}finally {
			ConnectionUtil.closeConnection(conn);
		}
		return successFlag;
	}
	
	
	public List<ActorTO> getActors() throws Exception {
		ArrayList<ActorTO> actors = new ArrayList<ActorTO>();
		Connection conn = null;
		try {
			conn = ConnectionUtil.getConnection();
			Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stat.executeQuery(sqlQuery);
			if(rs != null) {
				ActorTO actor = null;
				while(rs.next()) {
					actor = new ActorTO();
					int actorId = rs.getInt("actor_id");
					if(actorId == 209) {
						rs.updateString("first_name", "RISHI");
						rs.updateRow();
						rs.refreshRow();
					}
					actor.setActorId(rs.getInt("actor_id"));
					actor.setFirstName(rs.getString("first_name"));
					actor.setLastName(rs.getString("last_name"));
					actor.setLastUpdate(rs.getTimestamp("last_update"));
					System.out.println(actor);
					actors.add(actor);
					//rs.relative(10);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}finally {
			ConnectionUtil.closeConnection(conn);
		}
		return actors;
	}
	
	
	
	public List<ActorTO> getActorWithId(int actorId) throws Exception {
		ArrayList<ActorTO> actors = new ArrayList<ActorTO>();
		Connection conn = null;
		try {
			conn = ConnectionUtil.getConnection();
			PreparedStatement pStat = conn.prepareStatement(sqlQuery_where);
			pStat.setInt(1, actorId);
			ResultSet rs = pStat.executeQuery();
			if(rs != null) {
				ActorTO actor = null;
				while(rs.next()) {
					actor = new ActorTO();
					actor.setActorId(rs.getInt("actor_id"));
					actor.setFirstName(rs.getString("first_name"));
					actor.setLastName(rs.getString("last_name"));
					actor.setLastUpdate(rs.getTimestamp("last_update"));
					System.out.println(actor);
					actors.add(actor);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}finally {
			ConnectionUtil.closeConnection(conn);
		}
		return actors;
	}
	
	public List<ActorTO> getActorWithIdAndFirstName(int actorId, String firstName) throws Exception {
		ArrayList<ActorTO> actors = new ArrayList<ActorTO>();
		Connection conn = null;
		try {
			conn = ConnectionUtil.getConnection();
			PreparedStatement pStat = conn.prepareStatement(sqlQuery_firstName);
			pStat.setInt(1, actorId);
			pStat.setString(2, firstName+ "%");
			ResultSet rs = pStat.executeQuery();
			if(rs != null) {
				ActorTO actor = null;
				while(rs.next()) {
					actor = new ActorTO();
					actor.setActorId(rs.getInt("actor_id"));
					actor.setFirstName(rs.getString("first_name"));
					actor.setLastName(rs.getString("last_name"));
					actor.setLastUpdate(rs.getTimestamp("last_update"));
					System.out.println(actor);
					actors.add(actor);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}finally {
			ConnectionUtil.closeConnection(conn);
		}
		return actors;
	}
	
}
