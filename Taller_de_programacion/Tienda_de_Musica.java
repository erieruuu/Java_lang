package Taller_de_programacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Crear clase de Intrumentos \\

abstract class Instrumentos {

    //Atributos
    private String NombreInst, Marca;
    private int ID_Inst;
    private double Precio;
    private boolean EstaVendido;

    // Constructor
    public Instrumentos (String NombreInst, String Marca, int ID_Inst, double Precio, boolean EstaVendido) {
        this.NombreInst = NombreInst;
        this.Marca = Marca;
        this.ID_Inst = ID_Inst;
        this.Precio = Precio;
        this.EstaVendido = EstaVendido;
    }

    // Getters
    public String getNombreInst () {
        return this.NombreInst;
    }
    public String getMarca () {
        return this.Marca;
    }
    public int getID_Inst () {
        return this.ID_Inst;
    }
    public double getPrecio () {
        return this.Precio;
    }
    public boolean getEstaVendido () {
        return this.EstaVendido;
    }
    
    // Setters
    public void setNombreInst (String NombreInst) {
        this.NombreInst = NombreInst;
    }
    public void setMarca (String Marca){
        this.Marca = Marca;
    }
    public void setID_Inst (int ID_Inst) {
        this.ID_Inst = ID_Inst;
    }
    public void setPrecio (double Precio) {
        this.Precio = Precio;
    }
    public void setEstaVendido (boolean EstaVendido) {
        this.EstaVendido = EstaVendido;
    }

    abstract void Vender ();
}

// ------------------------- \\

// Crear los instrumentos \\

/* 1. Guitarra */
class Guitarra extends Instrumentos {

    // Atributos
    private String TipoG;
    private int CantidadG;

    public Guitarra (String NombreInst, String TipoG, String Marca, int ID_Inst, double Precio, int CantidadG, boolean EstaVendido) {
        super (NombreInst, Marca, ID_Inst, Precio, EstaVendido);
        this.TipoG = TipoG;
        this.CantidadG = CantidadG;
    }

    // Getters
    public String getTipoG () {
        return TipoG;
    }
    public int getCantidadG () {
        return CantidadG;
    }

    // Setters
    public void setTipoG (String TipoG) {
        this.TipoG = TipoG;
    }
    public void setCantidadG (int CantidadG) {
        this.CantidadG = CantidadG;
    }

    public void Vender () {
        setEstaVendido (true);
    }
}

/* 2. Piano */
class Piano extends Instrumentos {

    // Atributos
    private String TipoP;
    private int CantidadP;

    public Piano (String NombreInst, String TipoP, String Marca, int ID_Inst, double Precio, int CantidadP, boolean EstaVendido) {
        super (NombreInst, Marca, ID_Inst, Precio, EstaVendido);
        this.TipoP = TipoP;
        this.CantidadP = CantidadP;
    }

    // Getters
    public String getTipoP () {
        return TipoP;
    }
    public int getCantidadP () {
        return CantidadP;
    }

    // Setters
    public void setTipoP (String TipoP) {
        this.TipoP = TipoP;
    }
    public void setCantidadP (int CantidadP) {
        this.CantidadP = CantidadP;
    }

    public void Vender () {
        setEstaVendido (true);
    }
}

/* 3. Batería */
class Bateria extends Instrumentos {

    // Atributos
    private String TipoB;
    private int CantidadB;

    public Bateria (String NombreInst, String TipoB, String Marca, int ID_Inst, double Precio, int CantidadB, boolean EstaVendido) {
        super (NombreInst, Marca, ID_Inst, Precio, EstaVendido);
        this.TipoB = TipoB;
        this.CantidadB = CantidadB;
    }

    // Getters
    public String getTipoB () {
        return TipoB;
    }
    public int getCantidadB () {
        return CantidadB;
    }

    // Setters
    public void setTipoB (String TipoB) {
        this.TipoB = TipoB;
    }
    public void setCantidadB (int CantidadB) {
        this.CantidadB = CantidadB;
    }

    public void Vender () {
        setEstaVendido (true);
    }
}

/* 4. Violín */
class Violin extends Instrumentos {

    // Atributos
    private String TipoV;
    private int CantidadV;

    public Violin (String NombreInst, String TipoV, String Marca, int ID_Inst, double Precio, int CantidadV, boolean EstaVendido) {
        super (NombreInst, Marca, ID_Inst, Precio, EstaVendido);
        this.TipoV = TipoV;
        this.CantidadV = CantidadV;
    }

    // Getters
    public String getTipoV () {
        return TipoV;
    }
    public int getCantidadV () {
        return CantidadV;
    }

    // Setters
    public void setTipoV (String TipoV) {
        this.TipoV = TipoV;
    }
    public void setCantidadV (int CantidadV) {
        this.CantidadV = CantidadV;
    }

    public void Vender () {
        setEstaVendido (true);
    }
}

/* 5. Trompeta */
class Trompeta extends Instrumentos {

    // Atributos
    private String TipoT;
    private int CantidadT;

    public Trompeta (String NombreInst, String TipoT, String Marca, int ID_Inst, double Precio, int CantidadT, boolean EstaVendido) {
        super (NombreInst, Marca, ID_Inst, Precio, EstaVendido);
        this.TipoT = TipoT;
        this.CantidadT = CantidadT;
    }

    // Getters
    public String getTipoT () {
        return TipoT;
    }
    public int getCantidadT () {
        return CantidadT;
    }

    // Setters
    public void setTipoT (String TipoT) {
        this.TipoT = TipoT;
    }
    public void setCantidadT (int CantidadT) {
        this.CantidadT = CantidadT;
    }

    public void Vender () {
        setEstaVendido (true);
    }
}

/* 6. Saxofón */
class Saxofon extends Instrumentos {

    // Atributos
    private String TipoS;
    private int CantidadS;

    public Saxofon (String NombreInst, String TipoS, String Marca, int ID_Inst, double Precio, int CantidadS, boolean EstaVendido) {
        super (NombreInst, Marca, ID_Inst, Precio, EstaVendido);
        this.TipoS = TipoS;
        this.CantidadS = 0;
    }

    // Getters
    public String getTipoS () {
        return TipoS;
    }
    public int getCantidadS () {
        return CantidadS;
    }

    // Setters
    public void setTipoS (String TipoS) {
        this.TipoS = TipoS;
    }
    public void setCantidadS (int CantidadS) {
        this.CantidadS = CantidadS;
    }

    public void Vender () {
        setEstaVendido (true);
    }
}
/* 7. Flauta */
class Flauta extends Instrumentos {

    // Atributos
    private String TipoF;
    private int CantidadF;

    public Flauta (String NombreInst, String TipoF, String Marca, int ID_Inst, double Precio, int CantidadF, boolean EstaVendido) {
        super (NombreInst, Marca, ID_Inst, Precio, EstaVendido);
        this.TipoF = TipoF;
        this.CantidadF = 0;
    }

    // Getters
    public String getTipoF () {
        return TipoF;
    }
    public int getCantidadF () {
        return CantidadF;
    }

    // Setters
    public void setTipoF (String TipoF) {
        this.TipoF = TipoF;
    }
    public void setCantidadF (int CantidadF) {
        this.CantidadF = CantidadF;
    }

    public void Vender () {
        setEstaVendido (true);
    }
}
/* 8. Acordeón */
class Acordeon extends Instrumentos {

    // Atributos
    private String TipoA;
    private int CantidadA;

    public Acordeon (String NombreInst, String TipoA, String Marca, int ID_Inst, double Precio, int CantidadA, boolean EstaVendido) {
        super (NombreInst, Marca, ID_Inst, Precio, EstaVendido);
        this.TipoA = TipoA;
        this.CantidadA = 0;
    }

    // Getters
    public String getTipoA () {
        return TipoA;
    }
    public int getCantidadA () {
        return CantidadA;
    }

    // Setters
    public void setTipoA (String TipoA) {
        this.TipoA = TipoA;
    }
    public void setCantidadA (int CantidadA) {
        this.CantidadA = CantidadA;
    }

    public void Vender () {
        setEstaVendido (true);
    }
}
/* 9. Cello */
class Cello extends Instrumentos {

    // Atributos
    private String TipoC;
    private int CantidadC;

    public Cello (String NombreInst, String TipoC, String Marca, int ID_Inst, double Precio, int CantidadC, boolean EstaVendido) {
        super (NombreInst, Marca, ID_Inst, Precio, EstaVendido);
        this.TipoC = TipoC;
        this.CantidadC = 0;
    }

    // Getters
    public String getTipoC () {
        return TipoC;
    }
    public int getCantidadC () {
        return CantidadC;
    }

    // Setters
    public void setTipoC (String TipoC) {
        this.TipoC = TipoC;
    }
    public void setCantidadC (int CantidadC) {
        this.CantidadC = CantidadC;
    }

    public void Vender () {
        setEstaVendido (true);
    }
}
/* 10. Lira */
class Lira extends Instrumentos {

    // Atributos
    private String TipoL;
    private int CantidadL;

    public Lira (String NombreInst, String TipoL, String Marca, int ID_Inst, double Precio, int CantidadL, boolean EstaVendido) {
        super (NombreInst, Marca, ID_Inst, Precio, EstaVendido);
        this.TipoL = TipoL;
        this.CantidadL = 0;
    }

    // Getters
    public String getTipoL () {
        return TipoL;
    }
    public int getCantidadL () {
        return CantidadL;
    }

    // Setters
    public void setTipoL (String TipoL) {
        this.TipoL = TipoL;
    }
    public void setCantidadL (int CantidadL) {
        this.CantidadL = CantidadL;
    }

    public void Vender () {
        setEstaVendido (true);
    }
}

// ------------------------- \\

// Crear clase de Clientes \\

class Clientes {
    
    // Atributos
    private String NombreCompleto;
    private int ID_Clientes, InstrumentosComprados;
    private double Saldo;
    
    // Constructor
    public Clientes (String NombreCompleto, int ID_Clientes, double Saldo, int InstrumentosComprados) {
        this.NombreCompleto = NombreCompleto;
        this.ID_Clientes = ID_Clientes;
        this.Saldo = Saldo;
        this.InstrumentosComprados = InstrumentosComprados;
    }

    // Getters
    public String getNombreCompleto () {
        return this.NombreCompleto;
    }
    public int getID_Clientes () {
        return this.ID_Clientes;
    }
    public double getSaldo () {
        return this.Saldo;
    }
    public int getInstrumentosComprados () {
        return this.InstrumentosComprados;
    }
    
    // Setters
    public void setNombreCompleto (String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }
    public void setID_Clientes (int ID_Clientes) {
        this.ID_Clientes = ID_Clientes;
    }
    public void setSaldo (double Saldo) {
        this.Saldo = Saldo;
    }
    public void setInstrumentosComprados (int InstrumentosComprados) {
        this.InstrumentosComprados = InstrumentosComprados;
    }

    // Metodo(s)
    
    /* Comprar Instrumento */
    public void ComprarInstrumento(Instrumentos instrumento) {
        
        // Verificar si el instrumento no ha sido vendido
        if (!instrumento.getEstaVendido()) {
            
            // Calcular el precio del instrumento con el posible descuento
            double precioConDescuento = instrumento.getPrecio();

            if (this instanceof ClienteVIP) {
                precioConDescuento = instrumento.getPrecio() * 0.80; // 20% de descuento para ClienteVIP
                if (this instanceof ClienteVIP) {
                    System.out.println("\nDebido a su estatus de Cliente VIP. Se le aplicará un descuento del 20%.");
                }
            } else if (this instanceof ClienteJubilado) {
                precioConDescuento = instrumento.getPrecio() * 0.85; // 15% de descuento para ClienteJubilado
                if (this instanceof ClienteJubilado) {
                    System.out.println("\nDebido a su estatus de Cliente Jubilado. Se le aplicará un descuento del 15%.");
                }
            }

            // Verificar si el cliente tiene saldo suficiente para comprar el instrumento
            if (this.getSaldo() >= precioConDescuento) {
                
                // Realizar la compra
                double nuevoSaldo = this.getSaldo() - precioConDescuento;
                int nuevosInstrumentosComprados = this.getInstrumentosComprados() + 1;

                // Actualizar el saldo y la cantidad de instrumentos comprados del cliente
                this.setSaldo(nuevoSaldo);
                this.setInstrumentosComprados(nuevosInstrumentosComprados);

                // Marcar el instrumento como vendido
                instrumento.Vender();

                System.out.println("\nCompra exitosa. Has adquirido un " + instrumento.getNombreInst());
                System.out.println("Saldo restante: " + this.getSaldo());
            } else {
                System.out.println("\nSaldo insuficiente para comprar " + instrumento.getNombreInst());
            }
        } else {
            System.out.println("\nEl instrumento " + instrumento.getNombreInst() + " ya ha sido vendido.");
        }
    }
}

// ------------------------- \\

// Crear cada tipo de cliente \\

/* Cliente Regular */
class ClienteRegular extends Clientes{

    public ClienteRegular(String NombreCompleto, int ID_Clientes, double Saldo, int InstrumentosComprados) {
        super(NombreCompleto, ID_Clientes, Saldo, InstrumentosComprados);
    }
}

/* Cliente VIP */
class ClienteVIP extends Clientes{

    public ClienteVIP(String NombreCompleto, int ID_Clientes, double Saldo, int InstrumentosComprados) {
        super(NombreCompleto, ID_Clientes, Saldo, InstrumentosComprados);
    }
}

/* Cliente Jubilado */
class ClienteJubilado extends Clientes{

    public ClienteJubilado(String NombreCompleto, int ID_Clientes, double Saldo, int InstrumentosComprados) {
        super(NombreCompleto, ID_Clientes, Saldo, InstrumentosComprados);
    }
}

// ------------------------- \\

// Tienda de Musica \\

public class Tienda_de_Musica {

    public static void main(String[] args) {
        // Lista de instrumentos
        List <Instrumentos> instrumentos = new ArrayList<>();
        instrumentos.add(new Guitarra("Guitarra acústica", "Clásica", "Fender", 1, 500.0, 5, false));
        instrumentos.add(new Piano("Piano de cola", "Grand", "Yamaha", 2, 2000.0, 3, false));
        instrumentos.add(new Bateria("Batería eléctrica", "Electrónica", "Roland", 3, 800.0, 2, false));
        instrumentos.add(new Violin("Violín", "Clásico", "Stradivarius", 4, 1200.0, 4, false));
        instrumentos.add(new Trompeta("Trompeta", "Clásica", "Bach", 5, 300.0, 3, false));
        instrumentos.add(new Saxofon("Saxofón", "Tenor", "Yamaha", 6, 700.0, 5, false));
        instrumentos.add(new Flauta("Flauta", "Travesera", "Pearl", 7, 200.0, 6, false));
        instrumentos.add(new Acordeon("Acordeón", "Vallenato", "Hohner", 8, 1000.0, 2, false));
        instrumentos.add(new Cello("Cello", "Clásico", "Stradivarius", 9, 1500.0, 3, false));
        instrumentos.add(new Lira("Lira", "Antigua", "Museo", 10, 600.0, 1, false));

        // Crear una lista de clientes
        List <Clientes> clientes = new ArrayList<>();
        clientes.add(new ClienteRegular("Juan Pérez", 1, 10000.0, 0));
        clientes.add(new ClienteVIP("Ana Gómez", 2, 1500.0, 0));
        clientes.add(new ClienteJubilado("Carlos López", 3, 12060.0, 0));
        clientes.add(new ClienteRegular("Laura Martínez", 4, 8000.0, 0));
        clientes.add(new ClienteVIP("Pedro Sánchez", 5, 20000.0, 0));
        clientes.add(new ClienteJubilado("Elena Ramírez", 6, 15000.0, 0));

        // Tienda

        System.out.println("\t Tienda de Música \n");

        // Realizar compras
        
        Random random = new Random();

        for (Clientes cliente : clientes) {
            int randomIndex = random.nextInt(instrumentos.size()); // Genera un índice aleatorio
            Instrumentos instrumento = instrumentos.get(randomIndex);

            System.out.println("\n" + cliente.getNombreCompleto() + " quiere comprar una " + instrumento.getNombreInst());
            cliente.ComprarInstrumento(instrumento);

            if (cliente.getSaldo() < instrumento.getPrecio()) {
                System.out.println("\n" + cliente.getNombreCompleto() + " no pudo comprar la " + instrumento.getNombreInst() + " debido a saldo insuficiente.");
            } else {
                System.out.println("\n" + cliente.getNombreCompleto() + " ha comprado la " + instrumento.getNombreInst());
            }
        }

        // Imprimir información de clientes después de las compras
        System.out.println("\nInformación de clientes después de las compras:");
        for (Clientes cliente : clientes) {
            System.out.println(cliente.getNombreCompleto() + " - Saldo: " + cliente.getSaldo());
        }
    }
}

// ------------------------- \\