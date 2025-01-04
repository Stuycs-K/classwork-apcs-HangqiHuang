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
    int length = ("" + n).length();
    int current = n / (int) Math.pow(10, length - 1);
    if(length == 1){
      if(current == 0){
        return "zero";
      }
      if(current == 1){
        return "one";
      }
      if(current == 2){
        return "two";
      }
      if(current == 3){
        return "three";
      }
      if(current == 4){
        return "four";
      }
      if(current == 5){
        return "five";
      }
      if(current == 6){
        return "six";
      }
      if(current == 7){
        return "seven";
      }
      if(current == 8){
        return "eight";
      }
      if(current == 9){
        return "nine";
      }
    }
    else if(length == 2){
      int next = n - (int) (current * Math.pow(10, length - 1));
      if(n == 10){
        return "ten";
      }
      if(n == 11){
        return "eleven";
      }
      if(n == 12){
        return "twelve";
      }
      if(n == 13){
        return "thirteen";
      }
      if(n == 14){
        return "fourteen";
      }
      if(n == 15){
        return "fifteen";
      }
      if(n == 16){
        return "sixteen";
      }
      if(n == 17){
        return "seventeen";
      }
      if(n == 18){
        return "eighteen";
      }
      if(n == 19){
        return "nineteen";
      }
      if(current == 2){
        if(next == 0){
          return "twenty";
        }
        return "twenty-" + toWords(next);
      }
      if(current == 3){
        if(next == 0){
          return "thirty";
        }
        return "thirty-" + toWords(next);
      }
      if(current == 4){
        if(next == 0){
        return "fourty";
        }
        return "fourty-" + toWords(next);
      }
      if(current == 5){
        if(next == 0){
          return "fifty";
        }
        return "fifty-" + toWords(next);
      }
      if(current == 6){
        if(next == 0){
          return "sixty";
        }
        return "sixty-" + toWords(next);
      }
      if(current == 7){
        if(next == 0){
          return "seventy";
        }
        return "seventy-" + toWords(next);
      }
      if(current == 8){
        if(next == 0){
          return "eighty";
        }
        return "eighty-" + toWords(next);
      }
      if(current == 9){
        if(next == 0){
          return "ninety";
        }
        return "ninety-" + toWords(next);
      }
      return toWords(next);
    }
    return "";
  }

  public static void main(String[] args){
    // makeWords(3, "", "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    for(int i = 0; i < 100; i++){
      System.out.println(toWords(i));
    }
  }
}
