package use_case.club;

import model.Club;
        
public interface ClubRepository {
    Club findById(String id);
    void save(Club club);
}
