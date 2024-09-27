public class MyArrays{
  public static void main(String[] args){
    System.out.println("Testing returnCopy: ");
    int[] originalAry = new int[] {1, 5, 54, 2, 5, 778, 0};
    int [] newAry = returnCopy(originalAry);
    boolean returnCopyWorks true;
    for (int i = 0; i < originalAry; i++){
      if(originalAry[i] != newAry[i]){
        return returnCopyWorks;
      }
    }
    System.out.println(returnCopyWorks && (originalAry != newAry));
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
