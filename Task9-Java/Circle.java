package session10;
// Define the child class Circle.java
class Circle extends Shape {
    float area; // Variable to store area of a circle
    // Implement the abstract method to calculate area of circle
    // @param rad a float variable storing value of radius
    // @return void

    @Override
    void calculate(float rad) {
        area = getPI() * rad * rad;
        System.out.println("Area of circle: " + area);
    }

    // Define the child class Rectangle.java
    class Rectangle extends Shape{
        float perimeter; // Variable to store perimeter value
        float length= 10; // Variable to store length
        // Implement the abstract method to calculate the perimeter
        // @param width a float variable storing width
        // @return void

        @Override
        void calculate(float width) {
            perimeter = 2 * (length+width);
            System.out.println("perimeter of the Rectangle is: " + perimeter);
        }
    }
}
