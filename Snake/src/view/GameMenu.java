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
	public JMenuItem ngameMenu = new JMenuItem("New Game");
	private JMenuItem exitMenu = new JMenuItem("Exit");
	private JMenuItem easyMenu = new JMenuItem("Easy");
	private JMenuItem mediumMenu = new JMenuItem("Medium");
	private JMenuItem hardMenu = new JMenuItem("Hard");
	private JMenuItem aboutMenu = new JMenuItem("About");
	
	public GameMenu(GameFrame frame) {

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
	    KeyStroke escapeKeyStroke = KeyStroke.getKeyStroke("Control N");
		ngameMenu.setAccelerator(escapeKeyStroke);
		
	    easyMenu.setMnemonic(KeyEvent.VK_M);

	    
	    mediumMenu.setMnemonic(KeyEvent.VK_M);


	    hardMenu.setMnemonic(KeyEvent.VK_M);

	    
	    aboutMenu.setMnemonic(KeyEvent.VK_M);

	    
	    fileMenu.add(ngameMenu);
	    fileMenu.addSeparator();
	    fileMenu.add(exitMenu);
	    
	    levelMenu.add(easyMenu);
	    levelMenu.addSeparator();
	    levelMenu.add(mediumMenu);
	    levelMenu.addSeparator();
	    levelMenu.add(hardMenu);
	    
	    helpMenu.add(aboutMenu);
	    
	    this.add(fileMenu);
	    this.add(levelMenu);
	    this.add(helpMenu);
	}

	
	public JMenuItem getNgameMenu() {
		return ngameMenu;
	}


	public void setNgameMenu(JMenuItem ngameMenu) {
		this.ngameMenu = ngameMenu;
	}


	public JMenuItem getExitMenu() {
		return exitMenu;
	}


	public void setExitMenu(JMenuItem exitMenu) {
		this.exitMenu = exitMenu;
	}


	public JMenuItem getEasyMenu() {
		return easyMenu;
	}


	public void setEasyMenu(JMenuItem easyMenu) {
		this.easyMenu = easyMenu;
	}


	public JMenuItem getMediumMenu() {
		return mediumMenu;
	}


	public void setMediumMenu(JMenuItem mediumMenu) {
		this.mediumMenu = mediumMenu;
	}


	public JMenuItem getHardMenu() {
		return hardMenu;
	}


	public void setHardMenu(JMenuItem hardMenu) {
		this.hardMenu = hardMenu;
	}


	public JMenuItem getAboutMenu() {
		return aboutMenu;
	}


	public void setAboutMenu(JMenuItem aboutMenu) {
		this.aboutMenu = aboutMenu;
	}

}
