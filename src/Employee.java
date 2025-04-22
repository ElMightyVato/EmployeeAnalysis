public class Employee {
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name; // Remember with this we are assigning passed variable to the class's variable
        this.age = age;
        this.salary = salary;
    }

    // Getters: Giving us access to the variables
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }

    // Setter for salary (using this to update salary when we give 10% increase
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // ToString method for printing!

    @Override
    public String toString() {
        return name + " | Age: " + age + " | Salary: $" + String.format("%.2f", salary);
    }
}
