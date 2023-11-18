package Seleccion;

public class Seleccion_de_Futbol {
   
    private int id;
    private String name;
    private String lastName;
    private int age;

    public Seleccion_de_Futbol (int id, String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void concentration() {
        System.out.println("Está en periodo de concentración.\n");
    }

    public void travel() {
        System.out.println("Está viajando.\n");
    }
}
