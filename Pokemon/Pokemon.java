package Pokemon;

public class Pokemon {
    
    private String nombre, tipo, region, clasificacion;
    private int nivel;
    private String numeracion;
    private double peso, altura;

    // Constructor
    public Pokemon(String nombre, String tipo, String region, String clasificacion, int nivel, String numeracion, double d, double e) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.region = region;
        this.clasificacion = clasificacion;
        this.nivel = nivel;
        this.numeracion = numeracion;
        this.peso = d;
        this.altura = e;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRegion() {
        return region;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}