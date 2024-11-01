import java.util.Scanner;
public class TriangleTester{
  public static int countTriangle(String filename){
    
  }
  public static boolean validTriangle(String sideLengths){
    Scanner sides = new Scanner(sideLengths);
    int a = Integer.parseInt(sides.next());
    int b = Integer.parseInt(sides.next());
    int c = Integer.parseInt(sides.next());
    return (a + b > c && a + c > b && b + c > a);
  }
  public static void main(String[] args){

  }
}
