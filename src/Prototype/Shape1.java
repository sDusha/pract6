package Prototype;

public class Shape1 implements Shape {
    private final int sqr;

    public int getSqr() {
        return sqr;
    }

    public Shape1(int sqr) {
        this.sqr = sqr;
    }

    public Shape1(Shape1 shape1) {
        this.sqr = shape1.getSqr();
    }

    @Override
    public Shape clone() {
        return new Shape1(this);
    }
}
