package seven;
//1. sekvencijalno MAIN

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * <li>1. Computational intensive operations</li>
 * <li>2. IO intensive operations</li>
                        broj jezgri
 broj_threadova = -------------------      = 8 Threads
                      1 - blocking factor
     0<= blocking factor <1
 Computation -> blocking factor = 0
 IO ->  blocking factor = 0.5 = 1/2 --> 16
 */
public class ComputationalIntensive {
    public static final int MAX = 1500;

    public static double compute(double result) {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                result = result + Math.sqrt(i * j);
            }
        }
        return result;
    }


    public static void main(String[] args) throws Exception{
        long currentTime = System.currentTimeMillis();
        /*double result = IntStream.range(0, MAX)
                .parallel()
                .mapToDouble(ComputationalIntensive::compute)
                .sum();*/
        //1.7
       /* ForkJoinPool forkJoinPool = new ForkJoinPool(100);
        forkJoinPool.submit(()->{
            double result =  IntStream.range(0, MAX)
                    .parallel()
                    .mapToDouble(ComputationalIntensive::compute)
                    .sum();
            System.out.println("REZULTAT: " +result);
        });
        forkJoinPool.shutdown();*/
        long passedTime = System.currentTimeMillis() - currentTime;
        double seconds = passedTime / 1000;
        System.out.println("Proteklo je: " + seconds + " sekundi");
    }
}
