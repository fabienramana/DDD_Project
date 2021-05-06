package use_case;

import model.Wearable;
import model.WearableColis;
import use_case.wearable.WearableColisRepository;

import java.util.HashMap;
import java.util.Map;

public class FakeWearableColis implements WearableColisRepository {
    Map<String, WearableColis> wearableColis;

    public FakeWearableColis() {
        wearableColis = new HashMap<>();
    }

    public WearableColis findById(String id) {
        return wearableColis.get(id);
    }

    @Override
    public void save(WearableColis wearableColis) {

    }


}
