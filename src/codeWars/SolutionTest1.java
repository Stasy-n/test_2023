package codeWars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest1 {
    @Test
    public void testSomething() {
        assertEquals("", Kata1.countingSheep(0));
        assertEquals("1 sheep...", Kata1.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", Kata1.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", Kata1.countingSheep(3));
    }
}