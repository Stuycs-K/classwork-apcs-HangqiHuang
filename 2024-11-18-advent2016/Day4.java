import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Day4{
  public static int removeDecoyA(String filename){
    Scanner input = Day2.parseFile(filename);//scanner
    int sum = 0;
    while(input.hasNextLine()){
      String line = input.nextLine();
      String encryptedName = line.substring(0, line.lastIndexOf("-"));
      int sectorID = Integer.parseInt(line.substring(line.lastIndexOf("-") + 1, line.indexOf("[")));
      String checkSum = line.substring(line.indexOf("[") + 1, line.indexOf("]"));
      // System.out.println(checkSum);
      for(int i = 0; i < encryptedName.length(); i++){
        if(encryptedName.substring(i, i + 1).equals("-")){
          encryptedName = encryptedName.substring(0, i) + encryptedName.substring(i + 1);
        }
      }//isolating different parts and formatting
      int[] frequency = new int[26];
      for(int i = 0; i < encryptedName.length(); i++){
        char currentLetter = encryptedName.charAt(i);
        frequency[currentLetter - 'a']++;
      }//number of times each appear
      int greatest = 0;
      for(int i = 0; i < frequency.length; i++){
        if(frequency[i] > greatest){
          greatest = frequency[i];
        }
      }
      char[][] orderedFreq = new char[greatest + 1][26];
      for(int i = 0; i < frequency.length; i++){
        orderedFreq[frequency[i]][i] = (char) (i + 'a');
      }
      for(int i = 0; i < orderedFreq.length; i++){
        orderedFreq[i] = alphabetize(orderedFreq[i]);
      }
    }
    return 0;
  }
  public static char[] alphabetize(char[] arr){
    return null;
  }

  public static void main(String[] args){
    removeDecoyA("FileDay4.txt");
  }
}
