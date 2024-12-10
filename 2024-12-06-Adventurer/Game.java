import java.util.Scanner;

public class Game{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter username");
    String userName = userInput.nextLine();
    System.out.println("Hello " + userName + ". You are a Scholar and your enemy is a codeWarrior. Fight until one of you dies. Type \"a\" to attack, \"sp\" to perform your special attack, \"su\" to support yourself, or \"quit\" to end the game.");
    Scholar player = new Scholar(userName);
    CodeWarrior Warrior1 = new CodeWarrior("Enemy", 100);
    // System.out.println("Hello " + userName + ". Choose the type of Adventurer you want to be. Enter (CodeWarrior/Scholar)");
    // String type = userInput.nextLine();
    // while(type.equals("CodeWarrior") || type.equals("Scholar"))
    String input = userInput.nextLine();
    while((player.getHP() > 0 && Warrior1.getHP() > 0) && !(input.equals("quit"))){
      if(input.equals("a")){
        System.out.println("\n" + player.attack(Warrior1));
      }
      else if(input.equals("sp")){
        System.out.println("\n" + player.specialAttack(Warrior1));
      }
      else if(input.equals("su")){
        System.out.println("\n" + player.support());
      }
      else if(!(input.equals("quit"))){
        System.out.println("Invalid input.\nType \"a\" to attack, \"sp\" to perform your special attack, \"su\" to support yourself, or \"quit\" to end the game.");
      }
      input = userInput.nextLine();
    }
    if(input.equals("quit")){
      System.out.println("You have quit the battle. Aura -1000");
    }
    else{
      if(player.getHP() <=0){
        System.out.println("You have died. Nice try.");
      }
      else if(Warrior1.getHP() <= 0){
        System.out.println("You successfully killed the enemy. Congrats!");
      }
    }
    userInput.close();
  }
}
