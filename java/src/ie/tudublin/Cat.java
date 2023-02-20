package ie.tudublin;

public class Cat
{
	String name;
	private int numlives = 9;

	public void setName(String name)
	{
		this.name = name;
	}
	
	public void speak()
	{
		System.out.println("Woof");
	}

	public void lives()
	{
		if(numlives > 0)
		{
			System.out.println("Ouch");
			numlives--;
		}else
		{
			System.out.println("Dead");
			
		}
	}
	
}