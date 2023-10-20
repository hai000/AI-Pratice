package lab2;

import java.util.ArrayList;
import java.util.List;

public class Node {
	int n;
	List<Integer> state;
	List<Node> neighbours;

	public Node(int n) {
		this.n = n;
		this.state = new ArrayList<>();
		this.neighbours = new ArrayList<>();

	}

	public Node(int n, List<Integer> state) {
		this.n = n;
		this.state = state;
		this.neighbours = new ArrayList<>();

	}

	public void addNeighbour(Node node) {
		neighbours.add(node);
	}

	public List<Node> getNeighbours() {
		if (state.size() == n) {
			return null;
		} else {
			for (int i = 0; i < n; i++) {
				if (place(i) != null) {
					Node newNode = new Node(n);
					newNode.state = place(i);
					this.addNeighbour(newNode);
				}

			}
			return neighbours;
		}

	}

	private List<Integer> place(int x) {
		List<Integer> clone = new ArrayList<>();
		for (Integer integer : state) {
			clone.add(integer);
		}
		clone.add(x);

		return isValid(clone) ? clone : null;

	}

	public boolean isValid(List<Integer> state) {
		if (state.size() == 0) {
			return true;
		}

		else {
			for (int i = 0; i < state.size() - 1; i++) {
				if (state.get(i) == state.get(state.size() - 1)) {
					return false;
				}
			}
			// check down
			int indexRow = state.get(state.size() - 1);
			int count = 1;
			for (int i = state.size() - 2; i >= 0; i--) {

				// check up
				if (state.get(i) == indexRow + count) {
					return false;

				}
//check down
				if (state.get(i) == indexRow - count) {
					return false;
				}

				count++;

			}
			return true;

		}

	}

	public static void main(String[] args) {
		List<Integer> test = new ArrayList<>();
		test.add(2);
		test.add(4);
		test.add(1);
		test.add(3);

	}

}
