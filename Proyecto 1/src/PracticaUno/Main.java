package PracticaUno;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //EJERCICIO 1
        /*
            // Declaración de 2 threads
        PingPong t1 = new PingPong("PING2",33);
        PingPong t2 = new PingPong("PONG",10);
            // Activación
        t1.start();
        t2.start();
            // Espera 2 segundos
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){};
            // Finaliza la ejecución de los threads
        //t1.stop();
        //t2.stop(); */

        //EJERCICIO 3
        /*SelfRun objActivo=new SelfRun();
        // Espera durante 2 segundos
        try{Thread.sleep(2000);
        }catch(InterruptedException e){};
        // Termina el objeto activo
        System.out.println("main invoca stopRequest()");
        objActivo.stopRequest();*/

        //EJERCICIO 4
        /*Cliente juan= new Cliente();
        juan.setName("Juan López");
        Cliente ines = new Cliente();
        ines.setName("Inés García");
        juan.start();
        ines.start();*/

        //EJERCICIO 5
        /*Obrera agente = new Obrera();
        agente.start();
        // Hace algo durante el cálculo.
        try { //Espera a que agente termine
            agente.join();
        }catch (InterruptedException e){};
        // Utiliza el resultado.
        System.out.println(agente.getResultado()); */

        //EJERCICIO 8
        /*Thread elThread= new MiThread();
        elThread.start();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){};
        elThread.interrupt();*/

        //EJERCICIO 9
        /*Thread elThread= new MiThread();
        elThread.start();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){};
        elThread.interrupt();*/

        //EJERCICIO 10
        SleepInterrupt si=new SleepInterrupt();
        Thread t = new Thread(si);
        t.start();
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){};
        System.out.println("in main(): Intterupo a t");
        t.interrupt();
        System.out.println("in main(): termina");
    }
}
