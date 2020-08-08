package ua.lviv.ki.writer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import ua.lviv.ki.model.AbstractRestaurant;

public class DishWriter {

  private Writer csvWriter;

  public void setCsvWriter(Writer csvWriter) {
    this.csvWriter = csvWriter;
  }

  public void writeToFile(List<AbstractRestaurant> dishes) throws IOException {

    for (AbstractRestaurant dish : dishes) {
      csvWriter.write(dish.getHeaders());
      csvWriter.write(dish.toCSV());
      csvWriter.write("\r\n");
    }
    csvWriter.flush();
  }

  public static void readFromFile(String file) throws IOException {
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      String readText = "";
      while ((readText = reader.readLine()) != null) {
        System.out.println(readText);
      }

    }
  }

}
