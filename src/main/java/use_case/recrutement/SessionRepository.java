package use_case.recrutement;

import model.Session;

public interface SessionRepository {
	Session findById(String id);
	void save(Session session);
	

}
