public class NavesNoTripuladasParaEstudiar {

        public double velocidad;
        public double masaLanzamiento;
        public double potenciaElectrica;

        public void uranoYNeptuno(){
            masaLanzamiento = 825.5;
            potenciaElectrica = 420;

            System.out.println("Nombre: Voyager I \n"
                    + "Lanzamiento: "+ masaLanzamiento +" Kg \n"
                    + "Potencia eléctrica: "+ potenciaElectrica +" Vatios ");
        }

        public void sol(){
            velocidad = 70.4;
            masaLanzamiento = 685;
            potenciaElectrica = 343;
            System.out.println("Nombre: Helios \n"
                                + "velocidad: "+ velocidad +" Km/s \n"
                                + "Masa de lanzamiento: "+ masaLanzamiento +" Kg \n"
                                + "Potencia eléctrica: "+ potenciaElectrica +" Vatios ");
        }

        public void venus(){
            masaLanzamiento = 201;

            System.out.println("Nombre: Voyager I \n"
                    + "Masa de lanzamiento de: "+ masaLanzamiento +" Kg ");
        }
}
