import java.util.*;
class first{
     public static void main(String [] args){
         System.out.println("enter the number");
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int check=0;
         for(int i=2;i<n/2;i++){
            if(n%i==0){
                System.out.println("number is not prime");
                check=1;
                 break;
            }
          }
          if(check==0)
           System.out.println("no is prime");

        }
}