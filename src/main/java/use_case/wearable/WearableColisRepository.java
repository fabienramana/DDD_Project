package use_case.wearable;

import model.WearableColis;

public interface WearableColisRepository {

    WearableColis findById(String id);
    void save(WearableColis wearableColis);
}
