package use_case.player;

import model.Player;

public class CreateProfile {

    private final PlayerRepository players;
    
    public CreateProfile(PlayerRepository players){
        this.players = players;
    }
    
    public Player createPlayerProfile(String name, int height, int weight, String poste){
        Player player = new Player(name, height, weight, poste);
        players.save(player);
        return player;
    }
}
