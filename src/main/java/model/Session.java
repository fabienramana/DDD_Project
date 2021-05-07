package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Session {
	
	private LocalDate date;
	private String status;
	private List<Player> players;
	private List<Scoot> scoots;
	private List<Coach> coaches;
	
	public Session(LocalDate date, List<Player> players, List<Scoot> scoots, List<Coach> coaches, String status) {
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
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	public void addPlayer(Player player){this.players.add(player);}

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public LocalDate getDateToSendWearableColis(){
		return date.minusDays(3);
	}
	
	public int getNumberOfPlayersInSession(){
		return players.size();
	}
	
	public Boolean isMaintained() throws Exception {
		if(status != "Maintenu"){
			throw new Exception("Session non maintenu -> Pas de colis à livrer");
		}
		return true;
	}
}
