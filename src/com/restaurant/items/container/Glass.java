package com.restaurant.items.container;

public class Glass implements Container {
  private static final String PACKAGING_MATERIAL = "Glass";

  @Override
  public String getPackagingMaterial() {
    return PACKAGING_MATERIAL;
  }
}
