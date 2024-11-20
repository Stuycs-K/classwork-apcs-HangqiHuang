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
  public static void bathroomCodeA(String filename){
    Scanner input = parseFile(filename);
    int current = 5, direction = 0, index = 4;
    int[] keypad = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] offset = {-3, -1, 3, 1};
    while(input.hasNextLine()){
      String line= input.nextLine();
      for(int i = 0; i < line.length(); i++){
        String instruction = line.substring(i, i + 1);
        if(instruction.equals("U")){
          direction = 0;
        }
        else if(instruction.equals("L")){
          direction = 1;
        }
        else if(instruction.equals("D")){
          direction = 2;
        }
        else{
          direction = 3;
        }
        if(index + offset[direction] >= 0 && index + offset[direction] < 9){
          index += offset[direction];
          current = keypad[index];
        }
      }
      System.out.println(current);
    }
  }
  public static void main(String[] args){
    bathroomCodeA("FileDay2.txt");
  }
}
