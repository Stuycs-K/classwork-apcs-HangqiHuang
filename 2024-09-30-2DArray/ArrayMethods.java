//Hangqi, hangqih@nycstudents.net; Veronika, vgulko60@stuy.edu
public class ArrayMethods{
    public static void main(String[] args){
      int[] firstArray1D = new int[] {1, 2, 3, 4, 5};
      int[] secondArray1D = new int [] {};
      System.out.println("Testing 1D array");
      System.out.println(aryToString(firstArray1D));
      System.out.println(aryToString(secondArray1D));
      int[][] squareArray2D = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
      int[][] emptyArray2D = new int[3][];//because I haven't preset the column, the array holds null
      int[][] rectangularArray2D = new int[3][4];
      int[][] raggedArray2D = {{1}, {1, 2}, {1, 2, 3}};
      System.out.println("Testing 2D aryToString");
      System.out.println(aryToString(squareArray2D));
      System.out.println(aryToString(emptyArray2D));
      System.out.println(aryToString(rectangularArray2D));
      System.out.println(aryToString(raggedArray2D));
      System.out.println("Testing sum");
      System.out.println("Expected 45 vs tested: " + arr2DSum(squareArray2D));
      System.out.println("Expected 0 vs tested: " + arr2DSum(emptyArray2D));
      System.out.println("Expected 0 vs tested: " + arr2DSum(rectangularArray2D));
      System.out.println("Expected 10 vs tested: " + arr2DSum(raggedArray2D));
      rectangularArray2D[1] = new int[] {1, 2, 3, 4};
      System.out.println("Expected 10 vs tested: " + arr2DSum(rectangularArray2D));
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
            if (nums[i] != null){
                result += aryToString(nums[i]) + ", ";
            }
        }
        if(!(result.equals("{"))){
            result = result.substring(0,result.length() - 2);
        }
        result += "}";
        return result;
}
public static int arr2DSum(int[][] nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++){
        if (nums[i] != null){
            for (int x = 0; x < nums[i].length; x++){
                sum += nums[i][x];
            }
        }
    }
    return sum
}
}