import java.lang.*;
import java.util.*;

 class SmallestNumber {

  public static void main(String[] args) {
   java.util.Scanner sc = new java.util.Scanner(System.in);

    System.out.print("Enter the number of elements limit ");
    int n = sc.nextInt();
    int a=[];
     for(int i=0; i<=n; i++){
      System.out.print("Enter element " + (i + 1) + ": ");
            int num = sc.nextInt();
    
     }
    
  }
}

import java.lang.*;
import java.util.*;

class Sort {
    public static void main(String args[]){
        Scanner scanObj = new Scanner(System.in); 
        System.out.println("Enter limit");
        int limit = scanObj.nextInt();
        ArrayList<Integer> numberArray = new ArrayList<Integer>();
        int minValue = Integer.MAX_VALUE;
        for(int i=0;i<limit;i++){
            System.out.println("Enter "+(i+1)+"th number");
            numberArray.add(scanObj.nextInt());
        }
        System.out.println(numberArray);
        for(int k=0;k<numberArray.size();k++){
        System.out.println(numberArray.get(k));
            if(numberArray.get(k)<minValue){
                minValue = numberArray.get(k);
            }
        }
        System.out.println("minValue "+minValue);
    }
}