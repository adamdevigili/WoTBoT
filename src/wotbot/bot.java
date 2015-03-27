package wotbot;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Polygon;

import javax.imageio.ImageIO;

public class bot {

	static int[][] globalMap = new int[400][398];
	
	static Point[] allyLocations;
	static Point[] enemyLocations;
	
	public static void main(String[] args) throws AWTException, IOException {

		String currentMap;
		BufferedImage currentImage, mapPic, hpPic;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double screenWidth = screenSize.getWidth();
		double screenHeight = screenSize.getHeight();
		
		Robot r = new Robot();
		r.delay(2000);
		
		currentImage = r.createScreenCapture(new Rectangle(0, 0, (int)screenWidth, (int)screenHeight));
		//ImageIO.write(currentImage, "png", new File("full.png"));
		
		while(true)
		{
			
			if(System.currentTimeMillis() % 1000 == 0)
			{
				System.out.println("HELLO FROM GARAGEBOT");
				currentImage = r.createScreenCapture(new Rectangle(0, 0, (int)screenWidth, (int)screenHeight));
				//ImageIO.write(currentImage, "png", new File("currentImage.png"));
				
				int stateID = new Color(currentImage.getRGB(76, ((int)screenHeight - 147))).getRed();
				if(stateID > 200)	//IN BATTLE
				{
					BattleBot BB = new BattleBot();
					BB.start();
					try {
						System.out.println("THREAD TERMINATED");
						BB.join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				else if(stateID > 50)		//IN BATTLE QUEUE
				{
					System.out.println("IN GARAGE");
					
				}
				else if(stateID > 0)			//IN BATTLE
				{	
					System.out.println("IN QUEUE");
				}
			}
		}	
	}

	public static void himmelsdorf()
	{
		Polygon[] boundaries = new Polygon[23];
		boundaries[0] = new Polygon(new int[]{19, 19, 72, 72, 110, 110, 171, 171, 400, 400, 0, 0}, new int[]{398, 96, 96, 10, 10, 45, 45, 12, 12, 0, 0, 398}, 12);
		boundaries[1] = new Polygon(new int[]{73, 97, 97, 73}, new int[]{98, 98, 148, 148}, 4);
		boundaries[2] = new Polygon(new int[]{76, 92, 83, 80, 69, 69}, new int[]{151, 151, 186, 225, 225, 186}, 6);
		boundaries[3] = new Polygon(new int[]{0, 84, 95, 100, 148, 148, 0}, new int[]{235, 235, 275, 330, 366, 398, 398}, 7);
		boundaries[4] = new Polygon(new int[]{102, 146, 146, 102}, new int[]{267, 269, 347, 320}, 4);
		boundaries[5] = new Polygon(new int[]{152, 193, 193, 152}, new int[]{268, 268, 347, 347}, 4);
		boundaries[6] = new Polygon(new int[]{200, 272, 200}, new int[]{268, 268, 350}, 3);
		boundaries[7] = new Polygon(new int[]{274, 299, 299, 216, 216}, new int[]{292, 292, 390, 390, 346}, 5);
		boundaries[8] = new Polygon(new int[]{317, 317, 314, 308, 297, 285, 277, 281, 277, 278, 282, 288, 288, 306, 306, 400, 400}, new int[]{0, 23, 64, 95, 125, 151, 171, 183, 205, 230, 244, 260, 282, 282, 398, 398, 0}, 17);
		boundaries[9] = new Polygon(new int[]{0, 0, 170, 170, 188, 188, 400, 400}, new int[]{398, 395, 395, 380, 380, 395, 395, 398}, 8);
		boundaries[10] = new Polygon(new int[]{235, 311, 311, 238}, new int[]{20, 20, 58, 48}, 4);
		boundaries[11] = new Polygon(new int[]{255, 305, 295, 248}, new int[]{55, 66, 103, 94}, 4);
		boundaries[12] = new Polygon(new int[]{246, 290, 275, 242}, new int[]{100, 110, 155, 148}, 4);
		boundaries[13] = new Polygon(new int[]{195, 243, 230, 195}, new int[]{48, 54, 147, 142}, 4);
		boundaries[14] = new Polygon(new int[]{109, 187, 187, 109}, new int[]{48, 49, 141, 126}, 4);
		boundaries[15] = new Polygon(new int[]{182, 204, 204, 182}, new int[]{195, 195, 215, 215}, 4);
		boundaries[16] = new Polygon(new int[]{95, 110, 109, 190, 190, 100}, new int[]{226, 227, 245, 250, 260, 260}, 6);
		boundaries[17] = new Polygon(new int[]{95, 109, 110, 95}, new int[]{204, 205, 223, 223}, 4);
		boundaries[18] = new Polygon(new int[]{101, 112, 110, 96}, new int[]{173, 175, 198, 198}, 4);
		boundaries[19] = new Polygon(new int[]{109, 188, 187, 120, 117, 101}, new int[]{135, 150, 165, 155, 165, 162}, 6);
		boundaries[20] = new Polygon(new int[]{198, 273, 270, 260, 260, 197}, new int[]{151, 165, 190, 190, 176, 164}, 6);
		boundaries[21] = new Polygon(new int[]{257, 272, 271, 258}, new int[]{198, 196, 230, 230}, 4);
		boundaries[22] = new Polygon(new int[]{262, 275, 275, 200, 200, 263}, new int[]{236, 237, 258, 260, 246, 245}, 6);

		for(int x = 0; x < 400; x++)
		{
			for(int y = 0; y < 398; y++)
			{
				for(Polygon p: boundaries)
				{
					if(p.contains(x, y))
					{
						globalMap[x][y] = 6;
					}
					else
					{
						globalMap[x][y] = 0;
					}
				}
			}
		}
	}
	
	public static void winterHimmelsdorf()
	{
		Polygon[] boundaries = new Polygon[23];
		boundaries[0] = new Polygon(new int[]{19, 19, 72, 72, 110, 110, 171, 171, 400, 400, 0, 0}, new int[]{398, 96, 96, 10, 10, 45, 45, 12, 12, 0, 0, 398}, 12);
		boundaries[1] = new Polygon(new int[]{73, 97, 97, 73}, new int[]{98, 98, 148, 148}, 4);
		boundaries[2] = new Polygon(new int[]{76, 92, 83, 80, 69, 69}, new int[]{151, 151, 186, 225, 225, 186}, 6);
		boundaries[3] = new Polygon(new int[]{0, 84, 95, 100, 148, 148, 0}, new int[]{235, 235, 275, 330, 366, 398, 398}, 7);
		boundaries[4] = new Polygon(new int[]{102, 146, 146, 102}, new int[]{267, 269, 347, 320}, 4);
		boundaries[5] = new Polygon(new int[]{152, 193, 193, 152}, new int[]{268, 268, 347, 347}, 4);
		boundaries[6] = new Polygon(new int[]{200, 272, 200}, new int[]{268, 268, 350}, 3);
		boundaries[7] = new Polygon(new int[]{274, 299, 299, 216, 216}, new int[]{292, 292, 390, 390, 346}, 5);
		boundaries[8] = new Polygon(new int[]{317, 317, 314, 308, 297, 285, 277, 281, 277, 278, 282, 288, 288, 306, 306, 400, 400}, new int[]{0, 23, 64, 95, 125, 151, 171, 183, 205, 230, 244, 260, 282, 282, 398, 398, 0}, 17);
		boundaries[9] = new Polygon(new int[]{0, 0, 170, 170, 188, 188, 400, 400}, new int[]{398, 395, 395, 380, 380, 395, 395, 398}, 8);
		boundaries[10] = new Polygon(new int[]{235, 311, 311, 238}, new int[]{20, 20, 58, 48}, 4);
		boundaries[11] = new Polygon(new int[]{255, 305, 295, 248}, new int[]{55, 66, 103, 94}, 4);
		boundaries[12] = new Polygon(new int[]{246, 290, 275, 242}, new int[]{100, 110, 155, 148}, 4);
		boundaries[13] = new Polygon(new int[]{195, 243, 230, 195}, new int[]{48, 54, 147, 142}, 4);
		boundaries[14] = new Polygon(new int[]{109, 187, 187, 109}, new int[]{48, 49, 141, 126}, 4);
		boundaries[15] = new Polygon(new int[]{182, 204, 204, 182}, new int[]{195, 195, 215, 215}, 4);
		boundaries[16] = new Polygon(new int[]{95, 110, 109, 190, 190, 100}, new int[]{226, 227, 245, 250, 260, 260}, 6);
		boundaries[17] = new Polygon(new int[]{95, 109, 110, 95}, new int[]{204, 205, 223, 223}, 4);
		boundaries[18] = new Polygon(new int[]{101, 112, 110, 96}, new int[]{173, 175, 198, 198}, 4);
		boundaries[19] = new Polygon(new int[]{109, 188, 187, 120, 117, 101}, new int[]{135, 150, 165, 155, 165, 162}, 6);
		boundaries[20] = new Polygon(new int[]{198, 273, 270, 260, 260, 197}, new int[]{151, 165, 190, 190, 176, 164}, 6);
		boundaries[21] = new Polygon(new int[]{257, 272, 271, 258}, new int[]{198, 196, 230, 230}, 4);
		boundaries[22] = new Polygon(new int[]{262, 275, 275, 200, 200, 263}, new int[]{236, 237, 258, 260, 246, 245}, 6);

		for(int x = 0; x < 400; x++)
		{
			for(int y = 0; y < 398; y++)
			{
				for(Polygon p: boundaries)
				{
					if(p.contains(x, y))
					{
						globalMap[x][y] = 6;
					}
					else
					{
						globalMap[x][y] = 0;
					}
				}
			}
		}
	}
	
	public static void mines()
	{
		Polygon[] boundaries = new Polygon[11];
		boundaries[0] = new Polygon(new int[]{0, 50, 70, 67, 0}, new int[]{265, 255, 205, 140, 82}, 5);
		boundaries[1] = new Polygon(new int[]{0, 75, 95, 75, 120, 156, 182, 185, 0}, new int[]{82, 96, 77, 23, 30, 43, 18, 0, 0}, 9);
		boundaries[2] = new Polygon(new int[]{241, 241, 169, 153, 185, 296, 310, 310, 400, 400}, new int[]{0, 96, 156, 196, 245, 282, 363, 398, 398, 0}, 10);
		boundaries[3] = new Polygon(new int[]{60, 60, 97, 156, 175, 180, 180}, new int[]{398, 376, 376, 330, 337, 375, 398}, 7);
		boundaries[4] = new Polygon(new int[]{91, 91, 105, 105}, new int[]{92, 110, 110, 92}, 4);
		boundaries[5] = new Polygon(new int[]{7, 19, 70, 55}, new int[]{293, 327, 314, 283}, 4);
		boundaries[6] = new Polygon(new int[]{95, 114, 125, 119, 88}, new int[]{330, 340, 325, 295, 295}, 5);
		boundaries[7] = new Polygon(new int[]{214, 265, 263}, new int[]{340, 340, 300}, 3);
		boundaries[8] = new Polygon(new int[]{145, 158, 137, 141, 158, 133, 96, 96, 116}, new int[]{275, 260, 217, 163, 112, 105, 164, 190, 254}, 9);
		boundaries[9] = new Polygon(new int[]{190, 186, 201, 202}, new int[]{302, 312, 320, 308}, 4);
		boundaries[10] = new Polygon(new int[]{213, 225, 220, 210}, new int[]{312, 310, 295, 297}, 4);
		
		for(int x = 0; x < 400; x++)
		{
			for(int y = 0; y < 398; y++)
			{
				for(Polygon p: boundaries)
				{
					if(p.contains(x, y))
					{
						globalMap[x][y] = 6;
					}
					else
					{
						globalMap[x][y] = 0;
					}
				}
			}
		}
	}
	
	public static void province()
	{
		Polygon[] boundaries = new Polygon[18];
		boundaries[0] = new Polygon(new int[]{0, 216, 212, 150, 53, 32, 128, 143, 128, 158, 125, 147, 80, 0}, new int[]{398, 398, 387, 367, 382, 325, 327, 314, 274, 236, 186, 67, 0, 0}, 14);
		boundaries[1] = new Polygon(new int[]{263, 223, 237, 273, 276, 243, 264, 275, 294, 350, 340, 237, 401, 401, 401}, new int[]{398, 313, 290, 268, 217, 182, 159, 97, 70, 75, 20, 0, 0, 398}, 14);
		boundaries[2] = new Polygon(new int[]{147, 154, 148, 140}, new int[]{341, 338, 326, 330}, 4);
		boundaries[3] = new Polygon(new int[]{143, 154, 151, 139}, new int[]{290, 288, 275, 278}, 4);
		boundaries[4] = new Polygon(new int[]{174, 185, 183, 173}, new int[]{277, 275, 262, 263}, 4);
		boundaries[5] = new Polygon(new int[]{195, 196, 207, 206}, new int[]{283, 295, 292, 282}, 4);
		boundaries[6] = new Polygon(new int[]{211, 222, 222, 211}, new int[]{272, 272, 258, 258}, 4);
		boundaries[7] = new Polygon(new int[]{228, 241, 241, 229}, new int[]{267, 267, 255, 255}, 4);
		boundaries[8] = new Polygon(new int[]{254, 267, 266, 252}, new int[]{266, 265, 253, 255}, 4);
		boundaries[9] = new Polygon(new int[]{153, 146, 155, 162}, new int[]{135, 144, 151, 139}, 4);
		boundaries[10] = new Polygon(new int[]{173, 187, 183, 170}, new int[]{138, 135, 123, 128}, 4);
		boundaries[11] = new Polygon(new int[]{195, 208, 210, 195}, new int[]{134, 134, 123, 123}, 4);
		boundaries[12] = new Polygon(new int[]{224, 238, 237, 223}, new int[]{131, 130, 118, 118}, 4);
		boundaries[13] = new Polygon(new int[]{250, 262, 260, 247}, new int[]{130, 125, 115, 118}, 4);
		boundaries[14] = new Polygon(new int[]{220, 232, 232, 221}, new int[]{107, 110, 93, 95}, 4);
		boundaries[15] = new Polygon(new int[]{240, 255, 255, 240}, new int[]{92, 92, 80, 80}, 4);
		boundaries[16] = new Polygon(new int[]{257, 268, 273, 263}, new int[]{73, 80 ,60, 63}, 4);
		boundaries[17] = new Polygon(new int[]{250, 250, 262, 262}, new int[]{56, 43, 43, 56}, 4);
		
		for(int x = 0; x < 400; x++)
		{
			for(int y = 0; y < 398; y++)
			{
				for(Polygon p: boundaries)
				{
					if(p.contains(x, y))
					{
						globalMap[x][y] = 6;
					}
					else
					{
						globalMap[x][y] = 0;
					}
				}
			}
		}
	}
	
	public static void malinovka()
	{
		Polygon[] boundaries = new Polygon[13];
		boundaries[0] = new Polygon(new int[]{0, 0, 55, 80, 41}, new int[]{0, 50, 83, 51, 0}, 5);
		boundaries[1] = new Polygon(new int[]{260, 401, 401}, new int[]{0, 125, 0}, 3);
		boundaries[2] = new Polygon(new int[]{72, 270, 300, 270, 286, 225, 167, 102}, new int[]{120, 312, 275, 225, 180, 110, 127, 102}, 8);
		boundaries[3] = new Polygon(new int[]{0, 0, 155, 105, 86}, new int[]{278, 398, 398, 375, 330}, 5);
		boundaries[4] = new Polygon(new int[]{240, 295, 325, 260}, new int[]{70, 145, 110, 50}, 4);
		boundaries[5] = new Polygon(new int[]{272, 280, 311, 350, 350, 320}, new int[]{330, 350, 360, 353, 325, 300}, 6);
		boundaries[6] = new Polygon(new int[]{200, 212, 228, 212}, new int[]{40, 52, 40, 30}, 4);
		boundaries[7] = new Polygon(new int[]{205, 205, 213, 212}, new int[]{382, 385, 385, 382}, 4);
		boundaries[8] = new Polygon(new int[]{240, 245, 275, 265}, new int[]{375, 387, 375, 360}, 4);
		boundaries[9] = new Polygon(new int[]{125, 135, 165, 160}, new int[]{350, 360, 335, 325}, 4);
		boundaries[10] = new Polygon(new int[]{185, 190, 210, 200}, new int[]{315, 320, 310, 305}, 4);
		boundaries[11] = new Polygon(new int[]{70, 77, 115, 105}, new int[]{235, 240, 205, 200}, 4);
		boundaries[12] = new Polygon(new int[]{40, 45, 65, 60}, new int[]{270, 280, 255, 250}, 4); 
		
		for(int x = 0; x < 400; x++)
		{
			for(int y = 0; y < 398; y++)
			{
				for(Polygon p: boundaries)
				{
					if(p.contains(x, y))
					{
						globalMap[x][y] = 6;
					}
					else
					{
						globalMap[x][y] = 0;
					}
				}
			}
		}
	}
	
	
}
