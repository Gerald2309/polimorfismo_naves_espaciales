import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
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
                break;

            case 4:
                System.out.println("Ha seleccionado la nave no tripulada para estudiar. \n" +
                        "¿Cuál será el destino de la nave no tripulada para estudiar?");
                menu.opcionesNavesNoTripuladas();
                break;
        }
    }
}
