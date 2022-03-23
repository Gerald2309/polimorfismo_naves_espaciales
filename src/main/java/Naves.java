public abstract class Naves {

    public double potencia;
    public double peso;
    public double altura;
    public double velocidad;
    public String nombre;
  //  public VehiculoLanzador propulsion;

    public Naves(double potencia, double peso, double altura, double velocidad, String nombre){

        this.potencia = potencia;
        this.peso = peso;
        this.altura = altura;
        this.velocidad = velocidad;
        this.nombre = nombre;

    }

    public abstract void mensajeLlegada();

}
