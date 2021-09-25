package geekster;

public class A_student {
	
	private String name;
	private int rollno;
	private String email;
	private long phno;
	
	public A_student(){
		this.name="Nauman";
		this.rollno=1;
		this.email="485naumanansari@gmail.com";
		this.phno=7408302486l;
		
	}
	public A_student(String name,int rollno,String email,long phno) {
		this.name=name;
		this.rollno=rollno;
		this.email=email;
		this.phno=phno;
	}
	
	public void show() {
		System.out.println("Name="+this.name);
		System.out.println("Roll NO="+this.rollno);
		System.out.println("Email="+this.email);
		System.out.println("Phone No.="+this.phno);
	}

}
