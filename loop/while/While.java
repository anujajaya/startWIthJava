import java.lang.*;
class While{
public static void main(String args[]){
   int i=1;int n= 100;
   while(i<n){
   System.out.println(i);
   i=i*2;
      System.out.println(" second last"+i);

   }
      System.out.println("last"+i);

     int j=1;int m= 100;
     do{
           System.out.println("do while"+j);
         j=j*2;

     }while(j<100);

}
}