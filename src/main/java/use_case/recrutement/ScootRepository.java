package use_case.recrutement;

import model.Scoot;

public interface ScootRepository {
	Scoot findById(String id);
	
}
