import java.util.*;
class Pstring{
 public static void main(String []args){
	    String str=args[0];
       int size=str.length();
	   int flag=0;
	   for(int i=0,j=size-1;i<=j;i++,j--){
	   if(str.charAt(i)!=str.charAt(j)){
	   System.out.println("string is not palindrome");
	   flag=1;
	   break;
	   }
	   
	   }
	  if(flag==0){
		  System.out.println("string is palindrome");
	  } 
 }
}