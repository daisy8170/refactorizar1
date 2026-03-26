
// class Shape {
//     String type;
//     public Shape(String type) {
//         this.type = type;
//     }
//     public double calculateArea() {
//         if (type.equals("circle")) {
//             double radius = 5;
//             return Math.PI * radius * radius;
//         } else if (type.equals("rectangle")) {
//             double length = 4;
//             double width = 3;
//             return length * width;
//         }
//         return 0;
//     }
// }


// After refactoring
abstract class ShapeRefactored {

    public abstract double calculateArea();
}

class Circle extends ShapeRefactored {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends ShapeRefactored {

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Cadrado extends ShapeRefactored {

    double lado;

    public Cadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return Math.pow(lado, 2);
    }

}

class Triangulo extends ShapeRefactored {

    double base;
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }
}
