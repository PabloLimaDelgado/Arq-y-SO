package SincronizacionTres;

public class SacarDinero extends Thread{
    private Cuenta c;
    public SacarDinero(String name, Cuenta c) {
        super(name);
        this.c = c;
    }

    public void run(){
        for (int i = 0; i <= 4; i++) {
            c.retirarDinero(10, getName());
        }
    }
}
