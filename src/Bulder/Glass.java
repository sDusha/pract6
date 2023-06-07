package Bulder;

public class Glass {
    private String value;
    private String rim;

    public void setRim(String rim){
        this.rim = rim;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void printInfo(){
        System.out.println("Оправа: " + rim +"\nТип линз: " + value);
    }
}
