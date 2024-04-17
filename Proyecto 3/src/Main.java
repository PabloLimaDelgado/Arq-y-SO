//Este ejercicio simula una situación donde varios hilos
// (representados por clases Worker) están tratando de acceder a un recurso compartido
// (una cuenta bancaria representada por la clase CuentaBancaria) de forma simultánea y segura


public class Main {
    public static void main(String[] args) {
        CuentaBancaria cb1 = new CuentaBancaria(1000);
        CuentaBancaria cb2 = new CuentaBancaria(1000);

        Trabajador t1 = new Trabajador("Pablo", cb1);
        Trabajador t2 = new Trabajador("Santiago", cb2);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();

        try {
            //Se utiliza para esperar a que un hilo termine su ejecución antes de que el hilo actual continúe ejecutándose
            t1.join();
            t2.join();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}