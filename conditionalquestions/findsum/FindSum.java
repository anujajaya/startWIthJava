import java.lang.*;
class FindSum{
    public static void main(String args[]){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
             sum=sum+i;
        }
        System.out.println("sum of "+n+" numbers ="+sum);
    }
}