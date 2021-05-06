package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Session {
	
	private String date;
	private String status;
	private List<Player> players;
	private List<Scoot> scoots;
	private List<Coach> coaches;
	
	public Session(String date, List<Player> players, List<Scoot> scoots, List<Coach> coaches, String status) {
		super();
		this.date = date;
		this.status = status;
		this.players = players;
		this.scoots = scoots;
		this.coaches = coaches;

	}

	public Session() {
		players = new ArrayList<>();
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public List<Scoot> getScoots() {
		return scoots;
	}

	public void setScoots(List<Scoot> scoots) {
		this.scoots = scoots;
	}

	public List<Coach> getCoaches() {
		return coaches;
	}

	public void setCoaches(List<Coach> coaches) {
		this.coaches = coaches;
	}
	
	

}
