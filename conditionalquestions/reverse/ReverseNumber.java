import java.lang.*;
class ReverseNumber{
    public static void main(String args[]){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int rev=0;
        int m;
       while(n>0){
          m=n%10;
          rev=rev*10+m;
          n=n/10;

       }
        System.out.println("reverse of "+n+" numbers ="+rev);
    }
}