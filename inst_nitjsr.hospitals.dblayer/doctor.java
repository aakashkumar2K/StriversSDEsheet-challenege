class doctor extends DBentity{
	int id;
	String chamber_no;
	int floor;
	String name;
	public void insert(DBentity var){
		doctor obj=(doctor)var;
		System.out.println("inserting doctor with id = "+obj.id+" in database");
	}
	public void delete(int var){
		System.out.println("deleting doctor from database with id="+this.id);
	}
	public void update(DBentity var,int v){
		doctor obj=(doctor)var;
		System.out.println("updating doctor with id ="+obj.id+" in database");
	}
	void setId(int id){
		this.id=id;
		
	}
	void setName(String s){
		this.name=new String(s);
		
	}
	void setFloor(int x){
		this.floor=floor;
		
	}
	void setChamber(String chamber_no){
		
		this.chamber_no=new String(chamber_no);
	}
}