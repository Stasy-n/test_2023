package codeWars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class CounterTest {
    Boolean[] array1 = null;

    @Test
    public void test() {
        assertEquals("There are 17 sheeps in total", 1, new Counter().countSheeps(array1));
    }
}