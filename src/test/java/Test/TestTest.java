package Test;

import static org.junit.Assert.*;

public class TestTest {

    @org.junit.Test
    public void adder() {
        Test test = new Test();
        int expected = 2;
        int actual = test.adder(1,1);
        assertEquals(expected,actual);
    }
}