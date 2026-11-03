class Shape {
    double area(){
        return  0;
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.14* radius*radius;
    }
}
class Rectangle extends Shape{
    double length , breath;

    Rectangle(double length,double breath){
        this.length = length;
        this.breath = breath;
    }

    @Override
    double area() {
        return length*breath;
    }
}
class Triangle extends Shape{
    double base,height;
    Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5*base * height;
    }
}
public class ShapeTest{
    public static void main(String[] args){
        Shape[] Shapes = new Shape[3];
        Shapes[0] = new Circle(5);
        Shapes[1] = new Rectangle(10,5);
        Shapes[2] = new Triangle(8,6);

        for(int i =0;i<Shapes.length;i++){
            System.out.println("Area of:" +Shapes[i].getClass().getSimpleName()+Shapes[i].area());
        }
    }
}