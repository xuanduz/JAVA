package view;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	static final int UNIT_SIZE = 20;
	static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
	static final int DELAY = 90;
	final int x[] = new int[GAME_UNITS];
	final int y[] = new int[GAME_UNITS];
	int bodyParts = 3;
	int applesEaten;
	int appleX, appleY;
	char direction = 'R';
	boolean running = false;
	Timer timer;
	Random random;
	
	
	public GamePanel() {
		random = new Random();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		// this.setBackground(Color.black);
		setBackground(new Color(119, 204, 146));
		setBackground(getBackground());;
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		startGame();
		
	}

	public void startGame() {
		newApple();
		direction = 'R';
		x[0] = y[0] = 0;
		running = true;
		timer = new Timer(DELAY, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}

	public void draw(Graphics g) {
		
		setVisible(true);

		if (running) {
			if ((bodyParts - 3) % 5 == 0 && applesEaten > 0) {
				g.setColor(Color.red);
				g.fillOval(appleX, appleY, 2 * UNIT_SIZE, 2 * UNIT_SIZE);
			} else {
				g.setColor(new Color(91, 176, 54));
				g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
			}

			for (int i = 0; i < bodyParts; i++) {
				if (i == 0) {
					g.setColor(new Color(0, 0, 0));
					g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
				} else {
					g.setColor(new Color(100, 100, 100));
					g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
				}
			}
			g.setColor(Color.red);
			g.setFont(new Font("SansSerif", Font.BOLD, 25));
			// FontMetrics metrics = getFontMetrics(g.getFont());
			g.drawString("Score: " + applesEaten, 5, g.getFont().getSize());
		} else {
			gameOver(g);
		}

	}

	public void newApple() {
		appleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE) - 1) * UNIT_SIZE ;
		appleY = random.nextInt((int) (SCREEN_HEIGHT / UNIT_SIZE) - 1) * UNIT_SIZE ;
		
	}

	public void move() {
		for (int i = bodyParts; i > 0; i--) {
			x[i] = x[i - 1];
			y[i] = y[i - 1];
		}
		switch (direction) {
		case 'U':
			y[0] = y[0] - UNIT_SIZE;
			break;
		case 'D':
			y[0] = y[0] + UNIT_SIZE;
			break;
		case 'R':
			x[0] = x[0] + UNIT_SIZE;
			break;
		case 'L':
			x[0] = x[0] - UNIT_SIZE;
			break;
		}

	}

	public void checkApple() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
//		if (countApples % 5 == 0) {
//			getSound("ting.wav");
//		}
		if ((bodyParts - 3) % 5 == 0 && applesEaten > 0) {
			if ((x[0] == appleX && y[0] == appleY) 
					|| (x[0] == appleX + UNIT_SIZE && y[0] == appleY + UNIT_SIZE)
					|| (x[0] == appleX && y[0] == appleY + UNIT_SIZE)
					|| (x[0] == appleX + UNIT_SIZE &&  y[0] == appleY )) {
				applesEaten += 5;
				bodyParts ++;
				newApple();
				getSound("ting.wav");
				
			}
		} else {
			if (x[0] == appleX && y[0] == appleY) {
				applesEaten++;
				bodyParts++;
				newApple();
			}
		}
	}

	public void checkCollisions() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
		// check if head collides with body
		for (int i = bodyParts; i > 0; i--) {
			if ((x[0] == x[i]) && (y[0] == y[i])) {
				running = false;
			}
		}

		// check if head touch left border
		if (x[0] < 0) {
			running = false;
		}
		// check if head touches right border
		if (x[0] > SCREEN_WIDTH) {
			running = false;
		}
		// check if head touches bottom border
		if (y[0] > SCREEN_HEIGHT) {
			running = false;
		}
		// check if head touches top border
		if (y[0] < 0) {
			running = false;
		}

		if (!running) {
			timer.stop();
			getSound("quach.wav");
		}
	}

	public static void getSound(String temp) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		File file = new File("E:\\Hoc_tap\\JAVA\\ProjectJava\\Snake\\src\\sound\\" + temp);
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		clip.start();
	}

	public void gameOver(Graphics g) {
		// gameover score
		g.setColor(new Color(238, 44, 44));
		g.setFont(new Font("SansSerif", Font.BOLD, 25));
		FontMetrics metrics1 = getFontMetrics(g.getFont());
		g.drawString("Your Score: " + applesEaten,
				(SCREEN_WIDTH - metrics1.stringWidth("Your Score: " + applesEaten)) / 2, SCREEN_HEIGHT / 2);
		// gameover text
		g.setColor(Color.red);
		g.setFont(new Font("SansSerif", Font.BOLD, 55));
		FontMetrics metrics2 = getFontMetrics(g.getFont());
		g.drawString("Game Over", (SCREEN_WIDTH - metrics2.stringWidth("Game Over")) / 2, SCREEN_HEIGHT / 3);
		// press Enter to restart
		g.setColor(Color.blue);
		g.setFont(new Font("SansSerif", Font.BOLD, 35));
		FontMetrics metrics3 = getFontMetrics(g.getFont());
		g.drawString("Press Enter to restart", (SCREEN_WIDTH - metrics3.stringWidth("Press Enter to restart")) / 2,
				2 * SCREEN_HEIGHT / 3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (running) {
			move();
			try {
				checkApple();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			try {
				checkCollisions();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		repaint();
	}

	public class MyKeyAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {

			if (running) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					if (direction != 'R') {
						direction = 'L';
					}
					break;
				case KeyEvent.VK_RIGHT:
					if (direction != 'L') {
						direction = 'R';
					}
					break;
				case KeyEvent.VK_UP:
					if (direction != 'D') {
						direction = 'U';
					}
					break;
				case KeyEvent.VK_DOWN:
					if (direction != 'U') {
						direction = 'D';
					}
					break;
				}

			}

			else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				applesEaten = 0;
				bodyParts = 3;
				startGame();
			}

		}

	}
}
