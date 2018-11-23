package Singleton;

public class Apiary {
    
    // single accessible instance
    private static Apiary apiaryInstance;
    
    // private constructor
    private Apiary() {
        
    }
    
    // point of access
    public static Apiary getApiary() {
        if (apiaryInstance == null) {
            apiaryInstance = new Apiary();
        }
        return apiaryInstance;
    }
    
    // display method
    public void displayApiary() {
        System.out.println("Print apiary singleton values");
    }
}
