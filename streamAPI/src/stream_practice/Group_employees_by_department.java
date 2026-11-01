package stream_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Group_employees_by_department {

    public static void execute()
    {
        List<Employee> employees = Arrays.asList(new Employee("Tanuj",50000.25,"IT"),
                new Employee("Praveen",28000.75,"SALES"),
                new Employee("Shivam",80000.55,"HEALTH"),
                new Employee("Atul",45000.55,"SALES"));

        Map<String,List<String>> res = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())));

        System.out.println("Problem 18. Grouped employees are: "+res);
    }
}
