package four;

import three.db.Person;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        String[] arrayOfNames = new String[5];
        arrayOfNames[0] = "Adi";
        /*for(int i = 0; i<arrayOfNames.length; i++){
            String name = arrayOfNames[i];
            System.out.println(name);
        }
        for(String name : arrayOfNames){
            System.out.println(name);
        }*/

        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Nevena");
        listOfNames.add("Melisa");
        listOfNames.add("Adna");
        listOfNames.add("Vejsile");
        listOfNames.add("Adi");
        listOfNames.add("Adi");
        listOfNames.add("Mujaga");
        listOfNames.add("Mujaga");
        listOfNames.add("Mujaga");
        listOfNames.add("Mujaga");
        listOfNames.add("Mujaga");
        /*for(int i = 0; i<collectionOfNames.size(); i++){
            String name = collectionOfNames.get(i);
            System.out.println(name);
        }*/
        //listOfNames -> mijenjati strukturu te liste ne možemo
        Iterator<String> listIterator = listOfNames.iterator();
        while(listIterator.hasNext()){
            String name = listIterator.next();
            if(name.equals("Mujaga")){
                listIterator.remove();
            }
        }
        System.out.println("OBRAĐUJEMO SET");
        System.out.println();
        //equals & hashCode
        //compareTo
        Set<String> setOfNames = new TreeSet<>();
        setOfNames.add("Nevena");
        setOfNames.add("Melisa");
        setOfNames.add("Adna");
        setOfNames.add("Vejsile");
        setOfNames.add("Adi");
        setOfNames.add("Adi");
        setOfNames.add("Mujaga");
        setOfNames.add("Mujaga");
        setOfNames.add("Mujaga");
        setOfNames.add("Mujaga");
        setOfNames.add("Mujaga");
        for(String name: setOfNames){
            System.out.println(name);
        }

    }
}
