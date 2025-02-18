abstract class Shape { // Abstract class
    abstract void draw();  // Abstract method
    abstract void erase(); // New abstract method
}

class Hexagon extends Shape {
    void draw() {
        System.out.println("Drawing a Hexagon");
    }
    
    void erase() {
        System.out.println("Erasing a Hexagon");
    }
}

class Pentagon extends Shape {
    void draw() {
        System.out.println("Drawing a Pentagon");
    }
    
    void erase() {
        System.out.println("Erasing a Pentagon");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Shape hexagon = new Hexagon();
        Shape pentagon = new Pentagon();

        hexagon.draw();  // Outputs: Drawing a Hexagon
        hexagon.erase(); // Outputs: Erasing a Hexagon

        pentagon.draw();  // Outputs: Drawing a Pentagon
        pentagon.erase(); // Outputs: Erasing a Pentagon
    }
}