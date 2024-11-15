import java.util.ArrayList;

public class Driver{
  public static void main(String[] args){
    ArrayList<String> test1 = ArrayListPractice.createRandomArray(20);
    ArrayList<String> test2 = ArrayListPractice.createRandomArray(0);
    ArrayList<String> test3 = ArrayListPractice.createRandomArray(20);
    for(int i = 0; i < 20; i++){
      if((int) (Math.random() * 11) > 8){
        test3.add(null);
      }
    }
    System.out.println(test1);
    ArrayListPractice.replaceEmpty(test1);
    System.out.println(test1);
    System.out.println(test2);
    ArrayListPractice.replaceEmpty(test2);
    System.out.println(test2);
    System.out.println(test3);
    ArrayListPractice.replaceEmpty(test3);
    System.out.println(test3);
    System.out.println(ArrayListPractice.makeReversedList(test1));
    System.out.println(ArrayListPractice.makeReversedList(test2));
    System.out.println(ArrayListPractice.makeReversedList(test3));
  }
}
