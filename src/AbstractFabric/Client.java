package AbstractFabric;

public class Client {
    private final BeerTier beerTier;
    private final BeerBottle beerBottle;

    public Client(AbstractFactory abstractFactory) {
        this.beerBottle = abstractFactory.createBeerBottle();
        this.beerTier = abstractFactory.createBeerType();
    }

    public void printInfo(){
        beerTier.printInfo();
        beerBottle.printInfo();
    }
}
