import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import singleton.Apiary;

public class SingletonTest {

    Apiary apiary;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        apiary = null;
    }

    /**
     * Tests Apiary constructor creates new apiary.
     */
    @Test
    public void constructorTest() {
        apiary = Apiary.getApiary();
        String hives = apiary.getHives();
        // System.out.println(hives);
        // message, expected, actual
        assertEquals("New apiary contains hives already", "", hives);
    }

    /**
     * Tests addBeehive method.
     */
    @Test
    public void addHiveTest() {
        apiary = Apiary.getApiary();
        apiary.addHive("hive1");
        apiary.addHive("hive2");
        String[] hives = apiary.getHives().split(" ");
        // System.out.println(hives[0] + ", " + hives[1]);
        assertEquals("hive1 not found", "hive1", hives[0]);
        assertEquals("hive2 not found", "hive2", hives[1]);
    }

    /**
     * Tests Apiary class acts as a singleton.
     */
    @Test
    public void singletonTest() {
        apiary = null;
        apiary = Apiary.getApiary();
        Apiary apiary2 = Apiary.getApiary();
        String hives = apiary2.getHives();
        apiary.addHive("hive1");
        apiary.addHive("hive2");
        hives = apiary.getHives();
        assertEquals("Apiary not singleton", "hive1 hive2 ", hives);
    }


}
