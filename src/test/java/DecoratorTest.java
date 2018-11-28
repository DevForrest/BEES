import static org.junit.Assert.assertEquals;

import decorator.BeeImpl;
import decorator.BuilderDecorator;
import decorator.FoodieDecorator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;




public class DecoratorTest {
    //BeeImpl bee;
    //BuilderDecorator builderBee;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * testBuilderKill tests that builder decorators are passed to the next bee.
     */
    @Test
    public void testBuilderKill() {
        BeeImpl bee = new BeeImpl();
        BuilderDecorator builderBee = new BuilderDecorator(new BeeImpl());
        String desc = bee.kill(builderBee);
        //String desc = victor.getDescription();
        assertEquals("Bee did not gain Builder traits.", "bee, builder", desc);
    }

    /**
     * testFoodieKill tests that foodie decorators are passed to the next bee.
     */
    @Test
    public void testFoodieKill() {
        BeeImpl bee = new BeeImpl();
        FoodieDecorator foodieBee = new FoodieDecorator(new BeeImpl());
        String desc = bee.kill(foodieBee);
        //String desc = victor.getDescription();
        assertEquals("Bee did not gain Foodie traits.", "bee, foodie", desc);
    }

    /**
     * testNormalKill tests that no decorators are passed to the next bee.
     */
    @Test
    public void testNormalKill() {
        BeeImpl bee = new BeeImpl();
        BeeImpl bee2 = new BeeImpl();
        String desc = bee.kill(bee2);
        //String desc = victor.getDescription();
        assertEquals("Bee gained additional traits.", "bee", desc);
    }

}
