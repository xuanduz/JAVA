

public class Node {
	/*
	 * attributes
	 */
	int x;
	int y;
	int value;

	/*
	 * Method - Constructors
	 */
	public Node() {
		this.x = 0;
		this.y = 0;
		this.value = 0;
	}

	public Node(int x, int y, int value) {
		this.x = x;
		this.y = y;
		this.value = value;
	}
	/*
	 * Method - Getters and Setters
	 */

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Node [x=" + x + ", y=" + y + ", value=" + value + "]";
	}

}
