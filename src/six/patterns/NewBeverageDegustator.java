package six.patterns;


import six.patterns.decorator.Beverage;
import six.patterns.decorator.BeverageFactory;

//Factory
//Princip: Razdvoji kreiranje objekata od njihovog korištenja
public class NewBeverageDegustator {
    public static void main(String[] args) {
        Beverage beverage = BeverageFactory.TEA.getBeverage();
        drink(beverage);
        Beverage kafu = BeverageFactory.CAFFE.getBeverage();
        drink(kafu);
        Beverage kafaSMlijekom = BeverageFactory.CAFFE_WITH_MILK.getBeverage();
        drink(kafaSMlijekom);
    }

    static void drink(Beverage beverage){
        System.out.println("Pijem " + beverage.getName()+" i to me košta "+beverage.cost());
    }
}
