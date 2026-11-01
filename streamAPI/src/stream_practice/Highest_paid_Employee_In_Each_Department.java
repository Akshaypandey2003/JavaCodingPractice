package stream_practice;
import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class Highest_paid_Employee_In_Each_Department {
    

    public static void execute()
    {
         List<Employee> employees = Arrays.asList(
    new Employee("Alice", "IT", 70000),
    new Employee("Bob", "IT", 90000),
    new Employee("Charlie", "HR", 60000),
    new Employee("David", "HR", 80000),
    new Employee("Eve", "Sales", 75000),
    new Employee("Frank", "Sales", 65000)
);

Map<String, String> result = employees.stream()
    .collect(Collectors.groupingBy(
        emp -> emp.department,
        Collectors.collectingAndThen(
            Collectors.maxBy(Comparator.comparingDouble(emp -> emp.salary)),
            optional -> optional.get().name
        )
    ));

    System.out.println("Problem 32. Highest_paid_Employee_In_Each_Department "+ result);
    }
}
