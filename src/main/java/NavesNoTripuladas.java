public class NavesNoTripuladas {
    private double empuje;
    private double motores;
    private double velocidadDesplazamiento;
    private String nombre;

    public NavesNoTripuladas(double empuje, double motores, double velocidadDesplazamiento, String nombre){
        this.nombre = nombre;
        this.empuje = empuje;
        this.motores = motores;
        this.velocidadDesplazamiento = velocidadDesplazamiento;
    }

    public void mostrar(){
        System.out.println("Nombre: " + nombre );
        System.out.println("Desplazamiento de: "+ velocidadDesplazamiento +" Km/h");
        System.out.println("Empuje: " + empuje);
        System.out.println("Cantidad de motores: " + motores);
    }



}
