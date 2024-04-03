package Filosofos;

public class ProblemaFilosofos {
    private Object[] tenedores;
    private Filosofo[] filosofos;
    private int filosofosQueHanComido = 0;

    private class Filosofo extends Thread {
        private int id;

        public Filosofo(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            while (true) {
                pensar();
                // Adquiere el tenedor a la izquierda
                synchronized (tenedores[id]) {
                    System.out.println("Filosofo " + id + " ha cogido el tenedor a su izquierda.");
                    // Adquiere el tenedor a la derecha
                    synchronized (tenedores[(id + 1) % tenedores.length]) {
                        System.out.println("Filosofo " + id + " ha cogido el tenedor a su derecha.");
                        comer();
                        System.out.println("Filosofo " + id + " ha soltado el tenedor de su derecha.");
                    }
                    System.out.println("Filosofo " + id + " ha soltado el tenedor de su izquierda.");
                }
                // Incrementa el contador de filósofos que han comido
                filosofosQueHanComido++;
                // Si todos los filósofos han comido, termina la ejecución
                if (filosofosQueHanComido == filosofos.length) {
                    System.out.println("Todos los filósofos han comido.");
                    System.exit(0);
                }
            }
        }

        private void pensar() {
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                //La excepción se produjo cuando un hilo fue
                //interrumpido. Esto puede ayudar a identificar dónde y por qué se produjo la
                // interrupción del hilo.
                e.printStackTrace();
            }
        }

        private void comer() {
            try {
                Thread.sleep((int) (Math.random() * 1000));
                System.out.println("El filosofo "+ id + " ha comido.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public ProblemaFilosofos() {
        tenedores = new Object[5];
        filosofos = new Filosofo[5];

        for (int i = 0; i < tenedores.length; i++) {
            tenedores[i] = new Object();
        }

        for (int i = 0; i < filosofos.length; i++) {
            filosofos[i] = new Filosofo(i);
        }
    }

    public void comenzarAComer() {
        for (Filosofo filosofo : filosofos) {
            filosofo.start();
        }
    }
}

/*
1. Definimos una clase ProblemaFilosofos que contiene un arreglo palillos y
un arreglo de filósofos.

2. Dentro de ProblemaFilosofos, definimos una clase interna Filosofos que extiende Thread.
Cada filósofo es un hilo que se ejecuta en paralelo.

3. En el constructor de ProblemaFilosofos, inicializamos los arreglos tenedores y filosfos.
Cada filósofo tiene un índice unico y cada palillo también tiene un índice unico.

4. El método run de la clase Filosofo simula la vida de un filósofo.
Primero piensa, luego intenta tomar los dos palillos a su izquierda y derecha .
Una vez que tiene los dos palillos, come y luego suelta los dos palillos.

5. El método comenzarAComer inicia la comida de los filósofos.

6. En el método main, creamos una instancia de ProblemaFilosofos y llamamos al método
comenzarAComer para iniciar la simulación.

 */