package four.functional.dao;

import two.lambda.model.Gender;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


//
public class PersonDao implements Dao<Person> {
    @Override
    public void create(Person tableRow) {

    }

    @Override
    public Person retrieve(int id) {
        return null;
    }

    @Override
    public Person update(Person person) {
        try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
         PreparedStatement ps = connection.prepareStatement("UPDATE person SET surname=? WHERE id=?");){
            ps.setString(1, person.getSurname());
            ps.setInt(2, person.getId());
            ps.executeUpdate();
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void delete(Person tableRow) {

    }

    @Override
    public List<Person> getAll() {
        List<Person> personList = new ArrayList<>();
        //1. Connection connection = DriverManager --> url, username, password
        //2. Statement statement -> SQL i connection
        //3. ResultSet resultSet
        try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement()){
            ResultSet resultSet = statement.executeQuery("SELECT * FROM person");
            while(resultSet.next()){
                Person person = new Person();
                //da pošaljete naziv kolone ili redni broj koji počinje od 1
                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString(2));
                person.setSurname(resultSet.getString("surname"));
                Date birthdate = resultSet.getDate("birthday");//java.sql.Date
                // java.time.LocalDate
                person.setBirthday(birthdate.toLocalDate());
                String spol = resultSet.getString("gender");
                person.setGender(spol.equals("MALE")? Gender.MALE: Gender.FEMALE);
                personList.add(person);
            }
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return personList;
    }
}
