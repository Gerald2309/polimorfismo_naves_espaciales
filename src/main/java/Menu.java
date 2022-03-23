import java.io.*;

public class Menu {

    public Integer numero;
    public Integer numeroPrincipal;


    public Integer opciones() throws IOException {
        System.out.println(" ****** MENÚ ****** \n" +
                "1. Nave lanzadora. \n" +
                "2. Nave tripulada. \n" +
                "3. Nave no tripulada. \n" +
                "4. Nave no tripulada para estudiar.");

        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(capturarTeclado);
        String strNumero = reader.readLine();
        return this.numeroPrincipal = Integer.parseInt(strNumero);
    }
    /*************************************/




    public void opcionesNavesTripuladas() throws IOException {
        System.out.println(" ****** MENÚ ****** \n" +
                "1. Misiones lunares \n" +
                "2. Experimentación \n" +
                "3. Mantenimiento \n"
               );

        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(capturarTeclado);
        String strNumero = reader.readLine();
        this.numero = Integer.parseInt(strNumero);
    }

    public void flujo(){
        Naves nave1;
        nave1 = new NavesTripuladas(111, 222, 333, 444, "Apolo2");

        switch (numero){
            case 1:
                nave1.misionesLunares();
                break;

            case 2:
                nave1.experimentacion();
                break;

            case 3:
                nave1.mantenimiento();
                break;

        }

    }

}

