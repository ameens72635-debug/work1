class Shape {
    String color = "Blue";

    void displ() {

        System.out.println(color);
    }
}

class Circle extends Shape {
    int radious = 24;

    void calculateArea() {
        System.out.println(2 * 3.14 * radious);
    }
}

class Retangle extends Shape {
    int length = 24;
    int width = 20;

    void calculateArea() {
        System.out.println(length * width);
    }
}

public class Design {
    public static void main(String[] args) {
        Retangle r = new Retangle();
        Circle c = new Circle();
        c.displ();
        c.calculateArea();
        r.calculateArea();
    }
}
