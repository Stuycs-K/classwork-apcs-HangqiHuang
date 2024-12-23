import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile{
  public static void main(String[] args){
    Scanner sc1 = new Scanner("This is a bunch of words");
    while(sc1.hasNext()){
      System.out.println(sc1.next());
    }
    Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");
    double sum = 0.0;
    while(sc2.hasNextDouble()){
      sum+= sc2.nextDouble();
    }
    System.out.println(sum);

    try{
      File file = new File("ReadFile.java");
      Scanner input = new Scanner(file);
      int i = 0;
      while(input.hasNextLine()){
        String currentLine = input.nextLine();
        if(currentLine.indexOf('{') != -1){
          System.out.println(currentLine);
        }
      }
      input.close();
    }catch(FileNotFoundException e){
      System.out.println("File not found");
      return;
    }
  }
}
