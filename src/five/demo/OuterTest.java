package five.demo;

public class OuterTest {
    public static void main(String[] args) {
        Outer.staticPrint();
        Outer.InnerStatic innerStaticObject = new Outer.InnerStatic();
        Outer outer = new Outer();
        outer.print();
        Outer.Inner innerObject = outer.new Inner();
    }
}
