package com.restaurant.items;

import com.restaurant.items.container.Container;

public class ColdDrinks implements Item {
  private int quantity;
  private String name;
  private Category category;
  private double cost;
  private Container container;

  @Override
  public int getQuantity() {
    return quantity;
  }

  @Override
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Category getCategory() {
    return category;
  }

  @Override
  public double getCost() {
    return cost;
  }

  @Override
  public Container getContainer() {
    return container;
  }
}
