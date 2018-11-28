package decorator;

public class BuilderDecorator extends BeeDecorator {

    //protected Bee bee;

    public BuilderDecorator(Bee b) {
        super(b);
    }

    @Override
    public void spawn() {
        super.spawn();
        System.out.println("Building stats of a builder.");
    }
}
