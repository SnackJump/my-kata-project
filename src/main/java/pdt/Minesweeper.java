package pdt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.Getter;
import lombok.Value;

/**
 * Title: Minesweeper<br>
 * Description:<br>
 * Company: Tradevan Co.<br>
 * 踩地雷<br>
 * https://hackmd.io/@AmdAc990TDm3EkP4EmImTA/B1dDR_Ald<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/7/1
 */
@Getter
public class Minesweeper {

  int length;
  int width;
  String[][] map;
  List<Doc> docs = new ArrayList<>();

  public Minesweeper(String s) {
    String[] lines = s.split("\r\n");
    String lineFormat = lines[0];
    if (lineFormat.indexOf(" ") < 0) {
      throw new RuntimeException("Map format fail!");
    }
    length = Integer.parseInt(lineFormat.substring(0, lineFormat.indexOf(" ")));
    width = Integer.parseInt(lineFormat.substring(lineFormat.indexOf(" ") + 1));

    if (length <= 0 || width <= 0) {
      throw new RuntimeException("Map format fail!");
    }
    if (lines.length - 1 != length) {
      throw new RuntimeException(
          "Map length size not correct, length is "
              + length
              + ", but input is "
              + (lines.length - 1));
    }

    map = new String[length][width];
    for (int i = 1; i < lines.length; i++) {
      if (width != lines[i].length()) {
        throw new RuntimeException(
            "Map length size not correct, at length "
                + i
                + ", wight is "
                + width
                + ", but input is "
                + lines[i].length());
      }
      int j = 0;
      int index;
      while (j < width) {
        index = lines[i].indexOf("*", j);
//        System.out.println(index);
        if (index < 0) {
          break;
        }
        map[i-1][index] = "*";
        docs.add(new Doc(i-1, index));
        j = index + 1;
      }
    }
//    System.out.println(docs);
  }

  public String scan() {
    docs.forEach(
        doc -> {
          addMap(doc, doc.length + 1, doc.width - 1);
          addMap(doc, doc.length + 1, doc.width);
          addMap(doc, doc.length + 1, doc.width + 1);
          addMap(doc, doc.length, doc.width + 1);
          addMap(doc, doc.length, doc.width - 1);
          addMap(doc, doc.length - 1, doc.width + 1);
          addMap(doc, doc.length - 1, doc.width);
          addMap(doc, doc.length - 1, doc.width - 1);
        });

    StringBuilder result = new StringBuilder();

    Arrays.stream(map)
        .forEach(
            array -> {
              Arrays.stream(array).forEach(
                  s -> {
                    if(s == null){
                      result.append("0");
                    }else{
                      result.append(s);
                    }
                  });
              result.append("\r\n");
            });


    return result.toString();
  }

  private void addMap(Doc doc, int length, int width) {
    try {
      if (map[length][width] == null) {
        map[length][width] = "1";
      } else {
        map[length][width] = String.valueOf(Integer.parseInt(map[length][width]) + 1);
      }
    } catch (ArrayIndexOutOfBoundsException|NumberFormatException e) {
      // ignore
    }
  }

  @Value
  class Doc {
    private final int length;
    private final int width;
  }
}
