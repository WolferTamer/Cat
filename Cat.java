public class Cat
{
	private String name;
	private int age;
	private String owner;
	
	public Cat()
	{
		name = "Mittens";
		age = 4;
		owner = "John";
	}
	
	public Cat(String n, int a, String o)
	{
		name = n;
		age = a;
		owner = o;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getOwner()
	{
		return owner;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public void setOwner(String o)
	{
		owner = o;
	}
	
	public void eat(String food)
	{
		System.out.println(name + " just ate " + food + ".");
	}
}