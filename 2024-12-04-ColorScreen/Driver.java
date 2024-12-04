import java.util.Arrays;

public class Driver{
  public static void main(String[] args){
    border(80, 30);
    int[] arr = new int[3];
    for(int i = 0; i < 3; i++){
      double temp = Math.random() * 100;
      arr[i] = (int) (temp / 1);
    }
  }

  public static void border(int length, int width){
    Text.color(Text.background(Text.BLUE+ 60));
    for(int i = 0; i < length; i++){
      System.out.print(" ");
    }
    System.out.println(Text.RESET);
    for(int i = 0; i < width - 2; i++){
      Text.color(Text.background(Text.CYAN));
      System.out.print(" ");
      System.out.print(Text.RESET);
      for(int j = 0; j < length - 2; j++){
        System.out.print(" ");
      }
      Text.color(Text.background(Text.CYAN));
      System.out.print(" ");
      System.out.println(Text.RESET);
    }
    Text.color(Text.background(Text.BLUE + 60));
    for(int i = 0; i < length; i++){
      System.out.print(" ");
    }
    System.out.println(Text.RESET);
  }
}
