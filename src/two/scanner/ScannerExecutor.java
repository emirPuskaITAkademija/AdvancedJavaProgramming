package two.scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class ScannerExecutor {
    public static void main(String[] args) {
        //1.5
        Scanner scanner = null;
        try{
            File file = new File("output.txt");
            scanner = new Scanner(file);
            scanner.useLocale(Locale.CANADA);
            while(scanner.hasNextDouble()){
                System.out.println(scanner.nextLine());
            }
        }catch (Exception exception){
            System.err.println(exception.getMessage());
        }finally {
            if(scanner!=null){
                scanner.close();
            }
        }
    }
}
