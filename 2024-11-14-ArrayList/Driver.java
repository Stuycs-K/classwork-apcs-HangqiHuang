import java.util.ArrayList;

public class Driver{
  public static void main(String[] args){
    ArrayList<String> test1 = ArrayListPractice.createRandomArray(20);
    System.out.println(test1);
    ArrayListPractice.replaceEmpty(test1);
    System.out.println(test1);
  }
}
