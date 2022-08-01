package instruments;

import enums.InstrumentType;
import enums.SaxVariant;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("Brass", "Gold", 500, 600, InstrumentType.WOODWIND, 20, SaxVariant.LARGE);
    }

    @Test
    public void saxHasSellPrice(){
        assertEquals(600, saxophone.getSellPrice());
    }

    @Test
    public void saxHasVariant(){
        assertEquals(SaxVariant.LARGE, saxophone.getSaxVariant());
    }

    @Test
    public void saxCanBePlayed(){
        assertEquals("Baker Street Soloooo", saxophone.play("Baker Street Soloooo"));
    }
}
