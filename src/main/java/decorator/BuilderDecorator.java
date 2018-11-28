package decorator;

public class BuilderDecorator extends BeeDecorator {

    BeeImpl bee;

    public BuilderDecorator(BeeImpl b) {
        this.bee = b;
        this.bee.isBuilder = true;
    }

    //    @Override
    //    public void spawn() {
    //        super.spawn();
    //        System.out.println("Building stats of a builder.");
    //    }

    public String getDescription() {
        return bee.getDescription() + ", builder";
    }

    @Override
    public boolean isFoodie() {
        return this.bee.isFoodie();
    }

    @Override
    public boolean isBuilder() {
        return this.bee.isBuilder();
    }

    @Override
    public String getName() {
        return this.bee.getName();
    }

    public BeeImpl getBee() {
        return this.bee;
    }


}
