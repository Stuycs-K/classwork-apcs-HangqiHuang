public class Point{
  private double x,y;

  public String toString(){
    String result = "(";
    result += x + ", " + y;
    return result + ")";
  }

  //Initialize this Point to have the same values as the other Point.
  public Point(Point other){
    x = other.x;
    y = other.y;
  }

  //Initialize this Point to have the provided values
  public Point(double x, double y){
    this.x=x;
    this.y=y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }

  /*
  Write this method FOURTH, go to the main and do that one first.
  */
  public double distanceTo(Point other){
    double otherX = other.getX();
    double otherY = other.getY();
    return Math.sqrt(Math.pow(otherX - x, 2) + Math.pow(otherY -y, 2));
  }

  /*
  Write this method last. Re-use (NOT COPY/PASTE) prior work and
  do not write redundant code.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() -b.getY(), 2));
  }
}
