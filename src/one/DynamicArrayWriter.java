package one;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrayWriter {
    private ArrayList<Integer> lista = new ArrayList<>();

    public DynamicArrayWriter() {
        for (int i = 0; i <= 10; i++) {
            lista.add(i);
        }
    }

    //try - catch - finally
    public void writeListIntoFile() {
        //FileWriter -> IOException
        PrintWriter out = null;
        try {
            FileWriter fileWriter = new FileWriter("output.txt");// IOException objekat
            //PrintWriter
            out = new PrintWriter(fileWriter);
            for (int i = 0; i < lista.size(); i++) {
                out.println("Value at :" + i + " is : " + lista.get(i));
            }

        } catch (IOException exception) {
            System.err.println("IO se desio: " + exception.getMessage());
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

    //try -catch - finally  -> Java SE 1.7 TRY WITH RESOURCE
    public void readFile() {

        try (FileReader fileReader = new FileReader("output.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader);) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e1) {
            JOptionPane.showMessageDialog(null, "Nisi unio dobro ime fajla");
        } catch (IOException e2) {
            System.err.println(e2.getMessage());
        }
    }

}
