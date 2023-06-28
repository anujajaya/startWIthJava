import java.lang.*;
class Circle{
    public double r;

    public double area(){
        return this.r=6;
    }
}
class Cylinder extends Circle{
    public double height;
    public double volum(){
        return area()*height;
    }
}

public class StartInheritance {
    public static void main(String args[]){
        Cylinder cy=new Cylinder();
    cy.r=4;
    cy.height=2.5;
    System.out.println(cy.volum());

    }

}
