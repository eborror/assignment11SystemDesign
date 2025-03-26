package company.employees;

// Concrete Class: Manager
public class Manager extends Employee {
    private String department;
    
    public Manager(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }
    
    public Manager() {
        super();
        this.department = "General";
    }
    
    @Override
    public void work() {
        System.out.println(name + " is managing the " + department + " department.");
    }
}
