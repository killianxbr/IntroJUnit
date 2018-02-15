import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Killian on 2/14/2018.
 */
public class MyClassTest {
    @Test
    public void whateverAEqualY() throws Exception {
        MyClass tester = new MyClass();
        assertEquals(94, tester.whatever(40, 14));
    }

    @Test
    public void whateverAEqualX() throws Exception {
        MyClass tester = new MyClass();
        assertEquals(18, tester.whatever(9, 3));
    }

    @Test
    public void multiply() throws Exception {
        MyClass tester = new MyClass();
        assertEquals(5, tester.multiply(1, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void multiplyGreaterThan999WithMaxInt() {
        MyClass tester = new MyClass();
        tester.multiply(Integer.MAX_VALUE, 0);
    }

}