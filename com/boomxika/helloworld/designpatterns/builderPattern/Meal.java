package com.boomxika.helloworld.designpatterns.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> lstItem = new ArrayList<>();

    public void addItem(Item item) {
        this.lstItem.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : lstItem) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : lstItem) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().packing());
            System.out.println(", Price : " + item.price());
        }
    }
}
