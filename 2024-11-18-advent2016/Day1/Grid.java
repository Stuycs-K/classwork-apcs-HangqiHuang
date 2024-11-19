import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Grid{
  public static int shortestPathA(String filename){
    Point mainCharacter = new Point();
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String stringInput = "";
      while (input.hasNextLine()){
        stringInput += input.nextLine();
      }
      String[] arrayInput = stringInput.split(", ");
      for(int i = 0; i < arrayInput.length; i++){
        String current = arrayInput[i];
        mainCharacter.setDirection(current.substring(0, 1));
        int currentDirection = mainCharacter.getDirection();
        int blocks = Integer.parseInt(current.substring(1));
        if(currentDirection == 0){
          mainCharacter.changeY(blocks);
        }
        else if(currentDirection == 90){
          mainCharacter.changeX(-blocks);
        }
        else if(currentDirection == 180){
          mainCharacter.changeY(-blocks);
        }
        else{
          mainCharacter.changeX(blocks);
        }
      }
    }catch(FileNotFoundException e){
      System.out.println("File not found");
    }
    return mainCharacter.getX() + mainCharacter.getY();
  }
  // public static int shortestPathB()
  public static void main(String[] args){
    System.out.println(shortestPathA("File.txt"));
  }
}
