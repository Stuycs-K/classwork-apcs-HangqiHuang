import java.util.Scanner;
import java.util.Arrays;

public class Day6{
  public static String codeRecoverA(String filename){
    Scanner input = Day2.parseFile(filename);
    String stringInput = "";
    int lineNumber = 0;
    while(input.hasNextLine()){//converting to String
      stringInput += input.nextLine();
      lineNumber++;
    }
    String message = "";
    for(int i = 0; i < 8; i++){//frequency Array
      int[] frequency = new int[26];
      for(int j = 0; j < lineNumber; j++){
        char current = stringInput.charAt(j * 8 + i);
        frequency[current - 'a']++;
      }
      int greatest = 0;
      int index = 0;
      for(int j = 0; j < frequency.length; j++){
        if(frequency[j] > greatest){
          greatest = frequency[j];
          index = j;
        }
      }
      message += (char) (index + 'a');
    }
    return message;
  }
  public static String codeRecoverB(String filename){
    Scanner input = Day2.parseFile(filename);
    String stringInput = "";
    int lineNumber = 0;
    while(input.hasNextLine()){//converting to String
      stringInput += input.nextLine();
      lineNumber++;
    }
    String message = "";
    for(int i = 0; i < 8; i++){//frequency Array
      int[] frequency = new int[26];
      for(int j = 0; j < lineNumber; j++){
        char current = stringInput.charAt(j * 8 + i);
        frequency[current - 'a']++;
      }
      int index = 0;
      int least = frequency[0];
      for(int j = 0; j < frequency.length; j++){
        if(frequency[j] < least){
          index = j;
        }
      }
      message += (char) (index + 'a');
    }
    return message;
  }
  public static void main (String[] args){
    System.out.println(codeRecoverA("FileDay6.txt"));
    System.out.println(codeRecoverB("FileDay6.txt"));
  }
}
