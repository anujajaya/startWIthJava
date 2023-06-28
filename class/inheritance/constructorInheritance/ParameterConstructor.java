import java.lang.*;
class Parent{
     Parent(int o){
        System.out.println("parent"+o);
    }
}
    class Child extends Parent{
      
        Child(int l,int h){
            super(h);
           System.out.println("Child"+l);
        }
      
    }

public class ParameterConstructor {
    public static void main(String args[]){
     Child c=new Child(4,2);
    }
}
