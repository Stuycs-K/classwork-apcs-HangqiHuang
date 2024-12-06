public class Driver{
  public static void main(String[] args){
    // System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    border(80, 30);
    int[] arr = new int[3];
    for(int i = 0; i < 3; i++){
      double temp = Math.random() * 100;
      arr[i] = (int) (temp / 1);
    }
    Text.go(2, 2);
    for(int i = 0; i < 3; i++){
      if(arr[i] < 25){
        Text.color(Text.RED + 60);
      }
      if(arr[i] > 75){
        Text.color(Text.GREEN + 60);
      }
      System.out.print(arr[i]);
      System.out.print(Text.RESET);
      if(i != 2){
        System.out.print("                                    ");
      }
    }
    Text.go(3, 2);
    Text.color(Text.background(Text.YELLOW + 60), Text.MAGENTA);
    for(int i = 0; i < 80 - 2; i ++){
      System.out.print("-");
    }
    square(20);
    System.out.print(Text.RESET);
    Text.go(31, 1);
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
  public static void square(int length){
    Text.color(Text.GREEN);
    for(int i = 0; i < length; i++){
      Text.go(4 + i, 22);
      for(int j = 0; j < length; j++){
        System.out.print("NM");
      }
      System.out.println();
    }
  }
}
