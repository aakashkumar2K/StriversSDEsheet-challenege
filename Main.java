import java.util.*;
class Main{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		double arr[]=new double[size];
		System.out.println("enter elements in array:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextDouble();
		}
		Vector obj=new Vector(arr);
		System.out.println(obj.getNumber(3));
		Vector obj2=new Vector(obj);
		System.out.println(obj.getNumber(3));
		obj.printVector();
		obj.multiply(obj2);
		obj.printVector();
	}
}