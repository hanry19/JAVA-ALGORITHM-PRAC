package Liskov;

public class DoWork {

    public void work() {
        Rectangle rectangle =  new Square();
        rectangle.setWidth(4);
        rectangle.setHeight(5);


        if(!isCheck(rectangle)) {
            throw new RuntimeException();
        }
        System.out.println(rectangle.getArea());

        Square square = new Square();
        square.setHeight(6);
        System.out.println("square is "+square.getSquareArea());
    }

    public boolean isCheck(Rectangle rectangle) {
        return rectangle.getArea() == 20;
    }

}

class Main {

    public static void main(String[] args) {
        DoWork main = new DoWork();
        main.work();
    }
}

