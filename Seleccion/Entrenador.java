package Seleccion;

public class Entrenador extends Seleccion_de_Futbol {
    
    private String idFederation;
    
    public Entrenador(int id, String idFederation, String name, String lastName, int age) {
        super(id, name, lastName, age);
        this.idFederation = idFederation;
    }

    public String getIdFederation() {
        return idFederation;
    }
    
    public void setIdFederation(String idFederation) {
        this.idFederation = idFederation;
    }

    public void createProgram() {

    }

    public void goTraining() {
        System.out.println("Esta dirigiendo el entrenamiento.\n");
    }
}
