package ua.lviv.ki.writer;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ua.lviv.ki.manager.BaseDishesManagerTest;
import ua.lviv.ki.model.AbstractRestaurant;

public class DishWriterTest extends BaseDishesManagerTest {

  @Test
  public void testFile() throws IOException {
    try (Writer fileWriter = new FileWriter("Dishes.csv")) {
      DishWriter writer = new DishWriter();
      writer.setCsvWriter(fileWriter);
      writer.writeToFile(dishes);
    }
  }

  @Test
  public void testProperTextFormatting() throws IOException {
    try (Writer csvWriter = new StringWriter()) {
      DishWriter writer = new DishWriter();
      writer.setCsvWriter(csvWriter);

      List<AbstractRestaurant> dishes = new LinkedList<AbstractRestaurant>();

      writer.writeToFile(dishes);

      String expectedText = "";
      for (AbstractRestaurant dish : dishes) {
        expectedText += dish.getHeaders() + "," + dish.toCSV() + "\r\n";
      }

      assertEquals(expectedText, csvWriter.toString());
      DishWriter.readFromFile("Dishes.csv");
    }
  }

}
