package konsultacije;

import four.functional.dao.Person;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Printer {
    private final List<Person> personList;

    public Printer(List<Person> persons) {
        this.personList = persons;
    }

    /**
     * <li>1. stream</li>
     * <li>2. međuoperacije</li>
     * <li>3. terminirali stream</li>
     *
     *
     * @param personTester
     * @param personConsumer
     */
    public void consumeTestedPersons(Predicate<Person> personTester, Consumer<Person> personConsumer){
        /*for(Person p: personList){
            if(personTester.test(p)){
                personConsumer.accept(p);
            }
        }*/
        personList.stream()//IZVOR STREAM
                .filter(personTester)//MEĐUOPERACIJA
                .forEach(personConsumer);//TERMINIRAJUĆA
    }


/*
    public void printAllPersons() {
        System.out.println("Sve persone:");
        for (Person p : personList) {
            System.out.println(p);
        }
    }

    public void printAllAdults(int age) {
        System.out.println();
        System.out.println("Adults:");
        for (Person p : personList) {
            if (p.getAge() >= age) {
                System.out.println(p);
            }
        }
    }

    public void printWithGender(Gender gender){
        System.out.println();
        System.out.println("Females:");
        for (Person p : personList) {
            if (p.getGender().equals(gender)) {
                System.out.println(p);
            }
        }
    }*/
}
