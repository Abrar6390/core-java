package com.array;
class salman{
	private int id;
	private String name;
	private String college;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public salman(int id, String name, String college) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
	}
	public salman() {
		super();
		// TODO Auto-generated constructor stub
	}
	void show() {
		System.out.println(id+" "+name+" "+college);
	}
	
	
}
public class Abrar {

	public static void main(String[] args) {
		salman s = new salman();
		s.setId(1);
		s.setName("salman");
		s.setCollege("smbc");
		System.err.println(s.getId()+":"+s.getName()+":"+s.getCollege());

	}

}
