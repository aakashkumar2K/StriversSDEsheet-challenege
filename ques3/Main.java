class Main{
public static void main(String []args){
Employee e=Employee.getEmployee("Developer");
e.insert();
e.delete();
e=Employee.getEmployee("Manager");
e.insert();
e.delete();
//System.out.println("Total employee"+Employee.count);
}
}