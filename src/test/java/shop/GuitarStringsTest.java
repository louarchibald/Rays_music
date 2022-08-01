package shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings(10, 14, "Extra-light", "Steel");
    }

    @Test
    public void stringsHaveSellPrice(){
        assertEquals(14, guitarStrings.getSellPrice());
    }
}
