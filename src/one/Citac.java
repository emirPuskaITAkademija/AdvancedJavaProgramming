package one;

import java.io.Closeable;
import java.io.IOException;

public class Citac  implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Zatvaram nešto...");
    }

    public static void main(String[] args) throws IOException{

        try(Citac citac = new Citac()){
            //
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
