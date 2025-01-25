package RoughPageForPractice;

public class Test {
	//Overloaded method
	
	public void methodOne(Integer i)
	{
	System.out.println("Integer version");
	}
	public void methodOne(Character c)
	{
	System.out.println("Character version");
	}
	public static void main(String[] args)
	{
	Test t= new Test();
	t.methodOne('a');
	}
}
