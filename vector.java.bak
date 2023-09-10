import java.util.*;
class Vector{
     int size;
	 double arr[];
	 Vector(double arr[]){
		 this.size=arr.length;
		 this.arr=new double[size];
		 for(int i=0;i<size;i++){
			 this.arr[i]=arr[i];
		 }
	 }
	 Vector(Vector obj){
		this.size=obj.size;
		this.arr=new double[this.size];
		 for(int i=0;i<size;i++){
			 this.arr[i]=obj.arr[i];
		 }
	 }
	 void set(int index, double number){
		if(index<this.size){
			arr[index]=number;
			System.out.println(number+" is set");
		}
		else{
			System.out.println("index out of range");
		}
		
		 
	 }
	 double getNumber(int index){
		if(index<this.size){
			return arr[index];
			//System.out.println(number+" is set");
		}
		else{
			System.out.println("index out of range");
			return -1;
		} 
	 }
	 void multiply(double number){
		 for(int i=0;i<size;i++){
			 this.arr[i]=this.arr[i]*number;
		 }
	 
	 }
	 
	 void multiply(Vector obj){
		if(this.size<=obj.size){
			for(int i=0;i<this.size;i++){
				this.arr[i]=obj.arr[i]*this.arr[i];
			}
		}
		else{
			
			for( int i=0;i<obj.size;i++){
				this.arr[i]=obj.arr[i]*this.arr[i];
			}
			for(int i=obj.size;i<this.size;i++){
				this.arr[i]=0;
			}
		}
	 }
	 void printVector(){
		 System.out.println("Vector is");
		 for( int i=0;i<this.size;i++){
				System.out.print(this.arr[i]+" ");
			}
	 }
}