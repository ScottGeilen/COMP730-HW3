import java.util;
public class Enclosure extends ZooInterface {
    String location = "A3";
    String employee = "Johnny";
    String enclosure_description = "This is an enclosure";
    List<String> location_code = new ArrayList<String>() {{
        add(location);
        add(employee);
        add(enclosure_description);
    }};
        public static void main(String[] args) {
            Enclosure animals = new Enclosure();
            System.out.println(animals.location_code);
    }
}