package com.restaurant.items.container;

public class Wrapper implements Container {
  private static final String PACKAGING_MATERIAL = "Wrapper";

  @Override
  public String getPackagingMaterial() {
    return PACKAGING_MATERIAL;
  }
}
