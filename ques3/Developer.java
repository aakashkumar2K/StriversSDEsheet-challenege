class Developer extends Employee{
    Developer(String name,int id,String office)
	{
       super(name,id,office);
    this.designation="Developer";
	}
	void insert(){
	System.out.println("data inserted in deevloper database");
    }
	void delete(){
		System.out.println("data deleted in devloper database");
	}
}