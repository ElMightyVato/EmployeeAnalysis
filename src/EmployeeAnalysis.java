import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class EmployeeAnalysis {
    public static void main(String[] args) {
        // Create list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Zero", 18, 48000),
                new Employee("Naruto", 38, 45000),
                new Employee("Luffy", 21, 1800000000),
                new Employee("GodUssop", 24, 500000000),
                new Employee("Subaru", 17, 60000),
                new Employee("Ippo", 21, 451346),
                new Employee("Zatch", 21, 70000),
                new Employee("Bankai", 49, 52000),
                new Employee("Saitama", 19, 10000000),
                new Employee("Ainz", 100, 70000)
        );

        // 1. Filter and print employees earning more than $50,000
        System.out.println("Employees earning more than 70000: ");
        employees.stream()
                .filter(e -> e.getSalary() > 70000) // I'm keeping only employees with salaries greater than 70000
                .map(Employee::getName)// Here I'm converting each employee to just their name
                .forEach(System.out::println); // I'm printing each name on a new line

        // 2. Average Salary of employees over 30
        OptionalDouble averageSalary = employees.stream()
                .filter(e -> e.getAge() > 30)
                .mapToDouble(Employee::getSalary) // I'm converting employee just their salaries as doubles
                .average(); // Now I'm calculating the average of my filtered salaries

        System.out.println("\nAverage salary of employees over 30: ");
        averageSalary.ifPresent(
                avg -> System.out.println("$" + String.format("%.2f", avg))
                // With, format I'm just grabbing up to the 2 decimal places and printing it with a dollar sign
        );

        // Here I'm doing if no average is present it'll output the following.
        if (!averageSalary.isPresent()) {
            System.out.println("No employees over 30.");
        }

        // 3. Increasing salaries by 10% and creating a new list!
        List<Employee> updatedEmployees = employees.stream()
                .map(e -> new Employee(
                        e.getName(),
                        e.getAge(),
                        e.getSalary() * 1.10 // Increasing it by 10%
                ))
                .collect(Collectors.toList());

        System.out.println("\nUpdated Employee List with 10% Salary Increase: ");
        updatedEmployees.forEach(System.out::println);
    }
}
