package runtimepoly;

public class Subchild extends Parent
{
	void fun()
	{
		System.out.println("in subchild");
	}
	
	public static void main(String args[])
	{
		Parent p;
		p=new Child();
		p.fun();
		p=new Subchild();
		p.fun();
		}
}
