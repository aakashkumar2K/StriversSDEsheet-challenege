import java.util.*;
class ques9{
	public static void main(String []args){
		 double no1=Double.parseDouble(args[0]);
		 double no2=Double.parseDouble(args[1]);
		 System.out.println("enter the operator(+,-,*,/)");
		 Scanner sc=new Scanner(System.in);
		 char ch=sc.next().charAt(0);
		 switch(ch){
			 case '+':
			    System.out.println(no1+no2);
				break;
		     case '-':
			    System.out.println(no1-no2);
				break;
			case '*':
			    System.out.println(no1*no2);	
				break;
			case '/':
			    System.out.println(no1/no2);	
				break;
			default:
               System.out.println("wrong choice");			
		 }
	}
	 
}