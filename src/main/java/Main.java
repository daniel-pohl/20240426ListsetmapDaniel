import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Cjkt");
        names.add("David");

        names.remove("Alice");

        names.add(1, "Charlie");

        int size = names.size();

        String firstElement = names.get(0);
        System.out.println("Das ist das firstElement " + firstElement + ".");
        System.out.println("Das ist das firstElement \"" + firstElement + "\".");

        for (String name : names) {
            System.out.println(name);
        }

        //Interface List

        ArrayList<String> names2 = new ArrayList<>(); // not recommended!

        List<Object> items1 = new ArrayList<>(); // best practice to define it like this once!
        List<Object> items2 = new LinkedList<>(); // then we can simply use it like this later!


    }
}
