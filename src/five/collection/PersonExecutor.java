package five.collection;

import four.functional.dao.Person;
import four.functional.dao.PersonDao;
import two.lambda.model.Gender;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Iterator -> enhanced for loop
 * <p>
 * Stream<E>->Spliterator-> forEach
 * <p>
 * <li>1. Predicate<E>  -> test E </li>
 * <li>2. Consumer<E></li>
 * <li>3. Function<T, R></li>
 * <li>4. Supplier<T></li>
 */
public class PersonExecutor {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Adi");
        names.add("Vejsil");
        //processElements(names, name->true, name-> System.out.println(name));
        PersonDao personDao = new PersonDao();
        List<Person> listOfPersons = personDao.getAll();
        Set<Person> setOfPersons = new TreeSet<>(listOfPersons);
        //Anonymous inner type
        Predicate<Person> testerAnonymous = p -> p.getGender().equals(Gender.MALE);
        Consumer<String> personConsumer = p -> System.out.println(p);
        //processElements(setOfPersons, testerAnonymous, p->p.getName(), personConsumer);
        listOfPersons.stream().filter(testerAnonymous).map(p->p.getBirthday()).forEach(name-> System.out.println(name));
        HashSet<Person> personHashSet = transferElements(()->listOfPersons, ()->new HashSet<>());
    }


    /*
       Stream<>
       <li>1. IZVOR stream -> bilo što što nasljeđuje Collection
       <li>2. MEĐUOPERACIJE -> funkcije koje mi pozovemo nad Stream a one nam vrate
       ponovno Stream ...
       <li>3. TERMINIRAJUĆA ->
     */
    static <E, S> void processElements(Collection<E> listOfPersons, Predicate<E> tester, Function<E, S> transformer, Consumer<S> consumer) {
        listOfPersons.stream()
                .filter(tester)
                .map(transformer)
                .forEach(consumer);
    }

    //1. Unbounded
    //2. Bounded  SOURCE extends Collection<E>
    static <E, SOURCE extends Collection<E>, DEST extends Collection<E>> DEST transferElements(Supplier<SOURCE> sourceCollection, Supplier<DEST> destSupplier){
        DEST result = destSupplier.get();
        for(E element: sourceCollection.get()){
            result.add(element);
        }
        return result;
    }
}
