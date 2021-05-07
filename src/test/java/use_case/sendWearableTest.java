package use_case;

import model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import use_case.recrutement.SessionRepository;
import use_case.wearable.WearableColisRepository;
import use_case.wearable.WearableRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sendWearableTest {

    private SessionRepository sessions;
    private WearableRepository wearables;
    private WearableColisRepository wearableColis;

    @BeforeEach
    public void init(){
        this.sessions = new FakeSessions();
        this.wearables = new FakeWearables();
        this.wearableColis = new FakeWearableColis();
    }

    @Test
    public void shoudReturnWearable() throws Exception {
        String sessionId = "1";
        String wearableId = "1";
        LocalDate dateSent = LocalDate.of(2020, 6,5 );
        Wearable wearable = this.wearables.findById(wearableId);
        Session session = this.sessions.findById(sessionId);


        SendWearable s = new SendWearable(this.wearableColis);
        WearableColis w = s.sendWearablesColis(session);
        System.out.println(w.getWearables());

        assertEquals(w.getWearables().get(0).getType(), "TOP");
        assertEquals(w.getWearables().size(), 2);
        assertEquals(w.getDateSent(), dateSent);

    }
}
