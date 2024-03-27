package EjercicioUno;

public class Proceso extends Thread{
    public int id;

    public Proceso(String name, int id) {
        super(name);
        this.id = id;
    }

    public void run(){
        System.out.println("Soy el proceso: " + id + ". Mi nombre es: " +  this.getName());
    }


}
