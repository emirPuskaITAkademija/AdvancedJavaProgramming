package six.patterns;

import two.lambda.model.Gender;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PatternExecutor {
    public static void main(String[] args) throws Exception{
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        //Refleksija
        /*Class singletonClass = Class.forName("six.patterns.Singleton");
        Constructor<Singleton> constructor = singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton elvis2 = constructor.newInstance();*/
        //SERIJALIZACIJE
        FileOutputStream fous = new FileOutputStream("singleton.ser");
        ObjectOutputStream ous = new ObjectOutputStream(fous);
        ous.writeObject(singleton1);
        FileInputStream fis = new FileInputStream("singleton.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Singleton elvis3 =(Singleton) ois.readObject();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton3.hashCode());
       // System.out.println(elvis2.hashCode());
        System.out.println(elvis3.hashCode());

        Gender gender = Gender.FEMALE;
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
    }
}
