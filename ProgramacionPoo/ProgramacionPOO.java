package ProgramacionPoo;
//Crear una 

public class ProgramacionPOO {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Jose", 400);
        Cuenta cuenta2 = new Cuenta("Antonio", 500);

        //Ingresar dinero
        cuenta1.ingresar(600);
        cuenta2.ingresar(800);

        //Retirar dinero
        cuenta1.retirar(300);
        cuenta2.retirar(200);

        System.out.println(cuenta1.getTitular());
        cuenta1.setTitular("Pedro");
        System.out.println(cuenta1.getTitular());
        
        //Mostrar saldo
        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}
