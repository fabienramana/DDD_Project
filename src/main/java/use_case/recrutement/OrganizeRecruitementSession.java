package use_case.recrutement;

import java.time.LocalDate;
import java.util.List;

import model.Coach;
import model.Player;
import model.Scoot;
import model.Session;

public class OrganizeRecruitementSession {

	private final SessionRepository sessions;
	
	public OrganizeRecruitementSession(SessionRepository sessions) {
		this.sessions = sessions;
	}
	
	public Session OrganizeSession(String date, List<Player> players, List<Scoot> scoots, List<Coach> coaches, String status) {
		Session session = new Session(date, players, scoots, coaches, status);
		return session;
	}
}
