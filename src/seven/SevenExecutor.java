package seven;

/**
 * <li>1. PROCES</li>
 * - izvršno okruženje
 * - vlastitu memoriju
 * <li>2. THREADs</li>
 * - MAIN thread - svoju memoriju
 */
public class SevenExecutor {
    public static void main(String[] args) {
        int avaiableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println(avaiableProcessors);
        //TEstiranje Thread-a ... MAIN thread
        System.out.println(Thread.currentThread());
        AnotherRunnable runnable = new AnotherRunnable();
        Thread anotherThread = new Thread(runnable);
        anotherThread.start();
    }
}
