package use_case;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Coach;
import model.Player;
import model.Scoot;
import model.Session;
import use_case.player.PlayerRepository;
import use_case.recrutement.CoachRepository;
import use_case.recrutement.OrganizeRecruitementSession;
import use_case.recrutement.ScootRepository;
import use_case.recrutement.SessionRepository;

public class OrganizeRecruitementSessionTest {
	
	private SessionRepository sessions;
	private ScootRepository scoots;
	private CoachRepository coaches;
	private PlayerRepository players;

	@BeforeEach
    public void init(){
        this.sessions = new FakeSessions();
        this.coaches = new FakeCoaches();
        this.scoots = new FakeScoots();
        this.players = new FakePlayers();
    }
	
	@Test
	public void shouldReturnSession() {
		String coachId = "1";
        String playerId = "1";
        String scootId = "1";
		
		String date = "28/06/2021 12h";
		Coach coach = this.coaches.findById(coachId);
		Scoot scoot = this.scoots.findById(scootId);
		Player player = this.players.findById(playerId);
		
		List<Player> players = new ArrayList<>();
		players.add(player);
		List<Coach> coaches = new ArrayList<>();
		coaches.add(coach);
		List<Scoot> scoots = new ArrayList<>();
		scoots.add(scoot);
	

		OrganizeRecruitementSession o = new OrganizeRecruitementSession(sessions);
		Session s = o.OrganizeSession(date, players, scoots, coaches);
		
		assertEquals(s.getPlayers().get(0).getName(), player.getName());
	}
}
