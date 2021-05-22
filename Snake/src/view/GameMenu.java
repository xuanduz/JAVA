package view;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class GameMenu extends JMenuBar {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuItem ngameMenu = new JMenuItem("New Game");
	private JMenuItem exitMenu = new JMenuItem("Exit");
	private JMenuItem easyMenu = new JMenuItem("Easy");
	private JMenuItem mediumMenu = new JMenuItem("Medium");
	private JMenuItem hardMenu = new JMenuItem("Hard");
	private JMenuItem aboutMenu = new JMenuItem("About");

	
	public GameMenu(GameListener listener) {

		super();
		
		// create menu
		JMenu fileMenu = new JMenu("File");
		JMenu levelMenu = new JMenu("Level");
		JMenu helpMenu = new JMenu("Help");
		
		// create items
		
		ngameMenu.setMnemonic(KeyEvent.VK_N);
		KeyStroke ctrNKeyStroke = KeyStroke.getKeyStroke("Control N");
		ngameMenu.setAccelerator(ctrNKeyStroke);
	    
	    exitMenu.setMnemonic(KeyEvent.VK_ESCAPE);

		
	    easyMenu.setMnemonic(KeyEvent.VK_M);

	    
	    mediumMenu.setMnemonic(KeyEvent.VK_M);


	    hardMenu.setMnemonic(KeyEvent.VK_M);

	    
	    aboutMenu.setMnemonic(KeyEvent.VK_M);

	    
	    fileMenu.add(ngameMenu);
	    fileMenu.add(exitMenu);
	    
	    levelMenu.add(easyMenu);
	    levelMenu.add(mediumMenu);
	    levelMenu.add(hardMenu);
	    
	    helpMenu.add(aboutMenu);
	    this.add(fileMenu);
	    this.add(levelMenu);
	    this.add(helpMenu);
	    
	    this.ngameMenu.addActionListener(listener);
	    
//	    this.setEnabledMenu(false);

		

		
//		fileMenu.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				game.startGame();
//			}
//		});
		
		
//		
//		levelMenu.add(easyMenu);
//		levelMenu.add(mediumMenu);
//		levelMenu.add(hardMenu);
//		
//		helpMenu.add(aboutMenu);
//		
//		this.add(fileMenu);
//		this.add(levelMenu);
//		this.add(helpMenu);
	}


//	void setEnabledMenu(boolean status) {
//		this.ngameMenu.setEnabled(status);
//		
//	}

	
}
