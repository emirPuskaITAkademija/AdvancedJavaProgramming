package three.generics;

import two.lambda.dao.PersonDAO;
import four.functional.dao.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * <li>1. Consumer<E></E></li>
 */
public class PersonTester {


    public static void main(String[] args) {

        PersonDAO personDAO = new PersonDAO();
        List<Person> personList =  personDAO.readPersonList();
        printElements(personList);
        List<String> names = new ArrayList<>();
        names.add("Emila");
        names.add("Damir");
        names.add("Adi");
        printElements(names);
    }

    static <E> void printElements(List<E> elements){
        for(E e : elements){
            System.out.println(e);
        }
    }
}
