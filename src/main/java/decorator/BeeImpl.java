package decorator;

public class BeeImpl implements Bee {
    // REIMPLEMENT ///////////////////////////////////////////////a ////a ...
    protected String description = "bee";
    protected String name = "Bee";
    protected int attack = 3;
    //   protected int collection = 3;
    protected int buildTime = 50;
    protected int food = 10;
    protected int rest = 10;
    protected boolean isBusy = false;
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
        //BeeImpl killed = deadBee.getBee();
        Bee beeVictor;
        String output = this.getName() + " killed " + deadBee.getName() + " and recieved the ";
        //if (deadBee.isFoodie()) {
        //    output += "foodie ";
        //     this.isFoodie = true;
        //     beeVictor = new FoodieDecorator(this);
        //} else if (deadBee.isBuilder()) {
        output += "builder ";
        //this.isBuilder = true;
        beeVictor = new BuilderDecorator(this);
        //} else {
        //    beeVictor = this;
        // }
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
        //BeeImpl killed = deadBee.getBee();
        Bee beeVictor;
        String output = this.getName() + " killed " + deadBee.getName() + " and recieved the ";
        // if (deadBee.isFoodie()) {
        output += "foodie ";
        //this.isFoodie = true;
        beeVictor = new FoodieDecorator(this);
        //} else if (deadBee.isBuilder()) {
        //     output += "builder ";
        //     this.isWarrior = true;
        //     beeVictor = new BuilderDecorator(this);
        // } else {
        //     beeVictor = this;
        // }
        output += "perk!";
        System.out.println(output);
        //return beeVictor;
        return beeVictor.getDescription();
    }

    /**
     * kill(BeeImpl) kills normal bee.
     * @param deadBee killed bee
     * @return new description of winner
     */
    public String kill(BeeImpl deadBee) {
        //BeeImpl killed = deadBee.getBee();
        //Bee beeVictor;
        String output = this.getName() + " killed " + deadBee.getName() + " and recieved no perks";
        //beeVictor = this;
        System.out.println(output);
        //return beeVictor;
        return this.getDescription();
    }


    @Override
    public String getDescription() {
        return this.description;
    }
}
