import java.lang.*;
class Digits{
    public static void main(String args[]){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int r;;
        while(n>0){
          r=n%10;
          n=n/10;
                  System.out.println(r);

        }
        // System.out.println(n);
    }
}