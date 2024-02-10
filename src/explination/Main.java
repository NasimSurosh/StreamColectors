package explination;

import java.util.List;
import java.util.stream.Collectors;

class Color {
  private String color;

  public Color(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Color=" + color;
  }

}

public class Main {

  public static void main(String[] args) {
    
    var colors = List.of("white","blue","red","purple","pink");
    
    
    var list = colors
                     .stream()
                     .map(Color:: new)       //    or map(c-> new Color(c))
                     .collect(Collectors.toList());   // terminal operation
                     
    for(var color : list) {
      System.out.println(color.getClass());
      System.out.println(color);
      
      System.out.println(list);
    }

  }

}