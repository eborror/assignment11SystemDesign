package company.employees;

// Abstract Class: Employee
public abstract class Employee {
    protected String name;
    protected int id;
    
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public Employee() {
        this("Unknown", 0);
    }
    
    public abstract void work();
    
    public void displayInfo() {
        System.out.println("Employee: " + name + ", ID: " + id);
    }
}
