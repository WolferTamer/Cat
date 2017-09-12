import java.awt.Color;

public class Lion extends Cat
{
	private Color mane;
	
	Lion()
	{
		super("Bob", 14, "SB Zoo");
		mane = Color.YELLOW;
	}
	
	Lion(Color m, String n, int a, String o)
	{
		super(n,a,o);
		mane = m;
	}
	
	public Color getMane()
	{
		return mane;
	}
	
	public void setManeColor(Color c)
	{
		mane = c;
	}
	
	public void roar()
	{
		System.out.println(getName() + " just roared.");
	}
}