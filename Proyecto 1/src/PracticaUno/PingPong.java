package PracticaUno;

//EJERCICIO 1

/*public class PingPong extends Thread{
    private String word; // Lo que va a escribir.
    private int delay; // Tiempo entre escrituras
    public PingPong(String queDecir,int cadaCuantosMs){
        word = queDecir; delay = cadaCuantosMs; };
    public void run(){ //Se sobrescribe run() de Thread
        while(true){
            System.out.print(word + " ");
            try{
                sleep(delay);
            } catch(InterruptedException e){ return; }
        }
    }
}*/

//EJERCICIO 2
public class PingPong implements Runnable {
    private String word; // Lo que va a escribir.
    private int delay; // Tiempo entre escrituras
    public PingPong(String queDecir, int cadaCuantosMs){
        word = queDecir; delay = cadaCuantosMs; };
    public void run(){
        while(true){
            System.out.print(word + " ");
            try{ Thread.sleep(delay);
            }catch(InterruptedException e){return;}
        }
    }
}