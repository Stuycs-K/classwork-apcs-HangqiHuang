import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class TriangleTester{
  public static int countTriangle(String filename){
    File file = new File(filename);
    Scanner input = new Scanner(file);
    int sum = 0;
    while(input.hasNextLine()){
      if(validTriangle(input.nextLine()) == true){
        sum++;
      }
    }
    return sum;
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
