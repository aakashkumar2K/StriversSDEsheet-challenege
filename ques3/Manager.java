class Manager extends Employee{
    Manager(String name,int id,String office){
       super(name,id,office);
    this.designation="Manager";
}
void insert(){
	System.out.println("data inserted in Manager database");
    }
	void delete(){
		System.out.println("data deleted in Manager database");
	}
}