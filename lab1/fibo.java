import java.util.*;
class fibo{
    public static void main(String []args){
      int n=Integer.parseInt(args[0]);
	  int a=0;
	  int b=1;
	  int i=2;
	  System.out.print("fibonacii series : ");
	  System.out.print(a+" "+b+" ");
	  while(i!=n){
		System.out.print(a+b+" ");
        b=b+a;
        a=b-a;
       i++;		
	  }
    }
}