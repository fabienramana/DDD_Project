package use_case.wearable;

import model.Wearable;

public interface WearableRepository {
    Wearable findById(String id);
    void save(Wearable player);
}
