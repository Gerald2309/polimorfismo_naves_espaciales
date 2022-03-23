import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Integer numeroPrincipal;

        Menu menu = new Menu();
        numeroPrincipal = menu.opciones();

        switch (numeroPrincipal){

            case 1:
                System.out.println("1. Nave lanzadora. ");
                break;

            case 2:
                System.out.println("2. Nave tripulada. ");
                menu.opcionesNavesTripuladas();
                break;

            case 3:
                System.out.println("3. Nave no tripulada.");
                break;

            case 4:
                System.out.println("4. Nave no tripulada para estudiar.");
                break;
        }
        menu.flujo();


    }
}
