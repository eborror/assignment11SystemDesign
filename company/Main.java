package company;

import company.employees.*;
import company.departments.*;
import company.roles.*;
import company.utils.Utility;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 101, "IT");
        Employee developer = new Developer("Bob", 102, "Java");
        
        Department hr = new HRDepartment();
        Department it = new ITDepartment();
        
        Role hrExecutive = new HRExecutive();
        Role softwareEngineer = new SoftwareDeveloper();
        
        manager.displayInfo();
        manager.work();
        
        developer.displayInfo();
        developer.work();
        
        hr.departmentInfo();
        it.departmentInfo();
        
        hrExecutive.performDuties();
        softwareEngineer.performDuties();
        
        Utility.printMessage("Execution Complete.");
    }
}
