package lab1;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	public void bfsUsingQueue(Node initial, int goal) {
		if (initial.state == goal) {
			System.out.println("node la goal");
		} else {
			Queue<Node> queue = new LinkedList<>();
			queue.add(initial);
			initial.visited = true;
			while (!queue.isEmpty()) {
				Node node = queue.poll();
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
						queue.add(neighbour);
					}
				}
			}

		}
	}

}
