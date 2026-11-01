package stream_practice;

import java.util.*;
import java.util.stream.Collectors;

public class GroupEmployeesByDepartmentAndAge {
    public static void execute() {

        List<Employee> employees = Arrays.asList(new Employee("Tanuj", 50000.25, "IT"),
                new Employee("Praveen", 28000.75, "SALES", 25),
                new Employee("Shivam", 80000.55, "HEALTH", 30),
                new Employee("Atul", 45000.55, "SALES", 25),
                new Employee("Tanuj", 45000.55, "SALES", 30));

        Map<String, Map<Integer, List<String>>> grouped = employees.stream()
                .collect(Collectors.groupingBy(e -> e.department,
                        Collectors.groupingBy(e -> e.age,
                                Collectors.mapping(e -> e.name, Collectors.toList()))));

        System.out.println("Problem 19. Grouped employees by department and age are: " + grouped);
    }
}