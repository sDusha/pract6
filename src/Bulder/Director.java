package Bulder;

public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void DoIt(){
        builder.choseRim();
        builder.choseValue();
    }
}
