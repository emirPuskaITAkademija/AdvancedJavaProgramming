package three.generics;

public class MathBox<B extends Number> {
    private B broj;

    public MathBox(B broj) {
        this.broj = broj;
    }

    public B getBroj() {
        return broj;
    }
}
