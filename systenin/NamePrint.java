import java.lang.*;
import java.util.*;
class NamePrint{
    public static void main(String args[]){
        System.out.println("enter your name please");
        java.util.Scanner s=new java.util.Scanner(System.in);
        String name=s.next();
        System.out.println("Welcome"+"\t"+name);
    }
}