package shop;

import org.junit.Before;
import org.junit.Test;
import shop.SheetMusic;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(30, 40, "Smashing Pumpkins", "Mellon Collie and the Infinite Sadness");
    }

    @Test
    public void sheetMusicHasSellPrice(){
        assertEquals(40, sheetMusic.getSellPrice());
    }
}
