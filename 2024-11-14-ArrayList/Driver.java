import java.util.ArrayList;

public class Driver{
  public static void main(String[] args){
    ArrayList<String> test1 = ArrayListPractice.createRandomArray(20);
    ArrayList<String> test2 = ArrayListPractice.createRandomArray(0);
    ArrayList<String> test3 = ArrayListPractice.createRandomArray(20);
    ArrayList<String> test4 = ArrayListPractice.createRandomArray(10);
    for(int i = 0; i < 20; i++){
      if((int) (Math.random() * 11) > 8){
        test3.set(i, null);
      }
    }
    System.out.println(test1);
    ArrayListPractice.replaceEmpty(test1);
    System.out.println("Test1: " + test1);
    System.out.println(test2);
    ArrayListPractice.replaceEmpty(test2);
    System.out.println("Test2: " + test2);
    System.out.println(test3);
    ArrayListPractice.replaceEmpty(test3);
    System.out.println("Test3: " + test3);
    System.out.println(ArrayListPractice.makeReversedList(test1));
    System.out.println(ArrayListPractice.makeReversedList(test2));
    System.out.println(ArrayListPractice.makeReversedList(test3));
    System.out.println("Test4" + test4);
    System.out.println("Test1 + 4: " + ArrayListPractice.mixLists(test1, test4));
    System.out.println(ArrayListPractice.mixLists(test1, test4).equals(ArrayListPractice.mixLists(test4, test1)));
    System.out.println("Test1 + 2: " + ArrayListPractice.mixLists(test1, test2));
    System.out.println("Test1 + 3: " + ArrayListPractice.mixLists(test1, test3));
    System.out.println("Test2 + 3: " + ArrayListPractice.mixLists(test2, test3));
    System.out.println("Test2 + 4: " + ArrayListPractice.mixLists(test2, test4));
    System.out.println("Test3 + 4: " + ArrayListPractice.mixLists(test3, test4));
  }
}
