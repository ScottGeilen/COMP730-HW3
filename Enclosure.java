package hw3;
import java.util;
import java.util.Random;
public class Enclosure {
    public static void main (String arg[]) {
        List<String> CapitalLC = new ArrayList<Integer>();
        List<Integer> DigitLC = new ArrayList<Integer>();
        CapitalLC.add("A", "B", "C");
        DigitLC.add(1, 2, 3);
        String Description = "Enclosure description";

        // need Zookeeper class
        Zookeeper();
        // need AnimalsGroup class
        AnimalGroup();
    }
}