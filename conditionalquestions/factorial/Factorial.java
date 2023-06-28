import java.lang.*;
class Factorial{
    public static void main(String args[]){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int fac=1;
        for(int i=1;i<=n;i++){
             fac=fac*i;
        }
        System.out.println("factorial of  "+n+" numbers ="+fac);
    }
}