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
      int[][] raggedArray2D = {{}, {1}, {1, 2}, {1, 2, 3}};
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
      System.out.println("Testing swap");
      int[][] swapAry1 = {{1, 2}, {3, 4}, {5, 6}};
      int[][] swapAry2 = {{1, 2, 3}, {4, 5, 6}};
      System.out.println("Expected {{1, 3, 5}, {2, 4, 6}} vs tested: " + aryToString(swapRC(swapAry1)));
      System.out.println("Expected {{1, 4}, {2, 5}, {3, 6}} vs tested: " + aryToString(swapRC(swapAry2)));

      System.out.println("Testing negative");
      int[][] negativeAry1 = {{-1, 1}, {1, -1}};
      replaceNegative(negativeAry1);
      System.out.println("Should print {{1, 1}, {1, 1}} vs tested: " + aryToString(negativeAry1));
      int[][] negativeAry2 = {{-1, -2, -3}, {1, -5, -99}, {-1, 4}};
      replaceNegative(negativeAry2);
      System.out.println("Should print {{1, 0, 0}, {1, 1, 0}, {0, 4}} vs tested: " + aryToString(negativeAry2));

      System.out.println("Testing copy");
      int[][] copy1 = copy(squareArray2D);
      int[][] copy2 = copy(emptyArray2D);
      int[][] copy3 = copy(rectangularArray2D);
      int[][] copy4 = copy(raggedArray2D);
      System.out.println(checkCopy(squareArray2D, copy1) && squareArray2D != copy1);
      System.out.println(checkCopy(emptyArray2D, copy2) && emptyArray2D != copy2);
      System.out.println(checkCopy(rectangularArray2D, copy3) && rectangularArray2D != copy3);
      System.out.println(checkCopy(raggedArray2D, copy4) && raggedArray2D != copy4);
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

    //using aryToString1D
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
        return sum;
    }

    public static int[][] swapRC(int[][] nums){
        int row = nums.length;//# of rows in nums
        int column = nums[0].length;//# of columns in nums
        int[][] result = new int[column][row];
        int counter = 0;
        for (int i = 0; i < column; i++){
            counter = 0;
            while(counter < row){
                result[i][counter] = nums[counter][i];
                counter++;
            }
        }
        return result;
    }

    public static void replaceNegative(int[][] vals){
        for(int i = 0; i < vals.length; i++){
            for(int j = 0; j < vals[i].length; j++){
                if(vals[i][j] < 0){
                    if(i == j){
                        vals[i][j] = 1;
                    }
                    else{
                        vals[i][j] = 0;
                    }
                }
            }
        }
    }

    public static int[][] copy(int[][] nums){
        int row = nums.length;//how many rows
        int[][] result = new int[row][];
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != null){
                int column = nums[i].length;
                result[i] = new int[column];
                for(int j = 0; j < nums[i].length; j++){
                    result[i][j] = nums[i][j];
                }
            }
        }
        return result;
    }

    public static boolean checkCopy(int[][] original, int[][] copyVer){
        if(original.length != copyVer.length){//check length of array
            return false;
        }
        for(int i = 0; i < original.length; i++){//check length of array of array
            if((original[i] == null && copyVer[i] != null) || (copyVer[i] == null && copyVer[i] != null)){//check if null
                return false;
            }
            if(original[i].length != copyVer[i].length){//check length
                return false;
            }
        }
        for(int i = 0; i < original.length; i++){//check individual entity
            for(int j = 0; j < original[i].length; j++){
                if(original[i][j] != original[i][j]){
                    return false;
                }
            }
        }
        boolean change = true;
        if(copyVer[0] != null){
            copyVer[0][0] = 999;
            change = original[0][0] != 999;
        }
        return change;
    }
}