package Liskov;

public class Square extends Rectangle {

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    public double getSquareArea(){
        this.width = this.height;
        return this.getWidth() * this.getHeight();
    }
}