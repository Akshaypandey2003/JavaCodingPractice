package stream_practice;

public class Employee
{
    String name;
    double salary;

    String department;

    int age;

    Employee(String name , double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    Employee(String name, double salary, String department)
    {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    Employee(String name, double salary, String department, int age)
    {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public String getName()
    {
        return this.name;
    }

    public double getSalary()
    {
        return this.salary;
    }
}
