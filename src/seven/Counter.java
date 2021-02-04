package seven;

public class Counter {
    private String name = "Petar Pan";
    private int c = 0;

    public synchronized void increment(){
        c++;
    }

    public synchronized void decrement(){
        c--;
    }

    public int value(){
        return c;
    }

    public void addName(String name){
        synchronized (this){
            this.name = name;
        }
        System.out.println("....");
    }
}
