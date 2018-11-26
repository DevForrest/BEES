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
        String temp = "";
        System.out.println("here 1");
        for (int i = 0; i < this.beehives.size(); i++) {
            System.out.println("here 2");
            temp += this.beehives.get(i) + " ";
        }
        return temp;
    }

    public void addHive(String newHive) {
        this.beehives.add(newHive);
    }
}
