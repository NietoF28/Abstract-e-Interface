public class Carro implements Vehiculo{

    @Override
    public void arrancar() {
        System.out.println("El carro esta avanzando");
    }

    @Override
    public void parar() {
        System.out.println("El carro esta detenido");
    }

    @Override
    public void numeroPasajeros() {
        System.out.println("El carro tiene 4 pasajeros");
    }
}
