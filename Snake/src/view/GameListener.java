package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameListener implements ActionListener {
	private GameFrame gFrame;
	private GamePanel gPanel;
	private boolean isStart = false;
	
	public GameListener(GameFrame gFrame) {
		this.gFrame = gFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmdLine = e.getActionCommand();
		if ("New Game".equals(cmdLine)) {
			
//			this.gFrame.gameMenu.setEnabledMenu(true);
		}
		if ("Exit".equals(cmdLine)) {
			
		}
		
	}
}
