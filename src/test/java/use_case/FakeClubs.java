package use_case;

import model.Club;
import use_case.club.ClubRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FakeClubs implements ClubRepository {
    Map<String, Club> clubs;

    public FakeClubs() {
        clubs = new HashMap<>();

        Club paris = new Club();
        paris.setName("psg");
        clubs.put("1", paris);

        Club lyon = new Club();
        lyon.setName("lyon");
        clubs.put("2", lyon);

        Club marseille = new Club();
        marseille.setName("marseille");
        clubs.put("3", marseille);

    }

    @Override
    public Club findById(String clubId) {
        return clubs.get(clubId);
    }
    
    @Override
    public void save(Club club){
        
    }
}
