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

        Player zidane = new Player("Zidane", 180,80,"milieu");
        players.put("1", zidane);

        Player henry = new Player("Henry", 185,85,"attaquant");
        henry.setName("Henry");
        players.put("2", henry);

        Player neymar = new Player("Neymar", 175,70,"milieu");
        neymar.setName("Neymar");
        players.put("3", neymar);

    }

    @Override
    public Player findById(String playerId) {
        return players.get(playerId);
    }
    
    @Override
    public void save(Player player){
        
    }
}
