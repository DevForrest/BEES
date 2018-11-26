package test;

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
     * Tests Apiary constructor & class acts as a singleton.
     */
    @Test
    public void constructorTest() {
        apiary = Apiary.getApiary();
    }

    /**
     * Tests addBeehive method.
     */
    @Test
    public void addBeehiveTest() {

    }
}
