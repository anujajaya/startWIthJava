import java.lang.*;
import java.util.*;
class Switchcase{
    public static void main(String args[]){
        int month =4;
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter month");
        int M=sc.nextInt();
        switch(M){
        case 1:
            System.out.println("Jan");
            break;
              case 2:
            System.out.println("Feb");
            break;
              case 3:
            System.out.println("Mar");
            break; 
             case 4:
            System.out.println("Apr");
            break; 
             case 6:
            System.out.println("May");
            break; 
             case 7:
            System.out.println("Jun");
            break; 
             case 8:
            System.out.println("Jul");
            break; 
             case 9:
            System.out.println("Aug");
            break;
            default: System.out.println("Invalid");

        }
    }
}