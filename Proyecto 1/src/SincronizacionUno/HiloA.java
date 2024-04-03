package SincronizacionUno;

public class HiloA extends Thread{
    private Contador contador;

    public HiloA(String name, Contador contador) {
        setName(name);
        this.contador = contador;
    }

    public void run(){
        synchronized (contador){
            for (int i = 0; i < 300; i++) {
                contador.incrementar();

                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {}
                    //System.out.println(getName() + " contador vale: " + contador.getValor());
            }
        }
        System.out.println(getName() + " contador vale: " + contador.getValor());
    }
}
