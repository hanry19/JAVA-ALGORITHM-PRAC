package Liskov;

public class Rectangle {

    protected double width;
    protected double height;

    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return this.width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }




    public double getArea() {
        System.out.println("width = " + width);
        System.out.println("height = " + height);

        return this.getWidth() * this.getHeight();
    }
}