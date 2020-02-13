package hw3;
import java.util;
public class Veterinarian extends Zookeeper implements HW3Interface { 
    String id;   
    int money;
    private int HourlyRate(int Wage) {
        money = Wage;
        return Wage;
    }
}