package one.demonstration;

/**
 * Apstrakcija:
 * <li>1. apstraktna klasa</li>
 * <li>1.1 polja -> instanca i statička</li>
 * <li>1.2 konstruktor </li>
 * <li>1.3 metode -> instanca i static</li>
 * <li>1.4 abstraktnu metodu -> instancna</li>
 *
 * <p></p>
 * <li>2. interfejsi</li>
 * <li>2.1 polja ali samo public static final</li>
 * <li>2.2 ne može imati konstruktor</li>
 * <li>2.3 metode nisu mogle biti instance a mogle su biti static</li>
 */
public interface Reader {
   public String read();
}
