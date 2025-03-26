package company.employees;

// Concrete Class: Developer
public class Developer extends Employee {
    private String programmingLanguage;
    
    public Developer(String name, int id, String programmingLanguage) {
        super(name, id);
        this.programmingLanguage = programmingLanguage;
    }
    
    public Developer() {
        super();
        this.programmingLanguage = "Java";
    }
    
    @Override
    public void work() {
        System.out.println(name + " is coding in " + programmingLanguage);
    }
}
