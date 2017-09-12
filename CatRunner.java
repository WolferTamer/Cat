import java.awt.Color;

public class CatRunner extends Lion
{
	public static void main(String[] args)
	{
		Cat blake = new Cat();
		blake.setName("Blake");
		blake.eat("cat food");
		
		Lion leo = new Lion();
		leo.setName("Leo");
		leo.setManeColor(Color.YELLOW);
		leo.roar();
	}
}