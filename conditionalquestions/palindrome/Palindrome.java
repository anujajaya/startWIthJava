import java.lang.*;
class Palindrome{
    public static void main(String args[]){
       java.util.Scanner sc=new java.util.Scanner(System.in);
       System.out.println("Enter a number");
       int n= sc.nextInt();
       int m=n;int r;int result=0;

       while(n>0){
         r=n%10;
         result=result*10+r;
         n=n/10;
       }

       if(result==m){
        System.out.println("Number is Palindrome");
       }
       else{
        System.out.println("Number is not Plindrome");
       }
    }
}