package use_case;

import java.util.HashMap;
import java.util.Map;

import model.Coach;
import use_case.recrutement.CoachRepository;

public class FakeCoaches implements CoachRepository{

	public Map<String, Coach> coaches;
	
	public FakeCoaches() {
		coaches = new HashMap<>();
		
		Coach gregory = new Coach("Gregory");
		coaches.put("1",gregory);
	}

	@Override
	public Coach findById(String id) {
		return coaches.get(id);
	}
}
