package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.*;
import java.awt.*;
public class GameMenu extends JMenuBar {
	
	private JMenuItem gameMenu = new JMenuItem("New Game");
	private JMenuItem exitMenu = new JMenuItem("Exit");
	private JMenuItem easyMenu = new JMenuItem("Easy");
	private JMenuItem mediumMenu = new JMenuItem("Medium");
	private JMenuItem hardMenu = new JMenuItem("Hard");
	private JMenuItem aboutMenu = new JMenuItem("About");

	
	public GameMenu() {
		super();
		final JMenuBar menuBar = new JMenuBar();
		GameFrame mainFrame = new GameFrame();
		
		// creat menu
		JMenu fileMenu = new JMenu("File");
		JMenu levelMenu = new JMenu("Level");
		JMenu helpMenu = new JMenu("Help");
		
		// tao cac item
		
		gameMenu.setMnemonic(KeyEvent.VK_N);
	    gameMenu.setActionCommand("New Game");
	    
	    exitMenu.setMnemonic(KeyEvent.VK_ESCAPE);
	    exitMenu.setActionCommand("Exit");
		
	    easyMenu.setMnemonic(KeyEvent.VK_M);
	    easyMenu.setActionCommand("Easy");
	    
	    mediumMenu.setMnemonic(KeyEvent.VK_M);
	    mediumMenu.setActionCommand("Easy");

	    hardMenu.setMnemonic(KeyEvent.VK_M);
	    hardMenu.setActionCommand("Easy");
	    
	    aboutMenu.setMnemonic(KeyEvent.VK_M);
	    aboutMenu.setActionCommand("About");
	    
	    fileMenu.add(gameMenu);
	    fileMenu.add(exitMenu);
	    
	    levelMenu.add(easyMenu);
	    levelMenu.add(mediumMenu);
	    levelMenu.add(hardMenu);
	    
	    helpMenu.add(aboutMenu);

	    mainFrame.setJMenuBar(menuBar);
	    mainFrame.setVisible(true);
//		fileMenu.setMnemonic(KeyEvent.VK_F);
//		levelMenu.setMnemonic(KeyEvent.VK_A);
//		helpMenu.setMnemonic(KeyEvent.VK_H);
//		
//		gameMenu.setMnemonic(KeyEvent.VK_O);
//		KeyStroke ctrlOKeyStroke = KeyStroke.getKeyStroke("control O");
//		gameMenu.setAccelerator(ctrlOKeyStroke);
//		
//		exitMenu.setMnemonic(KeyEvent.VK_ESCAPE);
//		KeyStroke EscapeKeyStroke = KeyStroke.getKeyStroke("ESCAPE");
//		exitMenu.setAccelerator(EscapeKeyStroke);
//
//		aboutMenu.setMnemonic(KeyEvent.VK_A);
//		KeyStroke ctrlAKeyStroke = KeyStroke.getKeyStroke("control A");
//		aboutMenu.setAccelerator(ctrlAKeyStroke);
		
//		fileMenu.add(gameMenu);
//		fileMenu.addSeparator();
//		fileMenu.add(exitMenu);
		

		
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
	
	
}
