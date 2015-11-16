public class Game {
	

	private int score;
	private int[] rollScore=new int[21]; // Total number of possible rolls are 20. Hence creating the array size of 20
	private int currentRoll=0;

	public void Roll(int pins)
	{
		rollScore[currentRoll++]=pins;     // saving the score of each roll.		
		
	}

	public int Score()
	{
		int score=0,FrameIndex=0;
		
		for (int frame=0;frame<10;frame++)
		{
			if(rollScore[FrameIndex]==10)                             //  if Strike
			{
				score+=10+StrikeBonus(FrameIndex);  // Adding Strike bonus
				FrameIndex++;
			}
			else if(rollScore[FrameIndex]+rollScore[FrameIndex+1]==10)   // if Spare
			{
					score+=10+SpareBonus(FrameIndex);           // Add Spare bonus to Score
					FrameIndex+=2;
			}
			else
			{
				score+= rollScore[FrameIndex]+rollScore[FrameIndex+1];  // Overall Score.
				FrameIndex+=2;
			}			
			System.out.print(score);
			System.out.print("       ");
		}
		System.out.println("     ");
		System.out.println("overall Score :"+score);
		return score;
	}

	
	// Spare Bonus
	private int SpareBonus(int FrameIndex)
	{
		
		return rollScore[FrameIndex+2];
		
	}
	// Strike Bonus
	private int StrikeBonus(int FrameIndex)
	{
		return rollScore[FrameIndex+1]+rollScore[FrameIndex+2];
		
	}
	
}
