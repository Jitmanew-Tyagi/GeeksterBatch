import java.util.*;

interface ICamera {
    void capture();
    void record();
}

interface IBrowser {
    void loadWebsite();
    void downloadFiles();
}

class Phone implements ICamera, IBrowser{
    public void capture() {
        System.out.println("Capturing");
    }
    public void record() {
        System.out.println("recording");
    }
    public void FM () {
        System.out.println("playing"); 
    }
    public void loadWebsite() {
        System.out.println("website loaded");   
    }
    public void downloadFiles() {
        System.out.println("files downloaded");   
    }
}


public class InterfaceDemo {
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.loadWebsite();
    }
}