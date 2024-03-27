package EjercicioUno;

public class Main {
    public static void main(String[] args) {
        Proceso p1 = new Proceso("Llamar impresora", 1);
        Proceso p2 = new Proceso("Grabar disco", 2);
        Proceso p3 = new Proceso("Ejecutar suma", 3);
        Proceso p4 = new Proceso("Tomar datos", 4);

        //p1.start();
        //p2.start();
        //p3.start();
        //p4.start();

        p1.run();
        p2.run();
        p3.run();
        p4.run();
    }
}
