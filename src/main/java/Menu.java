import java.io.*;
import java.util.Scanner;

public class Menu {

    public Integer numeroPrincipal;

    /*
    *
    *MENÚ PRINCIPAL
    *
    */
    public Integer opciones() throws IOException {
        System.out.println(" ****** MENÚ PRINCIPAL ****** \n \n" +
                "A continuación verá la lista de opciones de los tipos de naves que puede crear. \n" +
                "1. Nave lanzadora. \n" +
                "2. Nave tripulada. \n" +
                "3. Nave no tripulada. \n" +
                "4. Nave no tripulada para estudiar.\n \n" +
                " ****** FIN MENÚ PRINCIPAL ****** \n"+
                "Ingrese el número para indicar la que quiere crear:  \n \n" );

        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(capturarTeclado);
        String strNumero = reader.readLine();
        return this.numeroPrincipal = Integer.parseInt(strNumero);
    }
    /*************************************/



    /*
    *
    * MENÚ NAVES TRIPULADAS
    *
    */
    public void opcionesNavesTripuladas() throws IOException {
        Scanner option1 = new Scanner(System.in);
        System.out.println(" ****** MENÚ ****** \n" +
                "\n" +
                "1. Misiones lunares \n" +
                "2. Experimentación \n" +
                "3. Mantenimiento \n" +
                "\n " +
                " ****** FIN MENÚ ****** \n"+
                "Ingrese el número para indicar el tipo de misión. \n"

        );
        Integer opcionPersona1 = option1.nextInt();
        flujoNavesTripuladas(opcionPersona1);
    }

    public void flujoNavesTripuladas(Integer opcionPersona1){
        Naves nave1;
        nave1 = new NavesTripuladas("111", 222, 333, 444, "Apolo2");

        switch (opcionPersona1){
            case 1:
                //ESTO ES UN CAST
                ((NavesTripuladas) nave1).misionesLunares();
                break;

            case 2:
                ((NavesTripuladas)nave1).experimentacion();
                break;

            case 3:
                ((NavesTripuladas)nave1).mantenimiento();
                break;

        }

    }

    /*
     *
     * MENÚ NAVES LANZADERA
     *
     */

    public void opcionesNavesLanzadera() throws IOException {
        Scanner capturarTeclado = new Scanner(System.in);
        System.out.println(" ****** MENÚ ****** \n" +
                "A continuación verá la lista de opciones de los tipos de naves lanzadera que puede crear. \n" +
                "1. Saturno V \n" +
                "2. Energía \n" +
                "\n " +
                " ****** FIN MENÚ ****** \n"+
                "Ingrese el número para indicar la nave. \n");
         Integer option = capturarTeclado.nextInt();
         flujoNavesLanzaderas(option);
    }

    public void flujoNavesLanzaderas(Integer option){
        Naves SaturnoV, Energia;
        if(option == 1){
            SaturnoV = new NavesLanzadera("3200*5", 2900, 100, 0, "Apolo2", 3500, 118);
            SaturnoV.mostrar();
        }
        else if (option == 2) {
            Energia = new NavesLanzadera("111", 2400, 60, 0, "Energia", 3060, 100);
            Energia.mostrar();
        } else{System.out.println("La opción ingresada no es válida");}

    }

    public void opcionesNavesNoTripuladas() throws IOException {
        Scanner option1 = new Scanner(System.in);
        System.out.println(" ****** MENÚ ****** \n" +
                "\n" +
                "1. Urano y Neptuno \n" +
                "2. Sol \n" +
                "3. Venus \n" +
                "\n " +
                " ****** FIN MENÚ ****** \n"+
                "Ingrese el número para indicar el tipo de misión/lugar de destino de la nave. \n"

        );
        Integer opcionPersona1 = option1.nextInt();
        flujoNavesNoTripuladas(opcionPersona1);
    }

    public void flujoNavesNoTripuladas(Integer opcionPersona1){
        NavesNoTripuladasParaEstudiar naveParaEstudiar = new NavesNoTripuladasParaEstudiar();

        switch (opcionPersona1){
            case 1:
                //ESTO ES UN CAST
                naveParaEstudiar.uranoYNeptuno();
                break;

            case 2:
                naveParaEstudiar.sol();
                break;

            case 3:
                naveParaEstudiar.venus();
                break;

        }

    }


}

