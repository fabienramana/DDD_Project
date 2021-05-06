package use_case.player;

import model.Club;
import model.Player;

public interface PlayerRepository {
    Player findById(String id);
    void save(Player player);
}
