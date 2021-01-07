package three.generics;

import two.lambda.model.Person;

import java.util.ArrayList;
import java.util.List;

public class BoxTester {
    public static void main(String[] args) {
        //Boris String
        //1.5
        Box<String> borisovaKutija = new Box<String>("Omiljeni text");
        Box<Integer> melisinaKutija = new Box<>(23);
        Box<Double> elminaKutija = new Box<>(13.5);

        MathBox<Integer> almirovaKutija = new MathBox<>(234);
        MathBox<Double> mujaginaKutija = new MathBox<>(12.4);
        MathBox<Float> adninaKutija = new MathBox<>(12f);

    }

}
