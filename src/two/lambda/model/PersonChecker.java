package two.lambda.model;

import four.functional.dao.Person;

@FunctionalInterface
public interface PersonChecker {

    //potreban je objekat tipa PersonChecker
    boolean checkPerson(Person person);

}
