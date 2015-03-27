package wotbot;

public class KeyTranslation {

	public String nextMove(int[][] globalMap, int botXPosF, int botYPosF,	int[] nextMovesX,
			int[] nextMovesY, String orientation)
	{
		for (int i = 0; i < nextMovesX.length; i++)
		{
			if(orientation == "N")
			{
				if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "N")
				{
					return "W";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "S")
				{
					return "S";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "E")
				{
					return "D";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "W")
				{
					return "A";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "NE")
				{
					return "WD";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "NW")
				{
					return "WA";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "SE")
				{
					return "SD";
				}
				else
				{
					return "SA";
				}
			}
			else if(orientation == "S")
			{
				if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "N")
				{
					return "S";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "S")
				{
					return "W";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "E")
				{
					return "A";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "W")
				{
					return "D";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "NE")
				{
					return "SA";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "NW")
				{
					return "SD";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "SE")
				{
					return "WA";
				}
				else
				{
					return "WD";
				}
			}
			
			else if(orientation == "E")
			{
				if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "N")
				{
					return "A";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "S")
				{
					return "D";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "E")
				{
					return "W";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "W")
				{
					return "S";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "NE")
				{
					return "WA";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "NW")
				{
					return "SA";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "SW")
				{
					return "SD";
				}
				else
				{
					return "WD";
				}
			}
			
			else if (orientation == "W")
			{
				if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "N")
				{
					return "D";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "S")
				{
					return "A";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "E")
				{
					return "S";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "W")
				{
					return "W";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "NE")
				{
					return "SD";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "NW")
				{
					return "WD";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "SE")
				{
					return "SA";
				}
				else
				{
					return "WA";
				}
			}
			
			else if(orientation == "NE")
			{
				if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "N")
				{
					return "WA";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "S")
				{
					return "SD";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "E")
				{
					return "WD";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "W")
				{
					return "SA";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "NE")
				{
					return "W";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "NW")
				{
					return "S";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "SE")
				{
					return "D";
				}
				else
				{
					return "S";
				}
			}
			
			else if(orientation == "NW")
			{
				if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "N")
				{
					return "WD";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "S")
				{
					return "SA";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "E")
				{
					return "SD";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "W")
				{
					return "WA";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "NE")
				{
					return "D";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "NW")
				{
					return "W";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "SE")
				{
					return "S";
				}
				else
				{
					return "A";
				}
			}
			
			else if(orientation == "SE")
			{
				if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "N")
				{
					return "SA";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "S")
				{
					return "WD";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "E")
				{
					return "WA";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "W")
				{
					return "SD";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "NE")
				{
					return "A";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "NW")
				{
					return "S";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "SE")
				{
					return "W";
				}
				else
				{
					return "D";
				}
			}
			
			else
			{
				if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "N")
				{
					return "SD";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "S")
				{
					return "WA";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "E")
				{
					return "SA";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "W")
				{
					return "WD";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "NE")
				{
					return "S";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "NW")
				{
					return "D";
				}
				else if(desiredHeading(botXPosF, botYPosF, nextMovesX[i], nextMovesY[i]) == "SE")
				{
					return "A";
				}
				else
				{
					return "W";
				}
			}
		}
		return orientation;
	}
	
	/**
	 * Gets orientation of bot based on the two pixels taken from the global map.
	 * Returns a string of heading
	 */
	
	public String currentOrientation(int botXPosF, int botYPosF, int botXPosB, int botYPosB)
	{
		if(botXPosF > botXPosB)
		{
			return "E";
		}
		else if(botXPosF < botXPosB)
		{
			return "W";
		}
		else if(botYPosF > botYPosB)
		{
			return "S";
		}
		else if(botYPosF < botYPosB)
		{
			return "N";
		}
		else if(botYPosF < botYPosB && botXPosF > botXPosB)
		{
			return "NE";
		}
		else if(botYPosF < botYPosB && botXPosF < botXPosB)
		{
			return "NW";
		}
		else if(botYPosF > botYPosB && botXPosF > botXPosB)
		{
			return "SE";
		}
		else
		{
			return "SW";
		}
	}
	
	public String desiredHeading(int botXPosF, int botYPosF, int XPos, int YPos)
	{
		if(botXPosF > XPos)
		{
			return "E";
		}
		else if(botXPosF < XPos)
		{
			return "W";
		}
		else if(botYPosF > YPos)
		{
			return "S";
		}
		else if(botYPosF < YPos)
		{
			return "N";
		}
		else if(botYPosF < YPos && botXPosF > XPos)
		{
			return "NE";
		}
		else if(botYPosF < YPos && botXPosF < XPos)
		{
			return "NW";
		}
		else if(botYPosF > YPos && botXPosF > XPos)
		{
			return "SE";
		}
		else
		{
			return "SW";
		}
	}
}
