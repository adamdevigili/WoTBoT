package wotbot;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class nextMove {
	
	public void nextMove(String nextKeys, Robot r)
	{
		
		try
		{
			if (nextKeys == "W")
			{
				r.keyPress(KeyEvent.VK_W);
				Thread.sleep(1500);
				r.keyRelease(KeyEvent.VK_W);
			}
			else if(nextKeys == "A")
			{
				r.keyPress(KeyEvent.VK_A);
				Thread.sleep(1000);
				r.keyRelease(KeyEvent.VK_A);
			}
			else if(nextKeys == "D")
			{
				r.keyPress(KeyEvent.VK_D);
				Thread.sleep(1000);
				r.keyRelease(KeyEvent.VK_D);
			}
			else if(nextKeys == "S")
			{
				r.keyPress(KeyEvent.VK_S);
				Thread.sleep(1500);
				r.keyRelease(KeyEvent.VK_S);
			}
			else if(nextKeys == "WA")
			{
				r.keyPress(KeyEvent.VK_W);
				r.keyPress(KeyEvent.VK_A);
				Thread.sleep(1500);
				r.keyRelease(KeyEvent.VK_W);
				r.keyRelease(KeyEvent.VK_A);
			}
			else if(nextKeys == "WD")
			{
				r.keyPress(KeyEvent.VK_W);
				r.keyPress(KeyEvent.VK_D);
				Thread.sleep(1500);
				r.keyRelease(KeyEvent.VK_W);
				r.keyRelease(KeyEvent.VK_D);
			}
			else if(nextKeys == "SA")
			{
				r.keyPress(KeyEvent.VK_S);
				r.keyPress(KeyEvent.VK_D);
				Thread.sleep(1500);
				r.keyRelease(KeyEvent.VK_S);
				r.keyRelease(KeyEvent.VK_D);
			}
			else
			{
				r.keyPress(KeyEvent.VK_S);
				r.keyPress(KeyEvent.VK_A);
				Thread.sleep(1500);
				r.keyRelease(KeyEvent.VK_S);
				r.keyRelease(KeyEvent.VK_A);
			}
		}
		catch(InterruptedException e)
		{}
	}
}
