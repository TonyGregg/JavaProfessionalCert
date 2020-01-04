package collections;

import java.util.Comparator;

/**
 * Created by anton on 6/8/2018 8:00 PM
 **/
public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
