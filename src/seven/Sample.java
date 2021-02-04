package seven;

import four.functional.dao.Person;
import four.functional.dao.PersonDao;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

//1. Function<T, R>
//2. BiFunction<T, A, R>
public class Sample {
    public static void main(String[] args) {
       /* List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //Iterator -> enhanced for loop
        int suma = 0;
        for(Integer number : numbers){
            if(number % 2 == 0){
                suma = suma+ number;
            }
        }
        System.out.println("Suma = " + suma);

        Printer printer = new Printer();
        //Martin ..Collection pipeline -> 1. izvor
        //IDENTITY value -> INITAL VALUE
        int suma1 = numbers
                //1. IZVOR
                .stream()//STream brojeva
                //2. MODIFIKUJEMO
                .filter(it->it%2==0) //ostavio u streamu samo parne brojeve
                .map(Sample::transform)//te preostale brojeve cu multipcirati sa 2
                //3. TERMINIRAJUĆA operacija
                .reduce(0, (b1, b2)->b1+b2);
        System.out.println("Spliterator suma = " + suma1);
        int suma2 = numbers
                .stream()
                .parallel()
                .filter(it->it%2==0)//parni
                .mapToInt(Sample::transform)
                .sum();
        System.out.println("Spliterator suma 2 = " + suma2);
        //forEach
        System.out.println("Printamo duplicirane element");
        numbers
                .stream().parallel()
                .map(Sample::transform) // main
                .forEach(printer::print);//
        */

        String[] nizImena = {"Emil", "Harun", "Adi", "Damir", "Ajša"};
        String value = "Emil";
        String valueUpper = value.toUpperCase();// toUpperCase -> instancna
        System.out.println(valueUpper);
        //Reference to a instance method of an arbitrary object of particular type
        Stream.of(nizImena)//Stream imena sa velikim i malim slovom
                .map(String::toUpperCase)//Stream imena sa velikim slovom
                .forEach(it -> System.out.println(it));

        PersonDao personDao = new PersonDao();
        List<Person> personList = personDao.getAll();
        Set<Person> destinacija = transferElement(personList, ()-> new HashSet<>());
        Set<Person> destinacija2 = transferElement(personList, TreeSet::new);

    }
    // T , SOURCE, DEST
    static <T, SOURCE extends Collection<T>, DEST extends Collection<T>> DEST transferElement(SOURCE izvornuKolekciju, Supplier<DEST> destCollSupplier){
        DEST dest = destCollSupplier.get();
        for(T t: izvornuKolekciju){
            dest.add(t);
        }
        return dest;
    }

    //STATIC METHOD REFERENCIRANJE
    static Integer transform(Integer oneNumber){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException exc){
            System.err.println(exc.getMessage());
        }
        System.out.println(Thread.currentThread().getName());
        return oneNumber*2;

    }

    //
    private static class Printer{
        // INSTANCE method referenciranje
        public <T> void print(T element){
            System.out.printf("Element %s printa %s thread%n",element, Thread.currentThread().getName());
        }
    }
}
