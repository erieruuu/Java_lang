package Seleccion;

public class Tecnico extends Seleccion_de_Futbol {
    
    private String titulation;
    private int expAge;
    
    public Tecnico(int id, String name, String lastName, int age, String titulation, int expAge) {
        super(id, name, lastName, age);
        this.titulation = titulation;
        this.expAge = expAge;
    }

    public String getTitulation() {
        return titulation;
    }

    public void setTitulation(String titulation) {
        this.titulation = titulation;
    }

    public int getExpAge() {
        return expAge;
    }

    public void setExpAge(int expAge) {
        this.expAge = expAge;
    }

    public void createStrategy() {

    }

    public void createPrograms() {

    }
}
