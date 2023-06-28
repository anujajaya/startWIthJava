import java.lang.*;
class CounntDigits{
    public static void main(String args[]){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int count=0;
        while(n>0){
          n=n/10;
          count++;


        }
                  System.out.println(count);
    }
}