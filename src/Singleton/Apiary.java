package singleton;

public class Apiary {

    // single accessible instance
    private static Apiary apiaryInstance;

    // private constructor
    private Apiary() {

    }

    /**
     * Gets instance; point of access.
     * @return Apiary instance
     */
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
