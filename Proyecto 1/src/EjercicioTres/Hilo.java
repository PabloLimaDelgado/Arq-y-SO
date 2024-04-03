package EjercicioTres;

public class Hilo extends Thread{
    private int id;
    static int cont = 0;

    public Hilo(String name, int id) {
        super(name);
        this.id = id;
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            cont++;
        }
    }

    public static void main(String[] args) {
        /*Hilo h1 = new Hilo("Hilo 1", 1);

        h1.run();
        h1.run();
        System.out.println(cont);*/

        Hilo[] hilos = new Hilo[10];

        for (int i = 0; i < hilos.length; i++) {
            hilos[i] = new Hilo("Hilo " + i, i);
            hilos[i].start();

            try {
                hilos[i].join();
            }catch (Exception e){

            }
        }

        System.out.println(Hilo.cont);
    }
}
