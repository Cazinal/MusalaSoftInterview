package com.restaurant.items.container;

public class Cup implements Container {
  private static final String PACKAGING_MATERIAL = "Cup";

  @Override
  public String getPackagingMaterial() {
    return PACKAGING_MATERIAL;
  }
}
