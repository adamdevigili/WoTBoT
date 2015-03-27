package wotbot;

public class Node {

	int x, y, z;
	Node N, NE, E, SE, S, SW, W, NW;
	public void Node(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void setZ(int z)
	{
		this.z = z;
	}
}
