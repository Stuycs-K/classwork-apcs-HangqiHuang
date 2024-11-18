public class Point{
  private int x;
  private int y;
  private int direction;

  public Point(){
    x = 0;
    y = 0;
    direction = 0;
  }

  public void setDirection(String direction){
    if(direction == "R"){
      this.direction -= 90;
    }
    else{
      this.direction += 90;
    }
  }
  public int getDirection(){
    return this.direction;
  }
  public void setX(int x){
    this.x = x;
  }
  public void setY(int y){
    this.y = y;
  }
  public int getX(){
    return this.x;
  }
  public int getY(){
    return this.y;
  }
}
