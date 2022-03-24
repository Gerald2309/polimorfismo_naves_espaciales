public class NavesTripuladas extends Naves {

    public double orbita;
    public int capacidadPersonas;

    public NavesTripuladas(String potencia, double peso, double altura, double velocidad, String nombre){
        super(potencia, peso, altura, velocidad, nombre);
        this.potencia = potencia;
        this.peso = peso;
        this.altura = altura;
        this.velocidad = velocidad;
        this.nombre = nombre;
        this.orbita = 435;
        this.capacidadPersonas = 3;
    }

   // @Override
    public void mostrar(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Orbita: " + this.orbita + " km");
        System.out.println("Altura: " + this.altura + " m");
        System.out.println("Potencia: " + this.potencia + " hp");
        System.out.println("Peso: " + this.peso + " t");
        System.out.println("Velocidad: " + this.velocidad + " km/h");
        System.out.println("La nave será inpulsada por el vehículo lanzadera con nombre: Saturno V");
    }

    @Override
    public void mensajeLlegada() {
        System.out.println("¡La nave ha llegado a su destino con éxito!");
    }


    public void misionesLunares(){
        System.out.println("__________________");
        System.out.println("La nave indicada para las misiones lunares es: ");
        mostrar();
        System.out.println("__________________");
        mensajeLlegada();
    }


    public void experimentacion(){
        System.out.println("__________________");
        System.out.println("La nave indicada para las misiones de experimentación");
        mostrar();
        System.out.println("__________________");
        mensajeLlegada();
    }


    public void mantenimiento(){
        System.out.println("__________________");
        System.out.println("La nave indicada para las misiones de mantenimiento");
        mostrar();
        System.out.println("__________________");
        mensajeLlegada();
    }
}
