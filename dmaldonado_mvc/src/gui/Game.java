package gui;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Game implements PropertyChangeListener
{
	int inputNum, guessNum, resultNum;
	
	public int guess()
	{
		if (inputNum > guessNum)
		{
			resultNum = 1;
		}
		else if (inputNum == guessNum)
		{
			resultNum = 0;
		}
		else
		{
			resultNum = -1;
		}
		
		return resultNum;
	}

	@Override
	public void propertyChange(PropertyChangeEvent arg0) 
	{
			
	}
}
