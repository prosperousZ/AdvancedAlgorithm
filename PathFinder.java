package assignment09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

/**
 * @author Haoze Zhang & Nicholas Fuller
 */
public class PathFinder {

	/**
	 * This method provides the solution of a maze finding the shortest path
	 * using Breadth-First Search.
	 * 
	 * @param <E>
	 * @param inputFile
	 *            - the maze the user wants solved
	 * @param outputFile
	 *            - the solved maze
	 */
	public static void solveMaze(String inputFile, String outputFile) {
		// Create the bufferedReader
		BufferedReader f = null;
		// Create the queue
		LinkedList<Node> queue = new LinkedList<>();
		try {
			// Read the file from the text
			f = new BufferedReader(new FileReader(new File(inputFile)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Get the height and width
		String[] dimensions = null;
		try {
			dimensions = f.readLine().split(" ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		int height = Integer.parseInt(dimensions[0]);
		int width = Integer.parseInt(dimensions[1]);
		// Create the node to track the current node
		Node current = new Node();
		// Create the goal node
		Node goal = new Node();
		// Create the 2D node array
		Graph g = new Graph();
		g.nodes = new Node[height + 1][width];
		// Put the number into the data of node
		g.nodes[0][0] = new Node();
		g.nodes[0][0].data = height + " " + width;
		g.nodes[0][0].visited = true;
		g.nodes[0][0].H = 0;
		g.nodes[0][0].W = 0;
		// H is the height
		int h = 1;
		try {
			// Read the line
			String tmp;
			while ((tmp = f.readLine()) != null) {
				// Make every line into a string array
				String[] line = tmp.split("");
				// Make every string in the line become node
				for (int w = 0; w < width; w++) {
					g.nodes[h][w] = new Node();
					// Put the string into data of node
					g.nodes[h][w].data = line[w];
					// Mark the coordinate of every node
					g.nodes[h][w].H = h;
					g.nodes[h][w].W = w;
					// Find the goal node
					if (line[w].equals("G")) {
						goal = g.nodes[h][w];
						goal.data = line[w];
						goal.visited = false;
						goal.H = h;
						goal.W = w;
					}
					// Find the start node and put it into queue
					if (line[w].equals("S")) {
						current = g.nodes[h][w];
						current.data = line[w];
						queue.add(current);
						current.visited = true;
						current.W = w;
						current.H = h;
					}
				}
				h++;
			}
			// If there is something in the queue
			while (!queue.isEmpty()) {
				// Dequeue
				current = queue.remove();
				// If the goal was found
				if (current.data.equals("G")) {
					while (current.cameFrom != null) {
						// Mark the shortest path
						current = current.cameFrom;
						if (current.data.equals("S")) {
							break;
						}
						current.data = ".";
					}
					try (PrintWriter output = new PrintWriter(new FileWriter(
							outputFile))) {
						output.println(g.nodes[0][0].data);
						// Repaint the graph
						for (int hei = 1; hei < height + 1; hei++) {
							for (int w = 0; w < width; w++) {
								if (w < width - 1) {
									output.print(g.nodes[hei][w].data);
								}
								if (w == width - 1) {
									output.print(g.nodes[hei][w].data + "\n");
								}
							}
						}
						f.close();
					}
					return;
				}
				// If the current node has the down node
				if (!g.nodes[current.H - 1][current.W].data.equals("X")
						&& g.nodes[current.H - 1][current.W].visited == false
						&& g.nodes[current.H - 1][current.W] != null) {
					g.nodes[current.H - 1][current.W].visited = true;
					g.nodes[current.H - 1][current.W].cameFrom = current;
					queue.add(g.nodes[current.H - 1][current.W]);
				}
				// If the current node has the right node
				if (!g.nodes[current.H][current.W + 1].data.equals("X")
						&& g.nodes[current.H][current.W + 1].visited == false
						&& g.nodes[current.H][current.W + 1] != null) {
					g.nodes[current.H][current.W + 1].visited = true;
					g.nodes[current.H][current.W + 1].cameFrom = current;
					queue.add(g.nodes[current.H][current.W + 1]);
				}
				// If the current node has the left node
				if (!g.nodes[current.H][current.W - 1].data.equals("X")
						&& g.nodes[current.H][current.W - 1].visited == false
						&& g.nodes[current.H][current.W - 1] != null) {
					g.nodes[current.H][current.W - 1].visited = true;
					g.nodes[current.H][current.W - 1].cameFrom = current;
					queue.add(g.nodes[current.H][current.W - 1]);
				}
				// If the current node has the up node
				if (!g.nodes[current.H + 1][current.W].data.equals("X")
						&& g.nodes[current.H + 1][current.W].visited == false
						&& g.nodes[current.H + 1][current.W] != null) {
					g.nodes[current.H + 1][current.W].visited = true;
					g.nodes[current.H + 1][current.W].cameFrom = current;
					queue.add(g.nodes[current.H + 1][current.W]);
				}
			}
			// If the maze has no solution
			try (PrintWriter output = new PrintWriter(
					new FileWriter(outputFile))) {
				output.println(g.nodes[0][0].data);
				for (int hei = 1; hei < height + 1; hei++) {
					for (int w = 0; w < width; w++) {
						if (w < width - 1) {
							output.print(g.nodes[hei][w].data);
						}
						if (w == width - 1) {
							output.print(g.nodes[hei][w].data + "\n");
						}
					}
				}
			}
			f.close();
			return;
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * The graph class creates the 2D node array
	 */
	static class Graph {
		// Create the 2D node array
		Node nodes[][];
	}

	/**
	 * The node class has data of every node, where the node comes from, the
	 * coordinate of every node and if this node has been visited.
	 */
	static class Node {
		// The data store the item in the node
		String data = "";
		// Mark which node it comes from
		Node cameFrom;
		// the y-axis coordinate
		int H;
		// the x-axis coordinate
		int W;
		// If the node is visited
		Boolean visited = false;
	}
}
