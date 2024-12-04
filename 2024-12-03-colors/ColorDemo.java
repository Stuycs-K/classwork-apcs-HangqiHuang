public class ColorDemo{
  //give length of animation when running
  public static final String CLEAR_SCREEN = "\u001b[2J";
  public static final String DEFAULT = "\u001b[0m";
  public static void main(String[] args){
    int length = Integer.parseInt(args[0]);
    for(int i = 0; i < length; i++){
      circle(i);
      sleep(60);
      System.out.print(CLEAR_SCREEN);
    }
    circle(length);
  }

  public static void circle(int movement){
    String color = "\u001b[41m";
    String displacement = "";
    for(int i = 0; i < movement; i++){
      displacement += " ";
    }
    System.out.println(displacement + "    " + color + "   " + DEFAULT + "    ");
    System.out.println(displacement + "  " + color + "  " + DEFAULT + "   " + color + "  " + DEFAULT);
    for(int i = 0; i < 2; i++){
      System.out.println(displacement + " " + color + " " + DEFAULT + "       " + color + " " + DEFAULT);
    }
    for(int i = 0; i < 3; i++){
      System.out.println(displacement + color + " " + DEFAULT + "         " + color + " " + DEFAULT);
    }
    for(int i = 0; i < 2; i++){
      System.out.println(displacement + " " + color + " " + DEFAULT + "       " + color + " " + DEFAULT);
    }
    System.out.println(displacement + "  " + color + "  " + DEFAULT + "   " + color + "  " + DEFAULT);
    System.out.println(displacement + "    " + color + "   " + DEFAULT + "    ");
    System.out.print(DEFAULT);
  }
  public static void sleep(int milli){
    try{
      Thread.sleep(milli);
    }catch(Exception e){

    }
  }
}
