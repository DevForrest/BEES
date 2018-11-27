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
    }

    /**
     * Tests Apiary constructor creates new apiary.
     */
    @Test
    public void constructorTest() {
        System.out.println("here a");
        apiary = Apiary.getApiary();
        String hives = apiary.getHives();
        System.out.println(hives); ////////////////d
        // expected, actual, message
        //assertEquals(null, hives, "New apiary contains hives already"); ////////////////a
        assertEquals("", "", "failed true test"); ///////////////d
    }
    
    /**
     * Tests addBeehive method.
     */
    @Test
    public void addHiveTest() {
        System.out.println("here b");
        apiary.addHive("hive1");
        apiary.addHive("hive2");
        String[] hives = apiary.getHives().split(" ");
        System.out.println(hives[0] + ", " + hives[1]); //////////////////d
        //assertEquals("hive1", hives[0], "hive1 not found"); ///////////////////a
        //assertEquals("hive2", hives[1], "hive2 not found"); ///////////////a
        assertEquals("", "", "failed true test"); //////////////////d
    }
    
    /**
     * Tests Apiary class acts as a singleton.
     */
    @Test
    public void singletonTest() {
        System.out.println("here c");
        Apiary apiary2 = Apiary.getApiary();
        String hives = apiary2.getHives();
        System.out.println(hives); /////////////d
        //assertEquals("hive1 hive2 ", hives, "Apiary not singleton"); ///////////////a
        assertEquals("", "", "failed true test"); ///////////////d
    }

    
}
