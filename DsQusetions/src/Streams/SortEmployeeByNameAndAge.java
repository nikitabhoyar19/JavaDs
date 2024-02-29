package Streams;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeByNameAndAge {

    public static void main(String[] args) {

        List<Employee> employees = List.of( new Employee[]{
                        new Employee(1, "Ajay", 35),
                        new Employee(2, "Vijay", 5),
                        new Employee(5, "Vijay", 20),
                        new Employee(3, "Zack", 30),
                        new Employee(4, "David", 51)
                });


        List<Employee> sortedList = employees.stream()
                .sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge)).collect(Collectors.toList());

        for(Employee emp : sortedList) {
            System.out.println(emp.getAge());
        }

        List<Employee> sortedEmployees = employees.stream()
                .filter(e -> e.getAge() >= 30)
                .sorted(Comparator.comparing(Employee::getName))
                .toList();

        for(Employee emp : sortedEmployees) {
            System.out.println(emp.getName());
        }

    }

}
