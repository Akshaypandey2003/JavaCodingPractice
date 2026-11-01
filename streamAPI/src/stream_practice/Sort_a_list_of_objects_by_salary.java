package stream_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;


public class Sort_a_list_of_objects_by_salary {

    public static void execute()
    {
        List<Employee> employees = Arrays.asList(
                new Employee("Tanuj",50000.25),
                new Employee("Praveen",28000.75),
                new Employee("Shivam",80000.55)
        );
        // Way-1
        List<Employee> res = employees.stream()
                .sorted((e1,e2)->(int)(e1.salary-e2.salary)).collect(Collectors.toList());

        //way -2
        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());

        System.out.println("problem 17. way-1: Sorted employees: "+res);
        System.out.println("problem 17. way-2: Sorted employees: "+sorted);
    }




}
