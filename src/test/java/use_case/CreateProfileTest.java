package use_case;

import model.Player;
import org.junit.jupiter.api.Test;
import use_case.player.CreateProfile;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateProfileTest {
    @Test
    public void shouldReturnPlayer(){
        String name = "Greg";
        int height = 190;
        int weight = 80;
        String poste = "milieu offensif gauche";

        CreateProfile cp = new CreateProfile();
        Player player = cp.createPlayerProfile(name, height, weight, poste);
        assertEquals(player.getName(), name);
    }
}
