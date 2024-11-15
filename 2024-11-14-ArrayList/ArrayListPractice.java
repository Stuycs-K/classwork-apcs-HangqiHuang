import java.util.ArrayList;
import java.lang.Math;

public class ArrayListPractice{
  public static ArrayList<String>createRandomArray(int size){
    ArrayList<String> result = new ArrayList<String>();
    for(int i = 0; i < size; i++){
      int number = (int) (Math.random() * 11);
      if (number != 0){
        result.add(i, "" + number);
      }
      else{
        result.add(i, "");
      }
    }
    return result;
  }
  public static void replaceEmpty( ArrayList<String> original){
    for(int i = 0; i < original.size(); i++){
      if(original.get(i) != null){
        if(original.get(i).equals("")){
          original.set(i, "Empty");
        }
      }
    }
  }
  public static ArrayList<String> makeReversedList( ArrayList<String> original){
    ArrayList<String> result = new ArrayList<String>(original.size());
    for(int i = original.size() - 1; i >= 0; i--){
      result.add(original.get(i));
    }
    return result;
  }
  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
  if(a.size() < b.size()){
    ArrayList<String> temp = a;
    a = b;
    b = temp;
  }
    ArrayList<String> result = new ArrayList<String>(a.size() + b.size());
    for(int i = 0; i < b.size(); i++){
        result.add(a.get(i));
        result.add(b.get(i));
    }
    if(b.size() != 0){
      for(int i = b.size(); i < a.size(); i++){
        result.add(a.get(i));
      }
    }
    else{
      for(int i = 0; i < a.size(); i++){
        result.add(a.get(i));
      }
    }
    return result;
  }
}
