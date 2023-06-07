package Prototype;

public class Shape2 implements Shape {
    private final String color;

    public String getColor() {
        return color;
    }

    public Shape2(String color) {
        this.color = color;
    }

    public Shape2(Shape2 shape){
        this.color = shape.getColor();
    }

    @Override
    public Shape clone() {
        return new Shape2(this);
    }
}
