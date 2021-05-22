package view;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	GameMenu menu;
	GamePanel panel;
	GameFrame frame;
	
	public GameFrame() {
		this.setJMenuBar(new GameMenu(frame));
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
	public GamePanel getGame() {
		return panel;
	}
	
	public void setGame(GamePanel panel) {
		this.panel = panel;
	}
	
}
