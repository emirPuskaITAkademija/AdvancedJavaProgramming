package one;

public class Executor {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Adi";
        names[1] = "Boris";
        names[2] = "Elma";
        double number = divideBy(0);//ArithmeticException / by zero
        names[3] = "Almir";//ArrayIndexOutOfBoundsException
        for(int i = 0; i<names.length; i++){
            System.out.println(names[i]);
        }
    }

    static int divideBy(int number){
        int decimalNumber = 23;
        int result = decimalNumber/number;
        return result;
    }
}
