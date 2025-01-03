public class MakeWord{
  public static void makeWords(int remainingLetters, String result, String alphabet){
    if(remainingLetters == 0){
      System.out.println(result);
    }
    else{
      for(int i = 1; i <= alphabet.length(); i++){
        makeWords(remainingLetters - 1, result + alphabet.substring(i - 1, i), alphabet);
      }
    }
  }
  public static String toWords(int n){
    if(("" + n).length() == 1){
      if(n == 0){
        return "zero";
      }
      if(n == 1){
        return "one";
      }
      if(n == 2){
        return "two";
      }
      if(n == 3){
        return "three";
      }
      if(n == 4){
        return "four";
      }
      if(n == 5){
        return "five";
      }
      if(n == 6){
        return "six";
      }
      if(n == 7){
        return "seven";
      }
      if(n == 8){
        return "eight";
      }
      if(n == 9){
        return "nine";
      }
    }
    else{
      if(("" + n).length() == 2){

      }
    }
    return "zero";
  }

  public static void main(String[] args){
    makeWords(3, "", "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    System.out.println(toWords(5));
  }
}
