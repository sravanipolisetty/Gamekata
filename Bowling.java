// Version 1.00
// Version 1.01 PSR 18-Mar-2017
// Version 1.02 GM 19-Mar-2017 


// testing  // V1.01 
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

//public class Bowling  // V1.02
private class Bowling // V 1.02 
{
	private Game game=new Game();
	@Test
	public void RollBoll() throws Exception
	{
		int Throws=10,pins;
		Random r1= new Random();			
		for (int i=0;i<Throws;i++)
		{
			pins=0;
			//System.out.println("Throw"+i);
			for (int j=0;j<2;j++)                       // Each throw has 2 sub chances to roll a ball
			{
				if (j==0)
				{ 
					pins=r1.nextInt(11);                  //  number of pins hit during the first roll
					System.out.print(pins);
					game.Roll(pins);
				}
				else
				{
					if(pins!=10)
					{
						pins=r1.nextInt(10-pins);            // number of pins to hit : pins remained after first roll
						System.out.print(pins);
					}
					else
					{
						System.out.print("0");
					}
									
					game.Roll(pins);
				}
				System.out.print("   ");
				
			}
			//assertEquals(10,game.Score());
		}
		System.out.println(" ");
		System.out.println(" ");
		
		assertEquals(0,game.Score());
	}
	
	
}
