package decorator;

public class BeeImpl implements Bee {

    @Override
    public void spawn() {
        System.out.print("Bee created. ");
    }
}
