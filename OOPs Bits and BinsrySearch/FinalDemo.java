import java.util.*;

abstract class Dominoes {
    public final void recipe() {
        System.out.println("Recipe");
    }
}

class MyDominoes {
    
}

public class FinalDemo {
    public static void main(String[] args) {
        MyDominoes store = new MyDominoes();
        store.recipe();
    }
}