package use_case;

import model.Club;
import model.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import use_case.club.ClubRepository;
import use_case.player.PlayerRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeRecommandationTest {
    
    private ClubRepository clubs;
    private PlayerRepository players;
    
    @BeforeEach
    public void init(){
        this.clubs = new FakeClubs();
        this.players = new FakePlayers();
    }
    
    @Test
    public void shouldRecommandPlayer(){
        String playerId = "1";
        String clubId = "1";
        
        MakeRecommandation mr = new MakeRecommandation(clubs, players);
        mr.recommandPlayer(playerId, clubId);
        
        Club club = clubs.findById(clubId);
        Player player = players.findById(playerId);
        System.out.println();
        assertEquals(club.getRecommandedPlayers().get(0).getName(), player.getName());
    }
}
