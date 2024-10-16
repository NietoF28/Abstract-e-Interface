public class Main {
    public static void main(String[] args) {
           Perro perro = new Perro();
           Gato gato = new Gato();
           Carro carro = new Carro();
           Bicicleta bicicleta = new Bicicleta();
        System.out.println("Caso abstracto (Animales)");
        System.out.println("-Estos animales se cominucan con-");
                perro.hacerSonido();
                gato.hacerSonido();
        System.out.println("\n");
        System.out.println("-Estos animales juegan asi-");
                perro.jugar();
                gato.jugar();
        System.out.println("\n");
        System.out.println("Caso interface (Vehiculos)");
        System.out.println("-Vehiculos avanzando-");
                carro.arrancar();
                bicicleta.arrancar();
        System.out.println("\n");
        System.out.println("-Vehiculos detenidos-");
                carro.parar();
                bicicleta.parar();
        System.out.println("\n");
        System.out.println("-Numero de pasajeros en Vehiculos-");
                carro.numeroPasajeros();
                bicicleta.numeroPasajeros();


    }
}