import java.util.Scanner;

public class Game{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter username");
    String userName = userInput.nextLine();
    System.out.println("Hello " + userName + ". You are a Scholar and your enemy is a codeWarrior. Fight until one of you dies. Type \"a\" to attack, \"sp\" to perform your special attack, \"su\" to support yourself, or \"quit\" to end the game.");
    Scholar player = new Scholar(userName);
    CodeWarrior enemy = new CodeWarrior("Enemy", 100);
    // System.out.println("Hello " + userName + ". Choose the type of Adventurer you want to be. Enter (CodeWarrior/Scholar)");
    // String type = userInput.nextLine();
    // while(type.equals("CodeWarrior") || type.equals("Scholar"))
    String input = userInput.nextLine();
    while(player.getHP() > 0 && enemy.getHP() > 0){
      if
      }
    }
  }
}
