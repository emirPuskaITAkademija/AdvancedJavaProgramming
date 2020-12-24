package two.scanner;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class FileReaderDemo {
    public static void main(String[] args) {
        //Java klasa
        try(FileReader fileReader = new FileReader("output.txt");
            BufferedReader br = new BufferedReader(fileReader);
            Scanner scanner = new Scanner(br)){
            scanner.useLocale(Locale.CANADA_FRENCH);
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        }catch (FileNotFoundException e){
            System.err.println(e.getMessage());
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
