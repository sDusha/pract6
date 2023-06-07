package AbstractFabric;

public class AbstractFactory1 implements AbstractFactory {
    @Override
    public BeerBottle createBeerBottle() {
        return new BeerBottle1();
    }

    @Override
    public BeerTier createBeerType() {
        return new BeerTier1();
    }
}
