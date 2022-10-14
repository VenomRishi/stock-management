package org.example;

import java.io.Serializable;
import java.util.List;

public class Stocks implements Serializable {
  private List<Stock> stockList;

  public List<Stock> getStockList() {
    return stockList;
  }

  public void setStockList(List<Stock> stockList) {
    this.stockList = stockList;
  }
}
