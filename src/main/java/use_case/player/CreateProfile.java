package use_case.player;

import model.Player;

public class CreateProfile {
    
    public Player createPlayerProfile(String name, int height, int weight, String poste){
        return new Player(name, height, weight, poste);
    }
}
