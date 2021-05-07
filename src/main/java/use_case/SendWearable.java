package use_case;

import model.Session;
import model.Wearable;
import model.WearableColis;
import use_case.wearable.WearableColisRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SendWearable {
    private final WearableColisRepository wearables;

    public SendWearable(WearableColisRepository wearables) {
        this.wearables = wearables;
    }


    public WearableColis sendWearablesColis(Session session) throws Exception {
        if(session.getStatus() != "Maintenu"){
            throw new Exception("Session non maintenu -> Pas de colis à livrer");
        }
        
        LocalDate dateReceived = session.getDate();
        LocalDate dateSent = dateReceived.minusDays(3);
        int numberOfWearables =  session.getPlayers().size();
        List<Wearable> wearablesToSend = new ArrayList<>();
        System.out.println(numberOfWearables);
        
        for(int i = 0; i<numberOfWearables*2; i++){
            if(i%2 == 0){
                Wearable wearableTop = new Wearable(String.valueOf(i), "TOP");
                wearablesToSend.add(wearableTop);
            }
            else{
                Wearable wearableBot = new Wearable(String.valueOf(i), "BOTTOM");
                wearablesToSend.add(wearableBot);
            }
        }

        System.out.println(wearablesToSend);
        WearableColis wearableColis = new WearableColis(wearablesToSend, dateSent, dateReceived, session);
        wearables.save(wearableColis);
        return wearableColis;
    }





}
