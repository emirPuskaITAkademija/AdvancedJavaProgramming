package five;

import five.demo.IterableNumbers;

import java.util.ArrayList;
import java.util.Iterator;

public class Executor {
    public static void main(String[] args) {
        IterableNumbers nasaKolekcija = new IterableNumbers();
        //Iterator
        for(Number number : nasaKolekcija){
            System.out.println(number);
        }

        ArrayList<String> names = new ArrayList<>();
        names.add("Adi");
    }
}
