package Bulder;

public class Builder1 implements Builder {
    private final Glass glass = new Glass();
    @Override
    public void choseRim() {
        glass.setRim("Оправа номер 1");
    }

    @Override
    public void choseValue() {
        glass.setValue("Линзы типа 1");
    }

    @Override
    public Glass GetProduct() {
        return glass;
    }
}
