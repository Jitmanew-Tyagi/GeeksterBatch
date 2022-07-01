import java.util.*;

class TV {
    void changeChannel(){
        System.out.println("Channel changed");
    }
    void On(){
        System.out.println("Switched ON : 20sec");
    }
    void Off(){
        System.out.println("Switched Off");
    }
}

class SmartTV extends TV {
    
    @Override
    void On(){
        System.out.println("Switched ON : 2sec");
    }
    


    void netflix() {
        System.out.println("Netflix started");
    }
    void amazon() {
        System.out.println("amazon started");
    }
}


public class TVDemo {
    public static void main(String[] args) {
       TV tv = new SmartTV();
       tv.On(); 
    }
}