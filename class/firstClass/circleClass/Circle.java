import java.lang.*;
class Circles{
  public  double r;
  public double  area(){
     return Math.PI*r*r;
    }
}
 class Circle {
    public static void main(String args[]){
           Circles c1=new Circles();
           c1.r=7;
          Circles c2=new Circles();
          c2.r=56;

           System.out.println(c1.area());
          System.out.println(c2.area());

    }
}


// class Circle 
// {
//     public double radius;
    
//     public double area()
//     {
//         return Math.PI*radius*radius;
//     }
//     public double perimeter()
//     {
//         return 2*Math.PI*radius;
//     }
//     public double circumference()
//     {
//         return perimeter();
//     }
            
    
// }
//  class Java1 {

//     public static void main(String[] args) {
//      Circle c1=new Circle();
//      c1.radius=7;
//      System.out.println("Area:"+c1.area());
//      System.out.println("Perimeter:"+c1.perimeter());
//      System.out.println("Circumference:"+c1.circumference());
//     }
    
// }