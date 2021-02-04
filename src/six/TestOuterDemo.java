package six;

public class TestOuterDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.InnerClass innerObject = outer.new InnerClass();
        Outer.StaticInnerClass staticInnerObject = new Outer.StaticInnerClass();
    }
}
