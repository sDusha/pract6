package Fabric;

public class Brewery2 extends Brewery{

    @Override
    public Beer createBeer(BeerType type) {
        return switch (type) {
            case DarkBeer -> new DarkBeer(2);
            case ZeroBeer -> new ZeroBeer(2);
            case LightBeer -> new LightBeer(2);
        };
    }
}
