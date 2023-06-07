package Fabric;

public class Brewery1 extends Brewery{

    @Override
    public Beer createBeer(BeerType type) {
        return switch (type) {
            case DarkBeer -> new DarkBeer(1);
            case ZeroBeer -> new ZeroBeer(1);
            case LightBeer -> new LightBeer(1);
        };
    }
}