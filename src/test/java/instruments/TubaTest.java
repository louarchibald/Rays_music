package instruments;

import enums.InstrumentType;
import instruments.Tuba;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TubaTest {

    Tuba tuba;

    @Before
    public void before(){
        tuba = new Tuba("Brass", "Silver", 4200, 5000, InstrumentType.BRASS, 6);
    }

    @Test
    public void tubaHasValves(){
        assertEquals(6, tuba.getNoOfValves());
    }

    @Test
    public void tubaCanBePlayed(){
        assertEquals("Bruuuuuuaaaaaaaaargh", tuba.play("Bruuuuuuaaaaaaaaargh"));
    }
}
