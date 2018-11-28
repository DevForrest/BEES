package decorator;

/**
 * Bee implementation class.
 * @author Devin
 *
 */
public class BeeImpl implements Bee {

    // originally had much more functionality planned for the extra credit
    protected String description = "bee";
    protected String name = "Bee";
    //    protected int attack = 3;
    //    protected int collection = 3;
    //    protected int buildTime = 50;
    //    protected int food = 10;
    //    protected int rest = 10;
    //    protected boolean isBusy = false;
    //    protected boolean isQueen = false;
    //    protected boolean isDrone = false;
    protected boolean isFoodie = false;
    protected boolean isBuilder = false;
    //    protected boolean isWarrior = false;


    public BeeImpl() {
        super();
    }

    //    @Override
    //    public void spawn() {
    //        System.out.print("Bee created. ");
    //        attack = 3;
    //    }
    //
    //    // @Override
    //    protected void setCollection(int collection) {
    //        this.collection = collection;
    //    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    //    protected void setQueen() {
    //        this.isQueen = true;
    //    }
    //
    //    private void setDrone() {
    //        this.isDrone = true;
    //    }
    //
    //    public void setWarrior() {
    //        this.isWarrior = true;
    //    }

    public boolean isBuilder() {
        return this.isBuilder;
    }

    public boolean isFoodie() {
        return this.isFoodie;
    }

    public void setBuilder() {
        this.isBuilder = true;
    }

    public void setFoodie() {
        this.isFoodie = true;
    }

    //    public boolean isWarrior() {
    //        return this.isWarrior();
    //    }

    /**
     * kill(BuilderDecorator) kills builder bee.
     * @param deadBee killed bee
     * @return new description of winner
     */
    public String kill(BuilderDecorator deadBee) {
        Bee beeVictor;
        String output = this.getName() + " killed " + deadBee.getName() + " and recieved the ";
        output += "builder ";
        beeVictor = new BuilderDecorator(this);
        output += "perk!";
        System.out.println(output);
        return beeVictor.getDescription();
    }

    /**
     * kill(FoodieDecorator) kills foodie bee.
     * @param deadBee killed bee
     * @return new description of winner
     */
    public String kill(FoodieDecorator deadBee) {
        Bee beeVictor;
        String output = this.getName() + " killed " + deadBee.getName() + " and recieved the ";
        output += "foodie ";
        beeVictor = new FoodieDecorator(this);
        output += "perk!";
        System.out.println(output);
        return beeVictor.getDescription();
    }

    /**
     * kill(BeeImpl) kills normal bee.
     * @param deadBee killed bee
     * @return new description of winner
     */
    public String kill(BeeImpl deadBee) {
        String output = this.getName() + " killed " + deadBee.getName() + " and recieved no perks";
        System.out.println(output);
        return this.getDescription();
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
