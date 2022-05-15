package com.google.zxing.datamatrix.encoder;


public class SymbolInfoProduct {
  private final int dataRegions;

  public SymbolInfoProduct(int dataRegions) {
    this.dataRegions = dataRegions;
  }

  public int getHorizontalDataRegions() {
    switch (dataRegions) {
      case 1:
        return 1;
      case 2:
      case 4:
        return 2;
      case 16:
        return 4;
      case 36:
        return 6;
      default:
        throw new IllegalStateException("Cannot handle this number of data regions");
    }
  }

  public int getVerticalDataRegions() {
    switch (dataRegions) {
      case 1:
      case 2:
        return 1;
      case 4:
        return 2;
      case 16:
        return 4;
      case 36:
        return 6;
      default:
        throw new IllegalStateException("Cannot handle this number of data regions");
    }
  }
}