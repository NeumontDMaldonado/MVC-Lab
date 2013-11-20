package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Tabs extends JPanel
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTabbedPane tabs;
	private static JPanel main, setup, gamePlay;
	private JTextField number, guess;
	private JLabel label;
	Game game = new Game();

	public Tabs()
	{
		main = new JPanel();
		main.setLayout(new BorderLayout());
		createTabs();

		tabs = new JTabbedPane();
		tabs.add("Setup",number);
		tabs.addTab("Game",label);
		main.add(tabs, BorderLayout.CENTER);
		add(main);
		setVisible(true);
	}

	public void createTabs()
	{
		setup();
		gamePlay();
	}

	public void setup()
	{
		setup = new JPanel();
		number = new JTextField();
		number.addActionListener(new NumListener());
		setup.add(number);

	}

	public void gamePlay()
	{
		gamePlay = new JPanel();
		guess = new JTextField();
		guess.addActionListener(new GuessListener());
		label = new JLabel();
		gamePlay.add(guess);
		gamePlay.add(label);
	}

	private class GuessListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String g = guess.getText();
			game.guessNum = Integer.parseInt(g);
			game.guess();
			label.setText(Integer.toString(game.resultNum));
		}

	}

	private class NumListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			String num = number.getText();
			game.inputNum = Integer.parseInt(num);
		}

	}
}
