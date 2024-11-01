import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TriangleTester{
  public static int countTriangle(String filename){
    try{
      int sum = 0;
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while(input.hasNextLine()){
        if(validTriangle(input.nextLine())){
          sum++;
        }
        input.close();
        return sum;
      }
    }catch(FileNotFoundException e){
      System.out.println("File not found");
    }
  }
  public static boolean validTriangle(String sideLengths){
    Scanner sides = new Scanner(sideLengths);
    int a = sides.nextInt();
    int b = sides.nextInt();
    int c = sides.nextInt();
    return (a + b > c && a + c > b && b + c > a);
  }
  public static void main(String[] args){
    System.out.println(validTriangle("5 5 2"));
    System.out.println(countTriangle("inputTri.txt"));
  }
}
