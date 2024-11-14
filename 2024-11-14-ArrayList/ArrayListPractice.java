import java.util.ArrayList;
import java.lang.Math;

public class ArrayListPractice(
  public static ArrayList<String>createRandomArray(int size){
    ArrayList<String> result = new ArrayList<String>(size);
    for(int i = 0; i < size; i++){
      int number = (int) (Math.random() * 11);
      if (number != 0){
        result.set(i, "" + number);
      }
      else{
        result.set(i, "");
      }
    }
    return result;
  }
)
