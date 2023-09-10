class Main{
public static void main(String []args){
	String s=new String("doctor");
doctor d=(doctor)DBentity.factoryMethod(s);
d.setId(1);
d.setFloor(0);
d.setName("Aakash kumar");
d.setChamber("A0001");
d.insert(d);
Staff S=new Staff();
S.alter();
}
}