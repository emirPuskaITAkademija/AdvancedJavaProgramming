package six.patterns.decorator;

public enum BeverageFactory {

    TEA(new Tea()),
    CAFFE(new Caffe()),
    CAFFE_WITH_MILK(new MilkDecorator(new Caffe()));

    private Beverage beverage;

    private BeverageFactory(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }
}
