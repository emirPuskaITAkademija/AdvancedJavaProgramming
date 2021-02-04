package six.patterns.decorator;

class Tea extends Beverage {


    public Tea() {
        super("Čaj");
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
