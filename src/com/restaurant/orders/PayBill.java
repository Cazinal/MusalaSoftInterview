package com.restaurant.orders;

import java.util.List;

public class PayBill {
  public double payableAmount(PlaceOrder order) {
    List<Order> orders = order.getOrders();

    double total = 0;
    for (Order ord : orders) {
      // TODO Total up all orders in the PlaceOrder objects
    }

    return total;
  }
}
