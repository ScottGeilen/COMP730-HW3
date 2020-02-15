import java.until.ArrayList;
public class AnimalGroup {
    /* 
        Composed of zero or more animals
    */
    private List<Animal> animal;
    private String GroupName = new String();
    int NumberOfAnimals;
    private String Description = new String();
    
    public static void main(String[] args) {
        Veterinarian();
    }
}
public class Animal {
    /*
        One animal
    */
    private String IndividualName = new String();
    private String Species = new String();
    private String Description = new String();
    private String BirthDate = new String();
    private String VaccinationDate = new String();
    private String HealthStatus = new String();

}
public class Enclosure {
    /*
        Composed of zero or more animal groups
    */
    private String Description = new String();
    public static void main(String[] args) {
        AnimalGroup();
        LocationCode();
    }
}
public class LocationCode {
    /* COMPOSITION
        LocationCode HAS-A CapitalLetter,
                           Digit,
                           Zookeeper
    */
    public static void main(String[] arg) {
        ArrayList<String> CapitalLetter = new ArrayList<String>();
        CapitalLetter.add("A", "B", "C");
        List<Integer> Digit = new ArrayList<Integer>();
        Digit.add(1, 2, 3);
        Zookeeper();
    }
}
public class Zoo {
    /*
        Stores IndividualName and Address
    */
    private String IndividualName = new String();
    private String Address = new String(); 
}
public class Zookeeper extends Zoo{
    /*
        Zookeeper inherits Zoo, has specialty
    */
    private String Specialty = new String();   
}
public class Veterinarian extends Zoo {
    /*
        Veterinarian inherits Zoo, has specialty and hourly rate
    */
    private String Specialty = new String(); 
    private int HourlyRate;
}