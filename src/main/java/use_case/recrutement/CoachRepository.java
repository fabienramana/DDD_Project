package use_case.recrutement;

import model.Coach;

public interface CoachRepository {
	Coach findById(String id);

}
