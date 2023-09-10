import java.util.*;
class fact{
     public static void main(String [] args){
         System.out.println("enter the number");
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         double check=1;
         for(int i=2;i<=n;i++){
            check=check*i;
          }
         
           System.out.println("factorial is:"+check);

        }
}