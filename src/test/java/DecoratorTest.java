import decorator.Bee;
import decorator.BeeImpl;
import decorator.BuilderDecorator;
import decorator.FoodieDecorator;
import decorator.Warrior;

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
        BeeImpl bee = new BeeImpl();
        BuilderDecorator builderBee = new BuilderDecorator(new BeeImpl());
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
     * testDecoration tests that decorators are passed to the next bee.
     */
    @Test
    public void testDecoration() {
        BeeImpl bee = new BeeImpl();
        BuilderDecorator builderBee = new BuilderDecorator(new Bee());
        Bee victor = bee.kill(builderBee);
        assertEquals("Bee did not gain Builder traits.", "", "");
        
        fail("Not yet implemented");
    }

}
