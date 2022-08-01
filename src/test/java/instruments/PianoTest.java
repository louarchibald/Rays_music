package instruments;

import enums.InstrumentType;
import enums.PianoVariant;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Mahogany", "Black", 2000, 2500, InstrumentType.STRING, 88, PianoVariant.GRAND);
    }

    @Test
    public void pianoHasSellPrice(){
        assertEquals(2500, piano.getSellPrice());
    }

    @Test
    public void pianoHasVariant(){
        assertEquals(PianoVariant.GRAND, piano.getVariant());
    }

    @Test
    public void pianoCanBePlayed(){
        assertEquals("Plink plonk plinkety plonk", piano.play("Plink plonk plinkety plonk"));
    }
}
