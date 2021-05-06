package use_case;

import model.Session;
import model.Wearable;
import model.WearableColis;
import use_case.wearable.WearableColisRepository;

import java.time.LocalDate;
import java.util.List;

public class SendWearable {
    private final WearableColisRepository wearables;

    public SendWearable(WearableColisRepository wearables) {
        this.wearables = wearables;
    }


    public WearableColis sendWearablesColis(List<Wearable> wearables, LocalDate dateSent, LocalDate dateReceived, Session session){
        WearableColis wearableColis = new WearableColis(wearables, dateSent, dateReceived, session);
        return wearableColis;
    }





}
