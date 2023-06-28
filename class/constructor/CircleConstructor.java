import java.lang.*;
class Circle{
  private double radius=5;
  public double  Circle(double r){
        radius=r;
        return Math.PI*r*r;
          
  }   
  public class Circles{
    public  void main(String args[]){
        Circle c1=new Circle();
        System.out.println(c1.Circle((1)));

    }
  }
}