package use_case.player;

import model.Player;

public interface PlayerRepository {
    Player findById(String id);
}
