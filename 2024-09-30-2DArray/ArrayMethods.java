//Hangqi, hangqih@nycstudents.net; Veronika, vgulko60@stuy.edu
public class ArrayMethods{
    public static void main(String[] args){
      int[] firstArray1D = new int[] {1, 2, 3, 4, 5};
      int[] secondArray1D = new int [] {};
      System.out.println(aryToString(firstArray1D));
      System.out.println(aryToString(secondArray1D));
      int[][] squareArray2D = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
      int[][] emptyArray2D = new int[3][];
      int[][] rectangularArray2D = new int[3][4];
      int[][] raggedArray2D = {{1}, {1, 2}, {1, 2, 3}};
      System.out.println(aryToString(squareArray2D));
      System.out.println(aryToString(emptyArray2D));
      System.out.println(aryToString(rectangularArray2D));
      System.out.println(aryToString(raggedArray2D));
    }
  
    public static String aryToString(int[] nums){
        String result = "{";
        if (nums.length != 0){
            for (int i = 0; i < nums.length; i++){
                result += nums[i] + ", ";
            }
            result = result.substring(0, result.length() - 2);
        } 
        result += "}";
        return result;
    }
      //using helper func
    public static String aryToString(int[][] nums){
      String result = "{";
      for(int i = 0; i < nums.length; i++){
        result += aryToString(nums[i]) + ", ";
      }
      result = result.substring(0,-2);
      result += "}";
      return(result);
    }
  }