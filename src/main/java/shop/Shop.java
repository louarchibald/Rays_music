package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop implements ISell {

    Item item;
    private ArrayList<ISell> stock;

    public Shop(ArrayList<ISell> stock, Item item){
        this.stock = new ArrayList<ISell>();
        this.item = item;

    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

//    public ArrayList<ISell> getStock() {
//        return stock;
//    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public int calculateMarkup(){
        return 0;
    }

    public int getStock(){
        stock.add(item);
        return stock.size();
    }

}
