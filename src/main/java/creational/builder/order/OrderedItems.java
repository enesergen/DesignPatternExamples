package creational.builder.order;

import creational.builder.Item.Item;

import java.util.ArrayList;

public class OrderedItems {
    ArrayList<Item>items=new ArrayList<>();

    public void addItems(Item item){
        items.add(item);
    }



}
