import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner option1 = new Scanner(System.in);
        int op;
        do {
            System.out.println("¡Bienvenido! \n");
            menuPrincipal();
            System.out.println("\n -----------------------------------");
            System.out.println("El programa ha finalizado");
            System.out.println("\n -----------------------------------");
            System.out.println("¿Desea ejecutar de nuevo el programa?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            op = option1.nextInt();

        }while(op == 1);

    }

    public static void menuPrincipal() throws IOException {
        Integer numeroPrincipal;

        Menu menu = new Menu();
        numeroPrincipal = menu.opciones();

        switch (numeroPrincipal){

            case 1:
                System.out.println("Ha seleccionado la nave lanzadera. \n" +
                        "¿Qué tipo de nave lanzadera quiere obtener?");

                menu.opcionesNavesLanzadera();
                break;

            case 2:
                System.out.println("Ha seleccionado la nave tripulada. \n" +
                        "¿Para qué tipo de misión requiere la nave tripulada?");
                menu.opcionesNavesTripuladas();
                break;

            case 3:
                System.out.println("3. Nave no tripulada.");
                NavesNoTripuladas atv = new NavesNoTripuladas(0.2, 4, 12000, "ATV");
                atv.mostrar();
                break;

            case 4:
                System.out.println("Ha seleccionado la nave no tripulada para estudiar. \n" +
                        "¿Cuál será el destino de la nave no tripulada para estudiar?");
                menu.opcionesNavesNoTripuladas();
                break;
        }

    }
}
