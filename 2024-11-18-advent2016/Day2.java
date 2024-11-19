import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day2{
  public static Scanner parseFile(String filename){
    Scanner input = new Scanner("");
    try{
      File file = new File(filename);
      input = new Scanner(file);
    }catch(FileNotFoundException e){
      System.out.println("File not found");
    }
    return input;
  }
  public static void bathRoomCodeA(String filename){
    Scanner input = parseFile(filename);
  }
  public static void main(String[] args){
    bathroomCodeA("FileDay2.txt");
  }
}
