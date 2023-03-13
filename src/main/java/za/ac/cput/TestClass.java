/**
 * TestClass.java
 * This is the Class used for doing testing on the CLasses Pojo
 * @author Carlo Joseph
 * 12 March 2023
 */
package za.ac.cput;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class TestClass {

    @Test
    public void testClassEquality() {
        Classes c1 = new Classes("English", "Mr. Johnson", "brad");
        Classes c2 = c1;
        assertEquals(c1, c2);
    }
@Test
    public void testClassIdentity() {
        Class c1 = new Class("English", "Mr. Naidoo", "BabaGworl");
        Class c2 = c1;
        assertSame(c1, c2);
    }
    @Test

    public void testClassFailing() {
        Classes c1 = new Classes("Math", "Mr. Johnson", "Jack");
        Classes c2 = new Classes("Math", "Mr. Johnson", "Daniels");
        assertEquals(c1, c2);
    }
    @Test(timeout = 90000000)
    public void testClassTime() {

    }

    @Ignore()
    @Test
    public void disablingTest(){
        fail("ignore doesnt seem to work");
    }

}
