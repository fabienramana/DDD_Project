package use_case;

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
		juin.setDate("01/06/2021");
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
