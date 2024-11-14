import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class TriangleTester{
  public static int countTrianglesA(String filename){
    int sum = 0;
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while(input.hasNextLine()){
        if(validTriangle(input.nextLine())){
          sum++;
        }
      }
    }catch(FileNotFoundException e){
      System.out.println("File not found");
    }
    return sum;
  }
  public static int countTrianglesB(String filename){
    int sum = 0;
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String stringInput = "";
      while(input.hasNextInt()){
        stringInput += input.nextInt() + " ";
      }//turned Scanner into desired String
      String[] arrayInput = stringInput.split(" ");
      for(int x = 0; x < arrayInput.length / 3; x+=3){//controls rows of three
        for(int y = 0; y < 3; y++){//controls which one in the row
          String stringSides = "";
          for(int z = 0; z < 3; z++){//controls which row in the three; want the row to change, not which one in the row
            stringSides += arrayInput[(x + z) * 3 + y] + " ";
          }
          if(validTriangle(stringSides)){
            sum++;
          }
        }
      }
    }catch(FileNotFoundException e){
      System.out.println("File not found");
    }
    return sum;
  }
  public static boolean validTriangle(String sideLengths){
    Scanner sides = new Scanner(sideLengths);
    int a = sides.nextInt();
    int b = sides.nextInt();
    int c = sides.nextInt();
    return (a + b > c && a + c > b && b + c > a);
  }
  public static void main(String[] args){
    System.out.println(countTrianglesB("inputTri.txt"));
  }
}
