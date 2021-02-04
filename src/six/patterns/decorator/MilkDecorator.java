package six.patterns.decorator;

class MilkDecorator extends Beverage {

    private Beverage beverage;

    public MilkDecorator(Beverage beverage) {
        super(beverage.getName()+" s mlijekom");
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.5;
    }
}
