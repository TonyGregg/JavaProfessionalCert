package collections;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * Created by anton on 6/8/2018 8:03 PM
 **/
public class EmployeeSorter {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        Employee employee =  new Employee("Antony Genil","Gregory",1);
        employeeList.add(employee);

        employee =  new Employee("John Viyani","Gregory",2);
        employeeList.add(employee);

        employee =  new Employee("Gleetus","Gregory",3);
        employeeList.add(employee);

        employee =  new Employee("Steffi Graf","Peter Raj",4);
        employeeList.add(employee);

        employee =  new Employee("Joel","Telesh",5);
        employeeList.add(employee);

        employee =  new Employee("Joshy","Alphonse",6);
        employeeList.add(employee);

        employee =  new Employee("Minu","Belgi",20);
        employeeList.add(employee);


        employeeList.forEach(employee1 -> System.out.println(employee1));


        // 1. Java 7 Approach

        System.out.println("After Sorting\n\n");

        /*Collections.sort(employeeList, new EmployeeComparator());

        // To reverse

        Collections.reverse(employeeList);

        employeeList.forEach(employee2 -> System.out.println(employee2));*/

        // 2. Java 8 approach # 1

//        employeeList.sort((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

        // 3. Java 8 Approach # 2

//        employeeList.sort(new EmployeeComparator());
//
//        Collections.reverse(employeeList);
//
//        employeeList.forEach(employee2 -> System.out.println(employee2));

        // 4. Java 8 Approach # 3
//        employeeList.sort(Comparator.comparing(Employee::getLastName));
//
//        Collections.reverse(employeeList);
//
//        employeeList.forEach(System.out::println);

        // 5. Java 8 Approach # 4
        employeeList.sort(comparing(Employee::getLastName)
                .reversed()
                .thenComparing(Employee::getId)
                .reversed());



        employeeList.forEach(System.out::println);



    }
}
