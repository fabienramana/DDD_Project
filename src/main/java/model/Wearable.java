package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Wearable {
    private String id;
    private String type;

    public Wearable (String id, String type){
        this.id = id;
        this.type = type;
    }
    
    public Wearable(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public List<Wearable> getWearablesForSession(int numberOfPlayers){
        List<Wearable> wearablesToSend = new ArrayList<>();

        for(int i = 0; i<numberOfPlayers*2; i++){
            if(i%2 == 0){
                Wearable wearableTop = new Wearable(String.valueOf(i), "TOP");
                wearablesToSend.add(wearableTop);
            }
            else{
                Wearable wearableBot = new Wearable(String.valueOf(i), "BOTTOM");
                wearablesToSend.add(wearableBot);
            }
        }
        return wearablesToSend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wearable wearable = (Wearable) o;
        return Objects.equals(id, wearable.id) &&
                Objects.equals(type, wearable.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type);
    }
}
