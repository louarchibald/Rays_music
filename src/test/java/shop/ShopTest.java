package shop;

import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Item item;
    GuitarStrings guitarStrings;
    SheetMusic sheetMusic;
    Drumsticks drumsticks;

    ArrayList<ISell> stock;



    @Before
    public void before(){
        guitarStrings = new GuitarStrings(14, 20, "Medium", "Steel");
        sheetMusic = new SheetMusic(35, 45, "The Who", "Best of The Who");
        drumsticks = new Drumsticks(40, 65, "Wood", "Blue");
    }

//    @Test
//    public void shopCanAddItemToStock(){
//        ArrayList<ISell>stock = new ArrayList<>();
//        stock.add(guitarStrings);
//        assertEquals(guitarStrings, shop.getStock());
//
//    }
}
