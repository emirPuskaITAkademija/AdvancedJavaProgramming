package three.generics;

/**
 * Box boxBoris = new Box("Tvoj omiljeni");
 * Box melisaBox = new Box(23);
 * Box elmaBox = new Box(23.5);
 */
public class Box<G>{
    private G field;

    public Box(G field){
        this.field = field;
    }

    public G getField() {
        return field;
    }
}
