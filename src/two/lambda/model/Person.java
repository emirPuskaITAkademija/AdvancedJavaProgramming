package two.lambda.model;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String name;
    private final String surname;
    private final Gender gender;
    private final LocalDate birthday;

    public Person(String name, String surname, Gender gender, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
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
}
