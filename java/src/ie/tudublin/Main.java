package ie.tudublin;

public class Main
{

	public static void HelloProcessing()
	{
	 	String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
    }

	// public static void Loops()
	// {
	// 	String[] a = {"MAIN"};
    //     processing.core.PApplet.runSketch( a, new Loops());
    // }

	// public static void BugZap()
	// {
	// 	String[] a = {"MAIN"};
    //     processing.core.PApplet.runSketch( a, new BugZap());
    // }
	
	public static void main(String[] args)
	{
		Cat ginge = new Cat();
		ginge.setName("ginge");

		for(int i = 0; i <= 9; i++)
		{
			ginge.lives();
		}

		//loops();
	}
	
}