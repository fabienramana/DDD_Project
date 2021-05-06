package use_case;

import model.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import use_case.player.CreateProfile;
import use_case.player.PlayerRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateProfileTest {
    private PlayerRepository players;

    @BeforeEach
    public void init(){
        this.players = new FakePlayers();
    }


    @Test
    public void shouldReturnPlayer(){
        String name = "Greg";
        int height = 190;
        int weight = 80;
        String poste = "milieu offensif gauche";

        CreateProfile cp = new CreateProfile(players);
        Player player = cp.createPlayerProfile(name, height, weight, poste);
        assertEquals(player.getName(), name);
    }
}
