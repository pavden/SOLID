package ua.training;

public class LSP {

    static Rectangle getRectangle() {
        return new Rectangle();
    }

    public static void main(String[] args) {
        Rectangle rectangle = getRectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(5);
        System.out.println(rectangle.getArea());
    }

}

interface Shape {
    int getArea();
}

class Rectangle implements Shape {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}

class Square implements Shape {
    private int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getArea() {
        return width * width;
    }
}