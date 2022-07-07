import java.util.*;

public class Showroom {
    public static void main(String[] args) {
        Car alto = new Car(); // revisit
        alto.company = "Maruti"; 
        alto.name = "ALTO";
        alto.speed = 120; //wrong
        alto.seatNumber = 4;
        alto.price = 350000;
        alto.run(123);
        System.out.println(alto.seatNumber);
    }
} 