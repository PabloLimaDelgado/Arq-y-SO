package SincronizacionUno;

public class Contador {
    private int c = 0;

    public Contador(int c) {
        this.c = c;
    }

    public void incrementar(){
        c = c + 1;
    }

    public void decrementar(){
        c -= 1;
    }

    public int getValor(){
        return c;
    }
}
