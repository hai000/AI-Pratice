package lab2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
	public Node bfsUsingQueue(Node initial, int goal) {
		List<Node> res = new ArrayList<>();
		if (initial.state.size() == goal) {
			System.out.println("node la goal");
		} else {
			Queue<Node> queue = new LinkedList<>();
			queue.add(initial);
			while (!queue.isEmpty()) {
				Node node = queue.poll();
				
				if (node.state.size() == goal) {
					return node;
				} else {
					node.getNeighbours();
					queue.add(node);

				}
				

			}
		}
		return null;

	}
}
