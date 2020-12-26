package konsultacije;

import two.lambda.dao.PersonDAO;
import two.lambda.model.Gender;
import two.lambda.model.Person;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * LAMBDA se koristi kao shortcut za new kada se
 * kreira objekat tipa funkcionalnog interfejsa.
 *
 * <li>1. Consumer<T></li>
 * <li>2. Predicate<T></li>
 */
public class PersonTester {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        List<Person> personList = personDAO.readPersonList();
        Printer printer = new Printer(personList);
        Consumer<Person> personConsumer = (Person p) -> System.out.println(p);
        Predicate<Person> personTester = (p) -> true;
        //printer.printAllPersons();
        printer.consumeTestedPersons(p -> true, System.out::println);
        //printer.printAllAdults(18);
        printer.consumeTestedPersons(p -> p.getAge() >= 18, p -> System.out.println(p));
        //printer.printWithGender(Gender.FEMALE);
        printer.consumeTestedPersons(p -> p.getGender().equals(Gender.FEMALE), p -> System.out.println(p));

    }

}
