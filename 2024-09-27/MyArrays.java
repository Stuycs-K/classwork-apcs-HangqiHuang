public class MyArrays{
  public static void main(String[] args){
    System.out.println("Testing returnCopy: ");//a header
    int[] originalAry = new int[] {1, 5, 54, 2, 5, 778, 0};//first array
    int [] newAry = returnCopy(originalAry);//after running copy
    boolean returnCopyWorks = true;
    for (int i = 0; i < originalAry.length; i++){
      if(originalAry[i] != newAry[i]){
        returnCopyWorks = false;//check if ary is identical
      }
    }
    System.out.println(returnCopyWorks && (originalAry != newAry));//if identical and not same ary
    int[] oldAry = new int[] {11111, 9494, 2, 444, 8473, 0};//second ary
    int[] copyAry = returnCopy(oldAry);
    returnCopyWorks = true;
    for(int i = 0; i < oldAry.length; i++){
      if(oldAry[i] != copyAry[i]){
        returnCopyWorks = false;
      }
    }
    System.out.println(returnCopyWorks && (oldAry != copyAry));
  }

  public static int[] returnCopy(int[] ary){
    int[] copyAry = new int[ary.length];
    for(int i = 0; i < ary.length; i++){
      copyAry[i] = ary[i];
    }
    return copyAry;
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
