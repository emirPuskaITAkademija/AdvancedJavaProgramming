package five;

import four.functional.dao.Person;
import four.functional.dao.PersonDao;
import two.lambda.model.Gender;

import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tester {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        List<Person> personList = personDao.getAll();
        Supplier<Person> personSupplier = ()->new Person("Borislav", "Domazet", Gender.MALE, LocalDate.of(1988, 5, 11));


        Printer<String> personNamePrinter = new Printer<>();

        Stream<Person> personStream = personList.stream();
        //Lambda je shortcut za new ->
        //Method referencing ::
        personStream.filter(p->p.getAge()>18)
                .map(p->p.getName()) // Stream<String>
                .forEach(Tester::printName);

    }

    static void printName(String name){
        System.out.println(name);
    }

     static class Printer<E>{
        public void print(E e){
            System.out.println(e);
        }
    }
}
