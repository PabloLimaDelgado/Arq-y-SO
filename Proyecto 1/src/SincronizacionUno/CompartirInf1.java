package SincronizacionUno;

public class CompartirInf1 {
    public static void main(String[] args) {
        Contador c1 = new Contador(100);
        HiloA h1A = new HiloA("Hilo A", c1);
        HiloB h1B = new HiloB("Hilo B", c1);

        h1B.start();
        h1A.start();
        //h1A.run();
        //h1B.run();
    }
}
