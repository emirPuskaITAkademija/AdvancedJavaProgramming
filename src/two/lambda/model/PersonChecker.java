package two.lambda.model;

@FunctionalInterface
public interface PersonChecker {

    //potreban je objekat tipa PersonChecker
    boolean checkPerson(Person person);

}
