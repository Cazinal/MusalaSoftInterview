package com.restaurant.items;

public class Tea extends HotDrinks {
  private String name;
  private double cost;
  private int quantity;

  public Tea(String name, double cost) {
    this.name = name;
    this.cost = cost;
  }

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
  public double getCost() {
    return cost;
  }
}
