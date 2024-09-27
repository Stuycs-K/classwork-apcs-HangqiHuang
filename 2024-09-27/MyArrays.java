public class MyArrays{
  public static void main(String args[]){
    System.out.print(arrayToString(new int[] {1,2,3,4,5,6,7,8,9}));
  }

  public static String arrayToString(int[] nums){
    String result = "[";
    if (nums.length != 0){
      for (int i = 0; i < nums.length; i++){
        result += nums[i];
        if (i != nums.length - 1){
          result += ", ";
        }
      }
    }
    return result += "]";
  }
}
