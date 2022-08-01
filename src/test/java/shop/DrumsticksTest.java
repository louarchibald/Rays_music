package shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {

    Drumsticks drumsticks;

    @Before
    public void before(){
        drumsticks = new Drumsticks(35, 50, "Aluminium", "Silver");
    }

    @Test
    public void drumsticksHaveSellPrice(){
        assertEquals(50, drumsticks.getSellPrice());
    }
}
