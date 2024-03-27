package EjercicioDos;

import EjercicioUno.Proceso;

public class Main {
    public static void main(String[] args) {
        Proceso[] procesos = new Proceso[5];

        for (int i = 0; i < 5; i++) {
            procesos[i] = new Proceso("Proceso" + (i), (i));
            procesos[i].start();

            try {
                procesos[i].join();
            }catch (Exception E){}
        }

        for (int i = 0; i < 5; i++) {
            //procesos[i].start();
        }

    }
}
