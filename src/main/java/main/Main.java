package main;

import static org.junit.Assert.assertEquals;

import decorator.BeeImpl;
import decorator.BuilderDecorator;
import decorator.FoodieDecorator;
import singleton.Apiary;

public class Main {

    /**
     * main runs program.
     * @param args arguments
     */
    public static void main(String[] args) {

        // create apiary and add two hives
        System.out.println("Creating new apiary");
        Apiary apiary = Apiary.getApiary();
        apiary.addHive("hive1");
        apiary.addHive("hive2");
        System.out.println("Current hives: " + apiary.getHives());

        // add new hive to new apiary object
        System.out.println("New apiary reference created.");
        Apiary newApiary = Apiary.getApiary();
        System.out.println("Adding new hive to reference apiary 2.");
        newApiary.addHive("newHive");
        // old apiary now displays newly added hive
        System.out.println("First apiary's hives are now: " + apiary.getHives() + "\n");

        // create new plain bees
        BeeImpl bee1 = new BeeImpl();
        BeeImpl bee2 = new BeeImpl();
        System.out.println("bee1 description: " + bee1.getDescription());
        System.out.println("bee2 description: " + bee2.getDescription());

        // create new bees with attributes
        FoodieDecorator beeF = new FoodieDecorator(new BeeImpl());
        BuilderDecorator beeB = new BuilderDecorator(new BeeImpl());

        // bee1 kills "foodie" bee and gains their traits
        System.out.println("bee1 is attacking foodie bee");
        System.out.println("bee1's new description: " + bee1.kill(beeF));

        // bee2 kills "builder" bee and gains their traits
        System.out.println("bee2 is attacking builder bee");
        System.out.println("bee2's new description: " + bee2.kill(beeB));

    }

}
