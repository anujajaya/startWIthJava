
class Armstrong{
    public static void main(String args[]){
       java.util.Scanner sc=new java.util.Scanner(System.in);
       System.out.println("Enter number");
       int n=sc.nextInt();
       int r=0;int m;
       int h=n;
       while(n>0){
        m=n%10;
                        r=r+m*m*m;

        n=n/10;

            //    System.out.println(r);

       }
       if(h==r){
               System.out.println("Armstrong number");

       }
       else{
               System.out.println("Not an Armstrong number");

       }
    }
}