package decorator;

public abstract class BeeDecorator implements Bee {

    protected Bee bee;
    
    public BeeDecorator(Bee b) {
        this.bee = b;
    }
    
    @Override
    public void spawn() {
        this.bee.spawn();
    }
}