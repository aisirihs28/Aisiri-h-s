package circle;

public class circle {
    double radius;

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + area);
    }

    void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of Circle = " + circumference);
    }

    public static void main(String[] args) {
        circle c = new circle();

        c.radius = 7;

        c.calculateArea();
        c.calculateCircumference();
    }


}
