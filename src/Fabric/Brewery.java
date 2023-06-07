package Fabric;

public abstract class Brewery {
    public abstract Beer createBeer(BeerType type);

    public Beer OrderBeer(BeerType type){
        Beer beer = createBeer(type);
        beer.make();
        beer.pour();

        System.out.println("Заказ исполнен, ");
        return beer;
    }
}
