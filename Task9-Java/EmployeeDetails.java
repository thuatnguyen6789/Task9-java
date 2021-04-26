package session10;
// Define the EmployeeDetails.javaclass
public class EmployeeDetails {
    // @param args the command line arguments
    public static void main(String[] args) {
        // Instantiate the Employee class object
        Employee objEmp = new Employee("E001", "Maria Nemeth", 40000);

        // Invoke the calcCommission() with float argument
        objEmp.calcCommission(20000F);
        objEmp.displayDetails(); // Print the employee details
    }
}
