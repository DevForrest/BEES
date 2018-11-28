import decorator.BeeImpl;

public class Main {
    
    /**
     * main runs program.
     * @param args arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello");
        BeeImpl bee1 = new BeeImpl();
        System.out.println(bee1.getDescription());

    }

}
