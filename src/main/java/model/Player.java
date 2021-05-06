package model;

public class Player {
    
    private static final String ATTACK = "attack";
    private static final String MIDDLE = "middle";
    private static final String DEFENSE = "defense";

    private String name;
    private int height;
    private int weight;
    private String poste;
    
    public Player(String name, int height, int weight, String poste){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.poste = poste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }
}
