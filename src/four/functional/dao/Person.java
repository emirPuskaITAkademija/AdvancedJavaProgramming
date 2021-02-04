package four.functional.dao;

import two.lambda.model.Gender;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person  implements Comparable<Person>{
    private int id;
    private  String name;
    private  String surname;
    private  Gender gender;
    private  LocalDate birthday;

    public Person(){

    }

    public Person(String name, String surname, Gender gender, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthday = birthday;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }


    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    //TIP varijabla = podatak
    public int getAge() {
        //LocalDate -> static
        LocalDate now = LocalDate.now();
        //instncne funkcije
        Period periodOdRodjenja = birthday.until(now);
        int years = periodOdRodjenja.getYears();
        return years;
    }

    @Override
    public String toString() {
        return name + " " + surname + " , rođen: " + birthday.toString() + ", spol: " + gender.toString();
    }


    //p1.equals(p2) p2 nije tipa Person
    @Override
    public boolean equals(Object obj) {

        if(obj instanceof Person){
            Person comparedPerson = (Person) obj;
            return id == comparedPerson.getId();
        }
        return false;

    }

    @Override
    public int hashCode() {
        return id;
    }

    // -1 this compare to o LESS THAN
    //  0 this compare to o EQUAL
    //  1 this compare to o GREATER THANž

    @Override
    public int compareTo(Person o) {
        int result = 0;
        result = name.compareTo(o.getName());
        if(result ==0){
            result = surname.compareTo(o.getSurname());
        }
        return result;
    }
}
