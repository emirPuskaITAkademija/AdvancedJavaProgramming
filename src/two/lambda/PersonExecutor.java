package two.lambda;

import two.lambda.dao.PersonDAO;
import two.lambda.model.Gender;
import two.lambda.model.Person;
import two.lambda.model.PersonChecker;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * <li>1. dinamičke nizove</li>
 * <li>2. funkcionalni interfejsi i lambda operator</li>
 * 1. Consumer<T>
 * 2. Predicate<T>
 * * <li>3. method referenciranje</li></lI>
 */
public class PersonExecutor {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        List<Person> personList = personDAO.readPersonList();
        //printPersons(personList);
        //printPeople(personList, p->true);
        processPeople(personList, p -> true, p -> System.out.println(p));
        System.out.println();
        System.out.println("ENHANCED");
        //printEnhancedPersons(personList);
        System.out.println();
        System.out.println("Functional style");
        //kreirali smo objekat tipa funkctionalnog interfejsa PersonChecker
        printFunctionalStyle(personList);
        //PUNOLJETNE
        System.out.println("PUNOLJETNI");
        //printOlderThan(personList, 18);
        //printPeople(personList, p->p.getAge()>18);
        processPeople(personList, p -> p.getAge() >= 18, p -> System.out.println(p));
        System.out.println("MALOLJETNI");
        //printYoungerThan(personList, 18);
        //printPeople(personList, p->p.getAge()<=18);
        processPeople(personList, p -> p.getAge() < 18, p -> System.out.println(p));
        System.out.println("ŽENE za 8. mart");
        //printWithGender(personList, Gender.FEMALE);
        processPeople(personList, p->p.getGender().equals(Gender.FEMALE), p-> System.out.println(p));
        System.out.println("Muški za 9. mart");


    }

    //STREAMING
    //1. izvor stream
    //2. međuoperacije
    //3. terminirajuću
    static void processPeople(List<Person> listaPersona, Predicate<Person> personChecker, Consumer<Person> consumerPerson) {
        listaPersona.stream().filter(personChecker).forEach(consumerPerson);
    }

    static void printPeople(List<Person> listaPersona, PersonChecker personChecker) {
        for (Person person : listaPersona) {
            if (personChecker.checkPerson(person)) {
                System.out.println(person);
            }
        }
    }

    static void printPersons(List<Person> listaPersona) {
        for (int i = 0; i < listaPersona.size(); i++) {
            Person person = listaPersona.get(i);//1
            System.out.println(person);
        }
    }

    //<1.8
    static void printEnhancedPersons(List<Person> listaPersona) {
        //Ovo je moguće zato što listaPersona -> List, Collection, Iterable
        for (Person p : listaPersona) {
            System.out.println(p);
        }
    }

    static void printFunctionalStyle(List<Person> listaPersona) {
        //Streaming API -> Lambda odnosno objekti kreirani preko lambde -> Fun
        Consumer<Person> consumer = (Person p) -> System.out.println(p);
        listaPersona.forEach(consumer);
    }

    static void printOlderThan(List<Person> listaPersona, int age) {
        //Ovo je moguće zato što listaPersona -> List, Collection, Iterable
        for (Person p : listaPersona) {
            if (p.getAge() < age) {
                System.out.println(p);
            }
        }
    }

    static void printYoungerThan(List<Person> listaPersona, int age) {
        //Ovo je moguće zato što listaPersona -> List, Collection, Iterable
        for (Person p : listaPersona) {
            if (p.getAge() >= age) {
                System.out.println(p);
            }
        }
    }

    static void printWithGender(List<Person> listaPersona, Gender spol) {
        //Ovo je moguće zato što listaPersona -> List, Collection, Iterable
        for (Person p : listaPersona) {
            if (p.getGender().equals(spol)) {
                System.out.println(p);
            }
        }
    }

    static void isprintajSveOsobeČijeImePočinjeSa(List<Person> people, String startsWith) {
        for (Person person : people) {
            if (person.getName().startsWith(startsWith)) {
                System.out.println(person);
            }
        }
    }
}
