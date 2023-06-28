import java.lang.*;
 class ArrayRotation {
    public static void main(String args[]){
        int a[]={1,2,3,5,6,5,6,8,9,9};
        int temp=a[0];
        for(int i=0;i<a.length;i++){
            a[i-1]=a[i];

        }
        a[a.length-1]=temp;
        for(int j=0;j<a.length;j++){
          System.out.println(a[j]);
        }
    }
}
