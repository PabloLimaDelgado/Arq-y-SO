public class CuentaBancaria {
    private int saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int saldo) {
        this.saldo = saldo;
    }

    public synchronized int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public synchronized void retirarSaldo(int cantidad){
        this.saldo = this.saldo - cantidad;
    }

    public synchronized void depositarSaldo(int cantidad){
        this.saldo = this.saldo + cantidad;
    }
}
