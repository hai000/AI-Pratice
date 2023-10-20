package lab1;

import java.util.ArrayList;
import java.util.List;

public class Node {
	int state;
	boolean visited;
	List<Node> neighbours;
	Node parent;

	Node(int state) {
		this.state = state;
		this.neighbours = new ArrayList<>();
		this.parent = null;
	}
	
	public List<Node> getNeighbours() {
		return neighbours;
	}
public void addNeighbours(Node node) {
	neighbours.add(node);
}
}
