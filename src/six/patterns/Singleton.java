package six.patterns;


import java.io.Serializable;

/**
 *CILJ: Osigurati da postoji samo jedna INSTANCA ili OBJEKAT tipa Singleton
 * <p>
 *     IMPLEMENTACIJA:
 *     1. Privatni konstruktor
 *     2. Statička metode
 */
public class Singleton implements Serializable {
    private static Singleton INSTANCE = new Singleton();
    private Singleton(){
        if(INSTANCE != null){
            throw new RuntimeException("Malo morgen ćeš danas kreirati drugi objekat...");
        }
        System.out.println("Poziv konstruktora....");
    }

    public static Singleton getInstance(){

        return INSTANCE;
    }
}
