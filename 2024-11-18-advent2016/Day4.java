import java.util.Scanner;
import java.util.ArrayList;

public class Day4{
  public static int removeDecoy(String filename){
    Scanner input = Day2.parseFile(filename);
    while(input.hasNextLine()){
      String line = input.nextLine();
      String encryptedName = line.substring(0, line.lastIndexOf("-"));
      String strand = "";
      for()
      // ArrayList<String>
    }
    return 0;
  }
  public static void main(String[] args){
    removeDecoy("FileDay4.txt");
  }
}
