package Join;

public class Thread1 extends Thread{

    @Override
    public void run() {
        System.out.printf("HILO 1 INICIADO\n");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("HILO 1 FINALIZADO\n");
    }
}
