import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Grid{
  public static int shortestPathA(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String stringInput = input.nextLine();
      System.out.println(input);
    }catch(FileNotFoundException e){
      System.out.println("File not found");
    }
    return 0;
  }
  public static void main(String[] args){
    shortestPathA("file.txt");
  }
}
