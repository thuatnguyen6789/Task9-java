package session10;

class PartimeEmployee extends Employee{
    // Subclass specific variable
    String shift; // Variable to store shift information
    // Parameterized constructor to initialize values based one user input
    // @param id a String variable storing employee ID
    // @param name a String variable storing employee name
    // @param shift a String variable storing shift information

    public PartimeEmployee(String id, String name, int sal, String shift) {
        // Invoke the superclass constructor
        super(id, name, sal);
        this.shift = shift;
    }
    // Overridden method to display employee details
    // @return void
    @Override
    public void displayDetails() {
        calcCommission(12); // Invoke the inherited method
        super.displayDetails(); // Invoke the superclass display method
        System.out.println("Working shift: " + shift);
    }
}
