import java.util.ArrayList;
import java.util.List;

public class Animals extends ZooInterface{

    String animal_group_name = "Mammals";
    int animal_number = 5;
    String group_description = "This is an animal group";
    List<String> animals_group = new ArrayList<String>() {
        /**
        *
        */
        private static final long serialVersionUID = -3008845131051940492L;

        {
        add(animal_group_name);
        add(animal_number);
    }};
    public static void main(String[] args) {
        Enclosure animals = new Enclosure();
        System.out.println(animals.location_code);
    }
}