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
    int[][] keypad = {
      {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
    };
    int current = 5, row = 1, column = 1, direction = 0;
    int[][] offset = {
      {-1, 0}, {0, -1}, {1, 0}, {0, 1}
    };
    while(input.hasNextLine()){
      String line = input.nextLine();
      // System.out.println(line);
      for(int i = 0; i < line.length(); i++){
        String instruction = line.substring(i, i + 1);
        // System.out.println(instruction);
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
        if(row + offset[direction][0] >= 0 && row + offset[direction][0] < 3){
          if(column + offset[direction][1] >= 0 && column + + offset[direction][1] < 3){
            row += offset[direction][0];
            column += offset[direction][1];
            current = keypad[row][column];
            // System.out.println(current);
          }
        }
      }
      System.out.println(current);
    }
  }
  public static void main(String[] args){
    bathroomCodeA("FileDay2.txt");
  }
}
