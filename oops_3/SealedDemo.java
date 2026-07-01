sealed interface Shape permits Triangle {
    abstract public void draw();
}

final class Triangle implements Shape{
    public void draw(){
        System.out.println("Drawing Triangle");
    }
}
class EquilateralTriangle {
    public void draw(){
        System.out.println("Drawing EquilateralTriangle");
    }
}

public class SealedDemo {
    public static void main(String[] args) {
        // parent can hold child type instance
        Shape t1 = new Triangle();
        // Shape t2 = new EquilateralTriangle();
    }
}
