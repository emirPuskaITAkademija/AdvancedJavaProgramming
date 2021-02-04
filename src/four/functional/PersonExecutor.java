package four.functional;

import four.functional.dao.Dao;
import four.functional.dao.Person;
import four.functional.dao.PersonDao;
import two.lambda.model.Gender;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Java 8..
 * <p> Funkcionalno programiranje</p>
 * <li>1. Predicate<Person></li>
 * <li>2. Consumer<Person></li>
 * <li>3. Function<Person, String></li>
 */
public class PersonExecutor {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        List<Person> personList = personDao.getAll();
        System.out.println("IDE List");
        printPersons(personList);
        System.out.println();
        List<String> personNames = PersonExecutor.transformToNames(personList);
        System.out.println("IMENA LJUDI");
        for(String name: personNames){
            System.out.println(name);
        }

        Set<Person> setOfPersons = new TreeSet<>(personList);
        System.out.println("IDE Set");
        printPersons(setOfPersons);
        /*
        Person p1 = new Person("Melisa", "Herović", Gender.FEMALE, LocalDate.now());
        Person p2 = new Person("Nevena", "Pandurević", Gender.FEMALE, LocalDate.now());
        String text = "Melisa";
        boolean isEqual = p1.equals(text);
        boolean pEqual = p1.equals(p2);*/
    }

    static void printPersons(Collection<Person> personList){
        Iterator<Person> personIterator = personList.iterator();
        while (personIterator.hasNext()){
           Person person = personIterator.next();
            System.out.println(person);
        }
    }

    //svaki collection objekat je IZVOR STREAM
    //INTERMEDIATE OPERATIONS
    //TERMINATE OPERATIONS
    static List<String> transformToNames(List<Person> personList){
        Function<Person, String> transformers = p -> p.getName();
        return personList.stream()//IZVOR STREAM
                .map(transformers)//INTERMEDIATE OPERATION
                .collect(Collectors.toList());
    }
}
