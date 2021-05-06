package use_case;

import model.Wearable;
import use_case.wearable.WearableRepository;

import java.util.HashMap;
import java.util.Map;

public class FakeWearables implements WearableRepository {

    Map<String, Wearable> wearables;

    public FakeWearables() {
        wearables = new HashMap<>();
        Wearable wearable1 = new Wearable("1", "Haut");
        Wearable wearable2 = new Wearable("1", "Haut");
        wearables.put("1" ,wearable1 );
        wearables.put("2" ,wearable2 );
    }

    @Override
    public Wearable findById(String id) {
        return wearables.get(id);
    }

    @Override
    public void save(Wearable wearable) {

    }
}
