package company.departments;

// Base Class: Department
public class Department {
    protected String departmentName;
    
    public Department(String departmentName) {
        this.departmentName = departmentName;
    }
    
    public Department() {
        this("General");
    }
    
    public void departmentInfo() {
        System.out.println("Department: " + departmentName);
    }
}
