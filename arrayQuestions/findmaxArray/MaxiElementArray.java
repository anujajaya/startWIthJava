import java.util.*;
public class MaxiElementArray {
    public static void main(String args[]){
        int a[]={45,52,56,62};
       int max=a[0];
       for(int i=0;i<a.length;i++){
         if(a[i]>max){
           max=a[i];
         }
       }

    System.out.println(max);
    }
}
