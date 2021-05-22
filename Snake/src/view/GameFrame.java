package view;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	GameMenu gameMenu;
	GameListener listener;
	
	public GameFrame() {
		this.gameMenu = new GameMenu(listener);
		this.setJMenuBar(gameMenu);
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
}
