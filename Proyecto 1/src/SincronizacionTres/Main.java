package SincronizacionTres;

public class Main {
    public static void main(String[] args) {
        Cuenta c = new Cuenta(500);
        SacarDinero cUno = new SacarDinero("Ana", c);
        SacarDinero cDos = new SacarDinero("Juan", c);

        cUno.start();
        cDos.start();
    }
}
