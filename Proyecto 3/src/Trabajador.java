public class Trabajador extends Thread implements Runnable{
    private CuentaBancaria cuentaBancaria;
    private String nombre;
    public Trabajador() {
    }

    public Trabajador(String  nombre, CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        this.nombre = nombre;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    @Override
    public void run(){
        for (int i = 0; i < 3; i++){
                System.out.println(this.nombre);
                this.cuentaBancaria.depositarSaldo(100);
                this.cuentaBancaria.retirarSaldo(20);
                System.out.println(this.cuentaBancaria.getSaldo());
        }
    }
}
