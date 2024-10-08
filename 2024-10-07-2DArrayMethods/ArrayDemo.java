import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    int[] array1 = {1, 2, 3, 4, 5};
    System.out.println("Testing arrToString with Array.toString: " + arrToString(array1).equals(Arrays.toString(array1)));
    System.out.println("Testing countZeros2D");
    int[][] array2 = {{0, 1}, {1, 0, 2}, {2, 0}};
    int[][] array3 = {{1}, {1}, {1}, {1}, {1}};
    System.out.println(countZeros2D(array2) == 3);
    System.out.println(countZeros2D(array3) == 0);
    System.out.println("Testing sum");
    int[][] array4 = {{-2}, {2}, {-2}, {-2}, {2}, {2}};
    System.out.println(arr2DSum(array2) == 6);
    System.out.println(arr2DSum(array3) == 5);
    System.out.println(arr2DSum(array4) == 0);
    System.out.println("Testing replaceNegative");
    replaceNegative(array4);
    System.out.println("[[1], [2], [0], [0], [2], [2]]".equals(arrToString(array4)));//Array.toString only works with 1D arrays
    System.out.println("Testing copy");
    int[][] array5 = {{0, 1, 2, 3, 4, 5}, {2}, {-5, 4, 9}, {0}};
    System.out.println(arrToString(copy(array5)));
    int[][] array6 = copy(array5);
    boolean notSameArray = array5 == array6;
    array6[1][0] = 0;
    System.out.println(!notSameArray && !(arrToString(array5).equals(arrToString(array6))));
    System.out.println("Testing swap");
    int[][] array7 = {{0, 1}, {5, 4}, {6, 0}};
    System.out.println(arrToString(swapRC(swapRC(array7))));
    System.out.println(arrToString(array7).equals(arrToString(swapRC(swapRC(array7)))));
    System.out.println("Testing htmlTable");
    System.out.println("<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>".equals(htmlTable(new int[][]{{1,2},{3}})));
    System.out.println(htmlTable(array5));//manually check
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String result = "[";
    if (ary.length != 0){
        for (int i = 0; i < ary.length; i++){
            result += ary[i] + ", ";
        }
        result = result.substring(0, result.length() - 2);
    }
    result += "]";
    return result;
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String result = "[";
    for(int i = 0; i < ary.length; i++){
        if (ary[i] != null){
            result += arrToString(ary[i]) + ", ";
        }
    }
    if(!(result.equals("["))){
        result = result.substring(0,result.length() - 2);
    }
    result += "]";
    return result;
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for(int i = 0; i < nums.length; i++){
      for(int j = 0; j < nums[i].length; j++){
        if (nums[i][j] == 0){
          count++;
        }
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for(int i = 0; i < nums.length; i++){
      for(int j = 0; j < nums[i].length; j++){
        sum += nums[i][j];
      }
    }
    return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
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

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    int[][] copy = new int[nums.length][];
    for(int i = 0; i < nums.length; i++){
      copy[i] = copy1D(nums[i]);
    }
    return copy;
  }

  public static int[] copy1D(int[] nums){
    int[] copy = new int[nums.length];
    for(int i = 0; i < nums.length; i++){
      copy[i] = nums[i];
    }
    return copy;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] swap = new int[nums[0].length][nums.length];
    for(int row = 0; row < nums.length; row++){
      for(int column = 0; column < nums[0].length; column++){
        swap[column][row] = nums[row][column];
      }
    }
    return swap;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String result = "<table>";
    for(int row = 0; row < nums.length; row++){
      result += "<tr>";
      for(int column = 0; column < nums[row].length; column++){
        result += "<td>" + nums[row][column] + "</td>";
      }
      result += "</tr>";
    }
    return result += "</table>";
  }
}
