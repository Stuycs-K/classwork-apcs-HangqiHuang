//46 is biggest n after 10 seconds
//46 is also the biggest that doesn't overflow(when system run out of integers, it goes negative)

public class Fibonacci{
  public static int fibonacci(int n){
    if(n < 2){
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
  public static void main(String[] args){
    System.out.println(fibonacci(Integer.parseInt(args[0])));
    }
  }
