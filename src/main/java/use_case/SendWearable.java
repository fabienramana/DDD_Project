package use_case;

import model.Session;
import model.Wearable;
import model.WearableColis;
import use_case.recrutement.SessionRepository;
import use_case.wearable.WearableColisRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SendWearable {
    private final WearableColisRepository wearables;
    private final SessionRepository sessions;

    public SendWearable(WearableColisRepository wearables, SessionRepository sessions) {
        this.sessions = sessions;
        this.wearables = wearables;
    }


    public WearableColis sendWearablesColis(String sessionId) throws Exception {
        Session session = sessions.findById(sessionId);
        
        WearableColis wearableColis = new WearableColis().createWearableColisFromSession(session);
        
        wearables.save(wearableColis);
        return wearableColis;
    }





}
