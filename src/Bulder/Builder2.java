package Bulder;

public class Builder2 implements Builder {
    private final Glass glass = new Glass();

    @Override
    public void choseRim() {
        glass.setRim("Оправа номер 2");
    }

    @Override
    public void choseValue() {
        glass.setValue("Линза типа 2");
    }

    @Override
    public Glass GetProduct() {
        return glass;
    }
}
