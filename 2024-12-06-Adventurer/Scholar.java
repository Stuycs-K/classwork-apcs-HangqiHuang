public class Scholar extends Adventurer{
  //inherited instance var
  private int Intelligence;
  private boolean Efficiency;

  //constructors
  public Scholar(String name){
    super(name, 50);
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
    if(Efficiency){
      other.applyDamage(20);
      setEfficiency(false);
    }
    else{
      other.applyDamage(10);
    }
    return this.getName() + " hit " + other + " with his textbook.";
  }
  public String support(Adventurer other){
    other.setActionSpeed(other.getActionSpeed() + 10);
    return this.getName() + " made " + other + " think faster. Increase action speed.";
  }
  public String support(){
    setEfficiency(true);
    return this.getName() + " improved their efficiency of converting Intelligence to damage. Damage increase twofold.";
  }

  //Set methods
  public void setEfficiency(boolean b){
    this.Efficiency = b;
  }
}
