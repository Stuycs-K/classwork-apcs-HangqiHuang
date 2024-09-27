public class MyArrays.java{
  public static void main(String args[]){

  }

public static String arrayToString(int[] nums){
  String result = "[";
  if (nums.length != 0){
    for (int i = 0; i < nums.length; i++){
      if (i != nums.length - 1){
        result += nums[i] + ", ";
      }
    }
  }
  return result+="]";
}
}
