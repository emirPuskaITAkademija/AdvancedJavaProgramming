package six;

import four.functional.dao.Person;
import four.functional.dao.PersonDao;

import java.util.Collection;
import java.util.List;

public class Executor {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        List<Person> personList = personDao.getAll();
        printPersons(personList);
        Person person = personList.get(1);
        person.setSurname("Muzevo");
        personDao.update(person);
    }
    static void printPersons(Collection<Person> collection){
        for(Person person: collection){
            System.out.println(person);
        }
    }
}
