class Patient extends DBentity{
	int id;
	String name;
	
	public void insert(DBentity var){
		Patient obj=(Patient)var;
		System.out.println("inserting Patient witrh id="+"obj.id");
	}
	public void delete(int var){
		System.out.println("deleting patieng from database with id="+this.id);
		
	}
	public void update(DBentity var,int v){
		System.out.println("from update method of Patient class");
	}
	void setid(int id){
		this.id=id;
	}
	void setname(String s){
		this.name=new String(s);
		
	}
}