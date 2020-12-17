package one.demonstration.user;

import one.demonstration.Reader;
import one.demonstration.ReaderFactory;

public class ReaderTester {
    public static void main(String[] args) {
        Reader reader = ReaderFactory.getReader("DB");
        String readedValue = reader.read();
        System.out.println(readedValue);
    }
}
