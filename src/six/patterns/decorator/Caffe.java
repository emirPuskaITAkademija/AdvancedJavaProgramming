package six.patterns.decorator;

 class Caffe extends Beverage {
    public Caffe() {
        super("Kafa");
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
