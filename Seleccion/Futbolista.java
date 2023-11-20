package Seleccion;

public class Futbolista extends Seleccion_de_Futbol {

    private int dorsal;
    private String position;
    
    public Futbolista(int id, String name, String lastName, int age, int dorsal, String position) {
        super(id, name, lastName, age);
        this.dorsal = dorsal;
        this.position = position;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void playGame() {

    }

    public void training() {
        System.out.println("Esta entrenando.\n");
    }
}
