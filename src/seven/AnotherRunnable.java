package seven;

public class AnotherRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }
}
