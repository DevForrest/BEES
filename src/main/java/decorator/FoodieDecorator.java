package decorator;

/**
 * Foodie bees gather food more quickly.
 * @author Devin Forrester
 *
 */

public class FoodieDecorator extends BeeDecorator {

    //protected Bee bee;

    public FoodieDecorator(Bee b) {
        super(b);
    }

    @Override
    public void spawn() {
        super.spawn();
        System.out.println("Food gathering stats of a foodie.");
    }

}
