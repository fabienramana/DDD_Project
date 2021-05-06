package use_case;

import model.Club;
import model.Player;
import use_case.club.ClubRepository;
import use_case.player.PlayerRepository;

public class MakeRecommandation {

    private final ClubRepository clubs;
    private final PlayerRepository players;
    
    public MakeRecommandation(ClubRepository clubs, PlayerRepository players){
        this.clubs = clubs;
        this.players = players;
    }
    
    
    public void recommandPlayer(String playerId, String clubId){
        Club club = clubs.findById(clubId);
        Player player = players.findById(playerId); 
        
        club.addRecommendedPlayer(player);
        
        clubs.save(club);
    }
}
