import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TriangleTester{
  public static int countTriangle(String filename){
    return 0;
  }
  public static boolean validTriangle(String sideLengths){
    Scanner sides = new Scanner(sideLengths);
    int a = Integer.parseInt(sides.next());
    int b = Integer.parseInt(sides.next());
    int c = Integer.parseInt(sides.next());
    return (a + b > c && a + c > b && b + c > a);
  }
  public static void main(String[] args){
    System.out.println(validTriangle("5 5 2"));
  }
}
