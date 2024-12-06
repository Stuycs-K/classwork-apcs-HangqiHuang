public class Driver{
  public static void main(String[] args){
    Adventurer Aemon = new Scholar("Aemon");
    Adventurer Luwin = new Scholar("Luwin");
    System.out.println(Luwin.attack(Aemon));
    System.out.println(Aemon.attack(Luwin));
    System.out.println(Luwin.support());
    System.out.println(Aemon.support(Aemon));
    System.out.println(Luwin.specialAttack(Aemon));
    Adventurer Pycelle = new Scholar("Pycelle");
  }
}
