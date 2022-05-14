package com.google.zxing.datamatrix.encoder;


import com.google.zxing.Dimension;

public class EncoderContextProduct {
  private Dimension minSize;
  private Dimension maxSize;

  public Dimension getMinSize() {
    return minSize;
  }

  public Dimension getMaxSize() {
    return maxSize;
  }

  public void setSizeConstraints(Dimension minSize, Dimension maxSize) {
    this.minSize = minSize;
    this.maxSize = maxSize;
  }
}