import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        Robot robot = new Robot();
        Hombre hombre = new Hombre("User");
        int opc, pasosAvanzar=0, pasosRetro=0, pasos;
        boolean m=true;
        do{
        System.out.println(
                "====================\n        MENÚ        \n====================" +
                        "\nAvanzar ->(1)" +
                        "\nRetroceder ->(2)" +
                        "\nEnergía Actual ->(3)" +
                        "\nDormir Robot ->(4)" +
                        "\nDespertar Robot ->(5)" +
                        "\nRecargar bateria ->(6)"
        );
        opc = dato.nextInt();
        switch (opc){
            case 1->{
                System.out.println("Ingrese pasos que quiere avanzar:");
                pasos= dato.nextInt();
                pasosAvanzar = pasosAvanzar+pasos;
                do{
                if(pasosAvanzar>=100&& robot.estado()){
                    robot.avanzar(1);
                    pasosAvanzar=pasosAvanzar-100;
                }else if(!robot.estado()){
                    System.out.println("El robot esta dormido...");
                }
                }while (pasosAvanzar>=100);
            }
            case 2->{
                System.out.println("Ingrese pasos que quiere retroceder:");
                pasos= dato.nextInt();
                pasosRetro = pasosRetro+pasos;
                do{
                if(pasosRetro>=100&& robot.estado()){
                    robot.retrocerder(1);
                    pasosRetro=pasosRetro-100;
                }else if(!robot.estado()){
                    System.out.println("El robot esta dormido...");
                }
                }while(pasosRetro>=100);
            }
            case 3->{
                System.out.println("La energía actual es de "+robot.energiaActual()+"%");
            }
            case 4->{
                robot.dormir();
                m=false;
                System.out.println("Gracias por jugar con Robot....");
            }
            case 5->{
                robot.despertar();
                System.out.println("Desperto con exito tu robot....");
            }
            case 6->{
                robot.recargar();
                System.out.println("Se recargo con exito tu bateria....");
            }
            default -> {
                System.out.println("|||||Ingrese una opción valida|||||");
            }
        }}while (m);
    }
}