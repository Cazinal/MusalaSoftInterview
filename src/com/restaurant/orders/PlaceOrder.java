package com.restaurant.orders;

import com.restaurant.items.Item;
import com.restaurant.menu.Menu;

import java.util.ArrayList;

public class PlaceOrder {
  private ArrayList<Order> orders;
  private ArrayList<Item> availableItems;

  public PlaceOrder(Menu menu) {
    orders = new ArrayList<>();
    availableItems = menu.getItems();
  }

  public void orderItem(String item, int quantity) {
    for (Item availableItem : availableItems) {
      if (item.equals(availableItem.getName()) && availableItem.getQuantity() >= quantity) {
        orders.add(new Order(availableItem, quantity));
        break;
      }
    }
  }

  public ArrayList<Order> getOrders() {
    return orders;
  }

  /**
   * Not in class diagram, needed for {@link PayBill#payableAmount(PlaceOrder)}
   *
   * @return The list of items available according to the menu.
   */
  public ArrayList<Item> getAvailableItems() {
    return availableItems;
  }
}
