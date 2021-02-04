package six.patterns.decorator;

import java.io.*;

public class BeverageDegustator {
    public static void main(String[] args) throws Exception {
        Beverage beverage = new Tea();
        drink(beverage);
        beverage = new Caffe();
        drink(beverage);
        Beverage caffe = new Caffe();
        beverage = new MilkDecorator(new MilkDecorator(caffe));
        drink(beverage);




    }

    static void drink(Beverage beverage){
        System.out.println("Pijem " + beverage.getName()+" i to me košta "+beverage.cost());
    }
}
