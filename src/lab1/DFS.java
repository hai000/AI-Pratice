package lab1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DFS {
	public void bfsUsingStack(Node initial, int goal) {
		if (initial.state == goal) {
			System.out.println("node la goal");
		} else {
			Stack<Node> stack = new Stack<>();
			stack.add(initial);
			initial.visited = true;
			while (!stack.isEmpty()) {
				Node node = stack.pop();
				for (Node neighbour : node.neighbours) {
					if (neighbour.state == goal) {
						String s = "";
						neighbour.parent=node;
						while (neighbour != initial) {
							s = neighbour.state + " " + s;
							neighbour = neighbour.parent;
						}
						System.out.println(initial.state + " " + s);
						return;
					}
					if (!neighbour.visited) {

						neighbour.visited = true;
						neighbour.parent = node;
						stack.add(neighbour);
					}
				}
			}

	}
	}
}
