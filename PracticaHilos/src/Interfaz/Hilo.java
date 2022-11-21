package Interfaz;

public class Hilo implements Runnable{

    @Override
    public void run() {
        System.out.println("Soy un hilo con interfaz :)");
    }
}
