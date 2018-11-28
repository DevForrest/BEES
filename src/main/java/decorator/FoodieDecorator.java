package decorator;

/**
 * Foodie bees gather food more quickly.
 * @author Devin Forrester
 *
 */

public class FoodieDecorator extends BeeDecorator {

    protected BeeImpl bee;

    public FoodieDecorator(BeeImpl b) {
        this.bee = b;
        this.bee.isFoodie = true;
    }

    @Override
    public String getDescription() {
        return bee.getDescription() + ", foodie";
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

    //    @Override
    //    public void spawn() {
    //        super.spawn();
    //        System.out.println("Food gathering stats of a foodie.");
    //    }

}
