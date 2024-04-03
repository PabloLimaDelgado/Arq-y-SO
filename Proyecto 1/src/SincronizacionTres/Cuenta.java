package SincronizacionTres;

public class Cuenta extends Thread{
    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void restar(int cantidad){
        saldo -= cantidad;
    }

    synchronized public void retirarDinero(int cant, String nom){
        if(getSaldo() >= cant){
            System.out.println("SE VA A RETIRAR DEL SALDO ACTUAL QUE ES: " + getSaldo());

            try {
                Thread.sleep(10);
            }catch (InterruptedException ix){}

            restar(cant);
            System.out.println("La persona " + nom + " va a retirar ==> " + cant);
        }else{
            System.out.println("No se pudo retirar la cuenta");
        }
    }
}
