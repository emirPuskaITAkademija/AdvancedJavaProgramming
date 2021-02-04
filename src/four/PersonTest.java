package four;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        String tip = analyzePerson(person);
        System.out.println(tip);
        tip = analyzePerson(new Penzioner());
        System.out.println(tip);
        tip = analyzePerson(new Profesor());
        System.out.println(tip);
    }

    static String analyzePerson(Person p){
        if(p instanceof Profesor){
            return "PROFESOR";
        }else if(p instanceof  Penzioner){
            return "PENZIONER";
        }else{
            return "PERSONA";
        }
    }
}
