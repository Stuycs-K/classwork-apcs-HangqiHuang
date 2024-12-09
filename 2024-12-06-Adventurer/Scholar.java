public class Scholar extends Adventurer{
  //inherited instance var
  private int Intelligence;
  private boolean Boss, Efficiency;

  //constructors
  public Scholar(String name){
    super(name, 100);
    Intelligence = 100;
    Boss = false;
    Efficiency = false;
  }
  public Scholar(String name, boolean special){
    super(name, 200);
    Intelligence = 100;
    Boss = true;
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
    if(this.getBoss()){
      other.applyDamage(30);
      return this.getName() + " released an avalanche of books on " + other + ", dealing 30 DMG.\n" + this.getName() + "'s HP: " + this.getHP() + "\n" + other + "'s HP: " + other.getHP() + "\n";
    }
    other.applyDamage(10);
    return this.getName() + " hits " + other + " with his textbook, dealing 10 DMG.\n" + this.getName() + "'s HP: " + this.getHP() + "\n" + other + "'s HP: " + other.getHP() + "\n";
  }
  public String support(Adventurer other){
    if(this.getBoss()){
      return "Support skill for others are not available for Bosses.\n";
    }
    String target;
    if(other.getName().equals(this.getName())){
      target = "themself";
  }
    else{
      target = other.getName();
    }
    other.setHP(other.getHP() + 10);
    return this.getName() + " healed " + target + " by 10 HP.\n" + other + "'s HP: " + other.getHP() + "\n";
  }
  public String support(){
    setEfficiency(true);
    return this.getName() + " improves their efficiency of converting Intelligence to damage. Damage increase twofold.\nNote: Basic ATK does not use Intelligence.\n";
  }
  public String specialAttack(Adventurer other){
    int DMGDealt;
    if(this.getBoss()){
      setSpecial(this.getSpecial() - 50);
      if(this.getEfficiency()){
        DMGDealt = 150;
      }
      else{
        DMGDealt = 75;
      }
      other.applyDamage(DMGDealt);
      return this.getName() + "drew a fire dragon on paper and used 50 Intelligence to transform it into reality. " + other + " took " + DMGDealt + " DMG from the dragon's fiery breathe.\n" + this.getName() + "'s HP: " + this.getHP() + "\n" +this.getName() + "'s Intelligence: " + this.getIntelligence() + "\n" + other + "'s HP: " + other.getHP() + "\n";
    }
    setSpecial(this.getSpecial() - 30);
    if(this.getEfficiency()){
      DMGDealt = 100;
    }
    else{
      DMGDealt = 50;
    }
    other.applyDamage(DMGDealt);
    return this.getName() + " used 30 Intelligence to overloaded " + other + "'s brain with the ancient knowledge of mating pigs. " + other + " took " + DMGDealt + " damage.\n" + this.getName() + "'s HP: " + this.getHP() + "\n" + this.getName() + "'s Intelligence: " + this.getIntelligence() + "\n" + other + "'s HP: " + other.getHP() + "\n";
  }

  //Get methods
  public int getIntelligence(){
    return Intelligence;
  }
  public boolean getEfficiency(){
    return Efficiency;
  }
  public boolean getBoss(){
    return Boss;
  }
  @Override
  public String getName(){
    if(this.getBoss()){
      return "Lord " + super.getName();
    }
    return super.getName();
  }
  //Set methods
  public void setEfficiency(boolean b){
    this.Efficiency = b;
  }
}
