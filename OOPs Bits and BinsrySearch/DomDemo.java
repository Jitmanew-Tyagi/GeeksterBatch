import java.util.*;

abstract class Dominoes {
    void recipe() {
        System.out.println("recipe");
    }
    
    abstract void offer();
    abstract void serve();
}


class MyDominoes extends Dominoes {

    void offer() {
       System.out.println("offer given");
    }

    void serve() {
       System.out.println("pizza served");
   }
}


public class DomDemo {
    public static void main(String[] args) {
        MyDominoes store = new MyDominoes();
        store.recipe();
        store.offer();
        store.serve();
    }
}