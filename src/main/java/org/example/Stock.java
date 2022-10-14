package org.example;

import java.io.Serializable;

public class Stock implements Serializable {

  private String nameOfStock;
  private int numberOfShare;
  private int sharePrice;

  public String getNameOfStock() {
    return nameOfStock;
  }

  public void setNameOfStock(String nameOfStock) {
    this.nameOfStock = nameOfStock;
  }

  public int getNumberOfShare() {
    return numberOfShare;
  }

  public void setNumberOfShare(int numberOfShare) {
    this.numberOfShare = numberOfShare;
  }

  public int getSharePrice() {
    return sharePrice;
  }

  public void setSharePrice(int sharePrice) {
    this.sharePrice = sharePrice;
  }

  @Override
  public String toString() {
    return "Stock{" +
        "nameOfStock='" + nameOfStock + '\'' +
        ", numberOfShare=" + numberOfShare +
        ", sharePrice=" + sharePrice +
        '}';
  }
}
