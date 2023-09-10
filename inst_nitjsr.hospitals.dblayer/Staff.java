class Staff extends DBentity{
	int id;
	String name;
	public void insert(DBentity var){
		Staff obj=(Staff)var;
		System.out.println("Inserting staff with id="+obj.id+" in database");
	}
	public void delete(int var){
		System.out.println("deleting satff with id="+var);
	}
	public void update(DBentity var,int v){
		Staff obj=(Staff)var;
		System.out.println("Modifying  Doctor with id="+obj.id+" in database");
	}
	void setid(int id){
		this.id=id;
	}
	void setname(String s){
		this.name=new String(s);
		
	}
}