package use_case;

import java.util.HashMap;
import java.util.Map;

import model.Scoot;
import use_case.recrutement.ScootRepository;

public class FakeScoots implements ScootRepository{

public Map<String, Scoot> scoots;
	
	public FakeScoots() {
		scoots = new HashMap<>();
		
		Scoot gregory = new Scoot("Gregory");
		scoots.put("1",gregory);
	}

	@Override
	public Scoot findById(String id) {
		return scoots.get(id);
	}
}
