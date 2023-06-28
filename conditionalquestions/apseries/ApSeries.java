package conditionalquestions.apseries;
import java.lang.*;
import java.util.*;
class ApSeries{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a,d and n");
        int a=sc.nextInt();
         int d=sc.nextInt();
        int n=sc.nextInt();
        int term=a;
        for(int i=0;i<n;i++){
       System.out.println(term);
        term=term+d;
        }

    }
}