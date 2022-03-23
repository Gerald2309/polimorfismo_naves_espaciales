public class NavesTripuladas extends Naves {

    public double orbita;
    public int capacidadPersonas;

    public NavesTripuladas(double potencia, double peso, double altura, double velocidad, String nombre){
        super(potencia, peso, altura, velocidad, nombre);
        this.potencia = potencia;
        this.peso = peso;
        this.altura = altura;
        this.velocidad = velocidad;
        this.nombre = nombre;
        this.orbita = 435;
        this.capacidadPersonas = 3;
    }

    @Override
    public void mostrar(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Orbita: " + this.orbita);
        System.out.println("Altura: " + this.altura);
        System.out.println("Potencia: " + this.potencia);
        System.out.println("Peso: " + this.peso);
        System.out.println("Velocidad: " + this.velocidad);
    }

    @Override
    public void mensajeLlegada() {
        System.out.println("¡La nave ha llegado a su destino con éxito!");
    }

    @Override
    public void misionesLunares(){
        System.out.println("__________________");
        System.out.println("Esta nave se usa en misiones lunares");
        mostrar();
        mensajeLlegada();
    }

    @Override
    public void experimentacion(){
        System.out.println("__________________");
        System.out.println("Esta nave se usa en misiones de experimentación");
        mostrar();
        mensajeLlegada();
    }

    @Override
    public void mantenimiento(){
        System.out.println("__________________");
        System.out.println("Esta nave se usa en misiones de mantenimiento");
        mostrar();
        mensajeLlegada();
    }
}
