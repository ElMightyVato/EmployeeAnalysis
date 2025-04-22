public class Employee {
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }

    // Setter for salary (used for updates)
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // ToString method for printing!

    @Override
    public String toString() {
        return name + " | Age: " + age + " | Salary: $" + String.format("%.2f", salary);
    }
}
