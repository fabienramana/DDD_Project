package model;

import java.util.ArrayList;
import java.util.List;

public class Club {
    private String name;
    private List<Player> recommandedPlayers;
    
    public Club(){
        this.recommandedPlayers = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getRecommandedPlayers() {
        return recommandedPlayers;
    }
    
    public void addRecommendedPlayer(Player player){
        recommandedPlayers.add(player);
    }
    
    public void removeRecommandedPlayer(Player player){
        recommandedPlayers.remove(player);
    }

}
