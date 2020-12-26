package two.lambda.dao;

import two.lambda.model.Gender;
import two.lambda.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
    List<Person> personList = new ArrayList<>();

    public List<Person> readPersonList() {
        personList.add(new Person("Borislav", "Domazet", Gender.MALE, LocalDate.of(1988, 5, 11)));
        personList.add(new Person("Almir", "Brkić", Gender.MALE, LocalDate.of(1991, 8, 18)));
        personList.add(new Person("Elma", "Đido", Gender.FEMALE, LocalDate.of(2000, 1, 1)));
        personList.add(new Person("Vejsil", "Sarajlić", Gender.MALE, LocalDate.of(1991, 7, 8)));
        personList.add(new Person("Melisa", "Herović", Gender.FEMALE, LocalDate.of(1988, 5, 11)));
        personList.add(new Person("Nevena", "Pandurević", Gender.FEMALE, LocalDate.of(2006, 5, 11)));
        personList.add(new Person("Harun", "Bucalović", Gender.MALE, LocalDate.of(2003, 3, 1)));
        personList.add(new Person("Damir", "Fejzić", Gender.MALE, LocalDate.of(2001, 2, 28)));
        personList.add(new Person("Albin", "Fehrić", Gender.MALE, LocalDate.of(2005, 5, 11)));
        personList.add(new Person("Adna", "Kuduzović", Gender.FEMALE, LocalDate.of(2008, 4, 1)));
        personList.add(new Person("Emir", "Puška", Gender.UNKNOWN, LocalDate.of(1988, 8, 8)));
        return personList;
    }
}
