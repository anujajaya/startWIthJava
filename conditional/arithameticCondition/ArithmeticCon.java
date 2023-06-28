import java.lang.*;
import java.util.*;
class ArithmeticCon{
    public static void main(String args[]){
    System.out.println("Menu"+"\n"+"ADD"+"\n"+"SUB"+"\n"+"MUL"+"\n"+"DIV");
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter n numbers");
    int x=sc.nextInt();
    int y=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the sbove options");
     String options=sc.nextLine();
      switch(options){
        case "ADD": System.out.println("Sum ="+(x+y));
        break;
         case "SUB": System.out.println("Sub ="+(x-y));
        break;
         case "MUL": System.out.println("Mul ="+(x*y));
        break;
         case "DIV": System.out.println("Div ="+(x/y));
        break;
        default:System.out.println("Invalid Options");
      }
    }
}