import java.util.*;

public class Car {

    //properties
    String company, model, name;
    int speed, seatNumber;
    float price; 

    //behaviours
    public void run(int speed) {
        System.out.println("running at speed " + speed);
    }
}