package four.functional.dao;

import java.util.List;

//JDBC API
//ORM mapiranje
//JPA
public interface Dao<T> {
    String USERNAME = "root";
    String PASSWORD = "Admin2021!";
    String URL = "jdbc:mysql://localhost:3306/person?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";

    public void create(T tableRow);

    public T retrieve(int id);

    public T update(T tableRow);

    public void delete(T tableRow);

    public List<T> getAll();
}
