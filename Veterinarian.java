package hw3;
import java.util;
public class Veterinarian implements HW3Interface { 
    String id;   
    int money;
    public void Individual(String newName) {
        id = newName;
    }
    public void Address(String newName) {
        id = newName;
    }
    public void Specialty(String newName) {
        id = newName;
    }
    public void HourlyRate(int Wage) {
        money = Wage;
    }
}