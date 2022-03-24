public class NavesLanzadera extends Naves{

    private int empuje;
    private int capacidadTransporte;

    public NavesLanzadera(String potencia, double peso, double altura, double velocidad, String nombre, int empuje, int capacidadTransporte ){
        super(potencia, peso, altura, velocidad, nombre);
        this.empuje = empuje;
        this.capacidadTransporte = capacidadTransporte;
    }

    @Override
    public void mensajeLlegada() {
        System.out.println("¡La lanzadera ha llegado a su destino con éxito!");

    }

    public void mostrar(){
        System.out.println("__________________");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Altura: " + this.altura + " m");
        System.out.println("Potencia: " + this.potencia + " hp");
        System.out.println("Peso: " + this.peso + " t");
       // System.out.println("Velocidad: " + this.velocidad + " km/h");
        System.out.println("Empuje: " + this.empuje + " t");
        System.out.println("Capacidad de transporte: " + this.capacidadTransporte + " t");
        System.out.println("__________________");



    }
}
