public class Scholar extends Adventurer{
  //inherited instance var
  private int Intelligence;
  private boolean Efficiency;

  //constructors
  public Scholar(String name){
    super(name, 100);
    Intelligence = 100;
    Efficiency = false;
  }

  //special consumnable resource
  public String getSpecialName(){
    return "Intelligence";
  }
  public int getSpecial(){
    return Intelligence;
  }
  public void setSpecial(int n){
    Intelligence = n;
  }
  public int getSpecialMax(){
    return 100;
  }

  //atk and support
  public String attack(Adventurer other){
    other.applyDamage(10);
    return this.getName() + " hits " + other + " with his textbook. 10 DMG is dealt.\n" + this.getName() + "'s HP: " + this.getHP() + "\n" + other + "'s HP: " + other.getHP() + "\n";
  }
  public String support(Adventurer other){
    other.setHP(other.getHP() + 10);
    return this.getName() + " healed " + other + " by 10 HP.\n" + other + "'s HP: " + other.getHP() + "\n";
  }
  public String support(){
    setEfficiency(true);
    return this.getName() + " improved their efficiency of converting Intelligence to damage. Damage increase twofold.\nNote: Basic ATK does not use Intelligence.\n";
  }
  public String specialAttack(Adventurer other){
    setSpecial(this.getSpecial() - 30);
    if(this.getEfficiency()){
      other.applyDamage(100);
    }
    else{
      other.applyDamage(50);
    }
    return this.getName() + " used 30 Intelligence to overloaded " + other + "'s brain with the knowledge of \"Never gonna give you up. Never gonna let you down...\"\n" + other + " took massive damage and is traumatized by the rickroll.\n" + this.getName() + "'s HP: " + this.getHP() + "\n" + other + "'s HP: " + other.getHP();
  }

  //Get methods
  public boolean getEfficiency(){
    return Efficiency;
  }
  //Set methods
  public void setEfficiency(boolean b){
    this.Efficiency = b;
  }
}
