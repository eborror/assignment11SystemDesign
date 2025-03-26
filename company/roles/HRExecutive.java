package company.roles;

// Class: HR Executive implementing Role
public class HRExecutive implements Role {
    @Override
    public void performDuties() {
        System.out.println("HR Executive is recruiting new employees.");
    }
}
