package com.restaurant.menu;

import com.restaurant.items.Item;

import java.util.ArrayList;

public class Menu {
  private ArrayList<Item> items;

  public void addItem(Item item) {
    items.add(item);
  }

  public void displayItems() {
    for (Item item : items) {
      System.out.printf("Name: %s, Category: %s, Cost: %d, Quantity: %d\n",
              item.getName(), item.getCategory(), item.getCost(), item.getQuantity());
    }
  }

  public ArrayList<Item> getItems() {
    return items;
  }

  public void removeItem(Item item) {
    items.remove(item);
  }
}
