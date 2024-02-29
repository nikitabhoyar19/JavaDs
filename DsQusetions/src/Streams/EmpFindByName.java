package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmpFindByName {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "nikita", 23);
        Employee e2 = new Employee(2, "sagar", 24);

        List<Employee> listEmp = Arrays.asList(e1, e2);

//        List<Employee> listEmp = List.of(new Employee[]{
//                new Employee(4, "nik", 23),
//                new Employee(3, "sag", 24),
//        });

//        for(Employee i : listEmp) {
//            System.out.println(i.getName());
//        }

        List<Employee> result = listEmp.stream().filter(emp -> emp.getName().startsWith("s")).collect(Collectors.toList());

        for(Employee i : result) {
            System.out.println("Name is : " + i.getName());
        }
    }

}
