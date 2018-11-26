package decorator;

public class BeeImpl implements Bee {

    protected int attack = 3;
    protected int collection = 3;
    protected int buildTime = 50;
    protected int food = 10;
    protected int rest = 10;
    protected boolean isBusy = false;
    protected boolean isQueen = false;
    protected boolean isDrone = false;
    protected boolean isFoodie = false;
    protected boolean isBuilder = false;
    protected boolean isWarrior = false;


    public BeeImpl() {
        super();
    }
    
    @Override
    public void spawn() {
        System.out.print("Bee created. ");
        attack = 3;
    }

    // @Override
    protected void setCollection(int collection) {
        this.collection = collection;
    }
    
    protected void setQueen() {
        this.isQueen = true;
    }
    
    protected void setDrone() {
        this.isDrone = true;
    }
    
    protected void setWarrior() {
        this.isWarrior = true;
    }
}
