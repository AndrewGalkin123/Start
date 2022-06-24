package homework18;

import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static Scanner inputParams = new Scanner(System.in);
    static String action;
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet(new EmployeeComparator());
        try {
            System.out.println("Choose action:" + "\n" + "1.Add employee" + "\n" + "2.exit, press any key");
            action = inputParams.nextLine();
            while (action.equals("add".toLowerCase(Locale.ROOT).trim())) {
                Employee employee = createEmployee();
                employees.add(employee);
                System.out.println("Choose action:" + "\n" + "1.Add employee" + "\n" + "2.exit, press any key");
                action = inputParams.nextLine();
            }
            for (Employee e : employees) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static Employee createEmployee() {
        System.out.println("Enter name : ");
        String name = inputParams.nextLine();
        System.out.println("Enter secondName : ");
        String secondName = inputParams.nextLine();
        System.out.println("Enter salary : ");
        int salary = inputParams.nextInt();
        System.out.println("Enter employeeType : ");
        String Type = inputParams.nextLine();
        String employeeType = inputParams.nextLine();
        return (new Employee(name, secondName, salary, employeeType));
    }
}


class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Integer.compare(employee2.getSalary(), employee1.getSalary());
    }
}

class Employee {
    private final String name;
    private final String secondName;
    private final int salary;
    private final String employeeType;

    public Employee(String name, String secondName, int salary, String employeeType) {
        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
        this.employeeType = employeeType;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee :" + '\n' +
                "  name=" + name + '\n' +
                "  secondName=" + secondName + '\n' +
                "  salary=" + salary + '\n' +
                "  employeeType=" + employeeType + '\n';
    }
}

