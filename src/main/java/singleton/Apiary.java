package singleton;

import java.util.LinkedList;

public class Apiary {

    // single accessible instance
    private static Apiary apiaryInstance;
    LinkedList<String> beehives;

    // private constructor
    private Apiary() {
        beehives = new LinkedList<String>();
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
        System.out.println("Printing apiary singleton values (hives):");
        System.out.println(this.getHives());
    }

    /**
     * getHives returns all hive variables as a single string.
     * @return all hives as string
     */
    public String getHives() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < beehives.size(); ++i) {
            buf.append(this.beehives.get(i) + " ");
        }
        String s = buf.toString();
        return s;
    }

    public void addHive(String newHive) {
        this.beehives.add(newHive);
    }
}
