package AbstractFabric;

public class AbstractFactory2 implements AbstractFactory {
    @Override
    public BeerBottle createBeerBottle() {
        return new BeerBottle2();
    }

    @Override
    public BeerTier createBeerType() {
        return new BeerTier2();
    }
}
