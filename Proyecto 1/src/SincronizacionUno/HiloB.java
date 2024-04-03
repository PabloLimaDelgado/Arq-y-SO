package SincronizacionUno;

public class HiloB extends Thread{
    private Contador contador;

    public HiloB(String name, Contador contador) {
        setName(name);
        this.contador = contador;
    }

    public void run(){
        synchronized (contador){
            for (int i = 0; i < 300; i++) {
                contador.decrementar();
                try {
                   Thread.sleep(10);
                }catch (InterruptedException e){}
            }
        }
        System.out.println(getName() + " contador vale: " + contador.getValor());
    }
}