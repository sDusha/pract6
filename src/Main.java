import Fabric.*;
import AbstractFabric.*;
import Bulder.*;
import Prototype.*;

public class Main {
    public static void main(String[] args) {
        // factory method
        System.out.println("factory method:\n");
        Brewery brewery1 = new Brewery1();
        System.out.println(brewery1.OrderBeer(BeerType.ZeroBeer).getInfo());

        Brewery brewery2 = new Brewery2();
        System.out.println(brewery2.OrderBeer(BeerType.LightBeer).getInfo());


        // abstract method
        System.out.println("\n\nabstract method:\n");
        Client client1 = new Client(new AbstractFactory1());
        Client client2 = new Client(new AbstractFactory2());
        client1.printInfo();
        client2.printInfo();

        //builder method
        System.out.println("\n\nbuilder method\n");
        Builder1 fact1 = new Builder1();
        Builder2 fact2 = new Builder2();
        Director director1 = new Director(fact1);
        Director director2 = new Director(fact2);
        director1.DoIt();
        Glass glass = fact1.GetProduct();
        director2.DoIt();
        Glass glass2 = fact2.GetProduct();
        glass.printInfo();
        glass2.printInfo();

        // Prototype method
        System.out.println("\n\nPrototype method\n");
        Shape shape1 = new Shape1(12);
        Shape shape2 = new Shape2("Black");
        Shape shape11 = shape1.clone();
        Shape shape12 = shape1.clone();
        System.out.println(shape1.hashCode());
        System.out.println(shape2.hashCode());
        System.out.println(shape11.hashCode());
        System.out.println(shape12.hashCode());

    }
}