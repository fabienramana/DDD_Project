package use_case;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import model.Coach;
import model.Player;
import model.Scoot;
import model.Session;
import use_case.recrutement.SessionRepository;

public class FakeSessions implements SessionRepository{
	
	
	public Map<String, Session> sessions;
	
	public FakeSessions() {
		sessions = new HashMap<>();
		
		Session juin = new Session();
		LocalDate date = LocalDate.of(2020,6,8);
		juin.setDate(date);
		juin.setStatus("Maintenu");
		Player zidane = new Player("Zidane", 180,80,"milieu");
		juin.addPlayer(zidane);
		sessions.put("1",juin);
	}


	@Override
	public void save(Session session) {
				
	}


	@Override
	public Session findById(String id) {
		return sessions.get(id);
	}
	
	
}
