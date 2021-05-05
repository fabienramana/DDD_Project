package use_case;

import model.Club;
import model.Player;
import use_case.player.PlayerRepository;

import java.util.HashMap;
import java.util.Map;

public class FakePlayers implements PlayerRepository {
    Map<String, Player> players;

    public FakePlayers() {
        players = new HashMap<>();

        Player zidane = new Player();
        zidane.setName("Zidane");
        players.put("1", zidane);

        Player henry = new Player();
        henry.setName("Henry");
        players.put("2", henry);

        Player neymar = new Player();
        neymar.setName("Neymar");
        players.put("3", neymar);

    }

    @Override
    public Player findById(String playerId) {
        return players.get(playerId);
    }
}
