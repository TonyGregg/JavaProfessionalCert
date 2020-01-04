package collections;

import java.util.Objects;

/**
 * Created by anton on 6/8/2018 7:47 PM
 **/
public class Employee {


    private final String firstName;
    private final String lastName;
    private final Integer id;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, id);
    }

    public Integer getId() {
        return id;
    }

    public Employee(String firstName, String lastName, Integer id) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return firstName + ", " + lastName + " :: " +id;
    }

}
