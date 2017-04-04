package oops;

public class classB extends classA {
	
public void add (){	

System.out.println("this is add method"); 

	
}
	public static void main(String[] args) {
		
	classB b=new classB();
	
	b.a=100;
	System.out.println(b.a);
	
	b.name="nithi";
	System.out.println(b.name);
	b.display();
	b.add();
	
	
	
	
	
	

	}

}
