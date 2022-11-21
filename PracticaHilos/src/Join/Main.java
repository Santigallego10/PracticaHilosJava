package Join;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.run();
        thread1.join();

        thread2.run();
        thread2.join();

        System.out.println("End");
    }

}
