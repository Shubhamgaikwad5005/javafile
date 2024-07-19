
abstract class Shape {
    abstract void draw();
}


class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}


class Square extends Shape {
    void draw() {
        System.out.println("Drawing a Square");
    }
}

public class Main {
    public static void main(String[] args) {
       
        Shape[] shapes = {new Circle(), new Square()};
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

