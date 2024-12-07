public class Driver{
  public static void main(String[] args){
    Adventurer Aemon = new Scholar("Aemon");
    Adventurer Luwin = new Scholar("Luwin");
    Adventurer Pycelle = new Scholar("Pycelle", true);
    System.out.println(Aemon.specialAttack(Pycelle));
    System.out.println(Luwin.support());
    System.out.println(Pycelle.attack(Luwin));
    System.out.println(Aemon.support(Luwin));
    System.out.println(Luwin.specialAttack(Pycelle));
    System.out.println(Pycelle.support(Pycelle));
    System.out.println(Pycelle.support());
    System.out.println(Aemon.support());
    System.out.println(Luwin.support(Luwin));
    System.out.println(Pycelle.specialAttack(Luwin));
    System.out.println(Aemon.specialAttack(Pycelle));
  }
}
