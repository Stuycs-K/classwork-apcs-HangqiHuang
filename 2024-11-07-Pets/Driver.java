//When the getName() is overrided, the getName() in the Bird class runs the new getName() but the animal class still runs the old getName().

 //Bird = Animal don't work because Animal doesn't fit into Bird. Bird is-a Animal, but Animal isn't-a Bird.
public class Driver{
  public static void main(String[] args){
    Animal Fred = new Animal("Baaaaa", 3, "Fred");
    Fred.speak();
    Bird Birdo = new Bird("Squaaaak", 2, "Birdo", 4.0, "pink");
    Birdo.speak();

    Animal a1 = new Animal("meow", 3, "a1");
    Bird b1 = new Bird("woof", 2, "b1", 2.0, "light blue");
    //Bird b2 = new Animal("meow", 3, "b2");
    Animal a2 = new Bird("woof", 2, "a2", 2.0, "light blue");
    a1.speak();
    b1.speak();
    a2.speak();
    //even though a2 is an Animal, the speak() method is the one written in Bird because a2 technically is a Bird, so it uses the Bird.speak() method.
  }
}
