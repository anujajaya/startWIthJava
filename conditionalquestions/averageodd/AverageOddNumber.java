import java.lang.*;

public class AverageOddNumber {
    public static void main(String args[]){
       int n=496213;
       int avg=0;
       int a;
       int count=0;
       int result=0;
       while(n>0){
       a=n%10;
       n=n/10;
       if(a%2==0){
         count++;

       result=result+a;
       avg=result/count;
       }
       }
              System.out.println("Arerage:"+result);
       System.out.println("Arerage:"+count);

       System.out.println("Arerage:"+avg);
    }
}
