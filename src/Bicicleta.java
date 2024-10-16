public class Bicicleta implements Vehiculo{

    @Override
    public void arrancar() {
        System.out.println("La bicicleta esta avanzando");
    }

    @Override
    public void parar() {
        System.out.println("La bicicleta esta detenida");
    }

    @Override
    public void numeroPasajeros() {
        System.out.println("La bicicleta tiene 1 pasajero");
    }
}
