package org.example;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileReader;
import java.io.IOException;

public class StockManagement {
  public static void main(String[] args) throws IOException {
    Stocks stocks = readStockJsonFile();
    calculateStockTotalValue(stocks);
  }

  private static Stocks readStockJsonFile() throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();

    Stocks stocks;
    try {
      stocks = objectMapper.readValue(new FileReader("stock.json"), Stocks.class);
      stocks.getStockList().forEach(System.out::println);
    } catch (JsonMappingException e) {
      throw new RuntimeException(e);
    }
    return stocks;
  }

  private static void calculateStockTotalValue(Stocks stocks) {
    for (int i = 0; i < stocks.getStockList().size(); i++) {
      int totalValueOfStock =
          stocks.getStockList().get(i).getNumberOfShare()
              * stocks.getStockList().get(i).getSharePrice();
      System.out.println("Stock name is: " + stocks.getStockList().get(i).getNameOfStock());
      System.out.println("Stock total value is: " + totalValueOfStock);
    }
  }
}
