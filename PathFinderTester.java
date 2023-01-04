package assignment09;

import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;

/**
 * @author Haoze Zhang & Nicholas Fuller
 */

public class PathFinderTester {
	//Test the bigMaze.txt
	@Test
	public void testSolveBigMaze() throws IOException {
		PathFinder.solveMaze("bigMaze.txt", "bigMazeOurSol.txt");
		BufferedReader f = new BufferedReader(new FileReader(new File("bigMazeSol.txt")));
		File output = new File("bigMazeOurSol.txt");
		BufferedReader fo=new BufferedReader(new FileReader(output));
		ArrayList<String> fLines = new ArrayList<String>();
		ArrayList<String> foLines = new ArrayList<String>();
		String currentfLine = "";
		String currentfoLine = "";
		while(currentfLine != null){
			currentfLine = f.readLine();
			fLines.add(currentfLine);
		}
		while(currentfoLine != null){
			currentfoLine = fo.readLine();
			foLines.add(currentfoLine);
		}
		f.close();
		fo.close();
		assertTrue(fLines.toString().equals(foLines.toString()));
	}
	//Test the classic.txt
	@Test
	public void testSolveClassicMaze() throws IOException {
		PathFinder.solveMaze("classic.txt", "classicOurSol.txt");
		BufferedReader f = new BufferedReader(new FileReader(new File("classicSol.txt")));
		File output = new File("classicOurSol.txt");
		BufferedReader fo=new BufferedReader(new FileReader(output));
		ArrayList<String> fLines = new ArrayList<String>();
		ArrayList<String> foLines = new ArrayList<String>();
		String currentfLine = "";
		String currentfoLine = "";
		while(currentfLine != null){
			currentfLine = f.readLine();
			fLines.add(currentfLine);
		}
		while(currentfoLine != null){
			currentfoLine = fo.readLine();
			foLines.add(currentfoLine);
		}
		f.close();
		fo.close();
		assertTrue(fLines.toString().equals(foLines.toString()));
	}
	//Test the demoMaze.txt
	@Test
	public void testSolveDemoMaze() throws IOException {
		PathFinder.solveMaze("demoMaze.txt", "demoMazeOurSol.txt");
		BufferedReader f = new BufferedReader(new FileReader(new File("demoMazeSol.txt")));
		File output = new File("demoMazeOurSol.txt");
		BufferedReader fo=new BufferedReader(new FileReader(output));
		ArrayList<String> fLines = new ArrayList<String>();
		ArrayList<String> foLines = new ArrayList<String>();
		String currentfLine = "";
		String currentfoLine = "";
		while(currentfLine != null){
			currentfLine = f.readLine();
			fLines.add(currentfLine);
		}
		while(currentfoLine != null){
			currentfoLine = fo.readLine();
			foLines.add(currentfoLine);
		}
		f.close();
		fo.close();
		assertTrue(fLines.toString().equals(foLines.toString()));
	}
	//Test the mediumMaze.txt
	@Test
	public void testSolveMediumMaze() throws IOException {
		PathFinder.solveMaze("mediumMaze.txt", "mediumMazeOurSol.txt");
		BufferedReader f = new BufferedReader(new FileReader(new File("mediumMazeSol.txt")));
		File output = new File("mediumMazeOurSol.txt");
		BufferedReader fo=new BufferedReader(new FileReader(output));
		ArrayList<String> fLines = new ArrayList<String>();
		ArrayList<String> foLines = new ArrayList<String>();
		String currentfLine = "";
		String currentfoLine = "";
		while(currentfLine != null){
			currentfLine = f.readLine();
			fLines.add(currentfLine);
		}
		while(currentfoLine != null){
			currentfoLine = fo.readLine();
			foLines.add(currentfoLine);
		}
		f.close();
		fo.close();
		assertTrue(fLines.toString().equals(foLines.toString()));
	}
	
	//Test straight.txt
	@Test
	public void testSolveStraightMaze() throws IOException {
		PathFinder.solveMaze("straight.txt", "straightOurSol.txt");
		BufferedReader f = new BufferedReader(new FileReader(new File("straightSol.txt")));
		File output = new File("straightOurSol.txt");
		BufferedReader fo=new BufferedReader(new FileReader(output));
		ArrayList<String> fLines = new ArrayList<String>();
		ArrayList<String> foLines = new ArrayList<String>();
		String currentfLine = "";
		String currentfoLine = "";
		while(currentfLine != null){
			currentfLine = f.readLine();
			fLines.add(currentfLine);
		}
		while(currentfoLine != null){
			currentfoLine = fo.readLine();
			foLines.add(currentfoLine);
		}
		f.close();
		fo.close();
		assertTrue(fLines.toString().equals(foLines.toString()));
	}
	//Test tinyMaze.txt
	@Test
	public void testSolveTinyMaze() throws IOException {
		PathFinder.solveMaze("tinyMaze.txt", "tinyMazeOurSol.txt");
		BufferedReader f = new BufferedReader(new FileReader(new File("tinyMazeSol.txt")));
		File output = new File("tinyMazeOurSol.txt");
		BufferedReader fo=new BufferedReader(new FileReader(output));
		ArrayList<String> fLines = new ArrayList<String>();
		ArrayList<String> foLines = new ArrayList<String>();
		String currentfLine = "";
		String currentfoLine = "";
		while(currentfLine != null){
			currentfLine = f.readLine();
			fLines.add(currentfLine);
		}
		while(currentfoLine != null){
			currentfoLine = fo.readLine();
			foLines.add(currentfoLine);
		}
		f.close();
		fo.close();
		assertTrue(fLines.toString().equals(foLines.toString()));
	}
	//Test tinyOpen.txt
	@Test
	public void testSolveTinyOpenMaze() throws IOException {
		PathFinder.solveMaze("tinyOpen.txt", "tinyOpenOurSol.txt");
		BufferedReader f = new BufferedReader(new FileReader(new File("tinyOpenSol.txt")));
		File output = new File("tinyOpenOurSol.txt");
		BufferedReader fo=new BufferedReader(new FileReader(output));
		ArrayList<String> fLines = new ArrayList<String>();
		ArrayList<String> foLines = new ArrayList<String>();
		String currentfLine = "";
		String currentfoLine = "";
		while(currentfLine != null){
			currentfLine = f.readLine();
			fLines.add(currentfLine);
		}
		while(currentfoLine != null){
			currentfoLine = fo.readLine();
			foLines.add(currentfoLine);
		}
		f.close();
		fo.close();
		assertTrue(fLines.toString().equals(foLines.toString()));
	}
	//Test turn.txt
	@Test
	public void testSolveTurnMaze() throws IOException {
		PathFinder.solveMaze("turn.txt", "turnOurSol.txt");
		BufferedReader f = new BufferedReader(new FileReader(new File("turnSol.txt")));
		File output = new File("turnOurSol.txt");
		BufferedReader fo=new BufferedReader(new FileReader(output));
		ArrayList<String> fLines = new ArrayList<String>();
		ArrayList<String> foLines = new ArrayList<String>();
		String currentfLine = "";
		String currentfoLine = "";
		while(currentfLine != null){
			currentfLine = f.readLine();
			fLines.add(currentfLine);
		}
		while(currentfoLine != null){
			currentfoLine = fo.readLine();
			foLines.add(currentfoLine);
		}
		f.close();
		fo.close();
		assertTrue(fLines.toString().equals(foLines.toString()));
	}
	//Test unsolvable.txt
	@Test
	public void testSolveUnsolvableMaze() throws IOException {
		PathFinder.solveMaze("unsolvable.txt", "unsolvableOurSol.txt");
		BufferedReader f = new BufferedReader(new FileReader(new File("unsolvableSol.txt")));
		File output = new File("unsolvableOurSol.txt");
		BufferedReader fo=new BufferedReader(new FileReader(output));
		ArrayList<String> fLines = new ArrayList<String>();
		ArrayList<String> foLines = new ArrayList<String>();
		String currentfLine = "";
		String currentfoLine = "";
		while(currentfLine != null){
			currentfLine = f.readLine();
			fLines.add(currentfLine);
		}
		while(currentfoLine != null){
			currentfoLine = fo.readLine();
			foLines.add(currentfoLine);
		}
		f.close();
		fo.close();
		assertTrue(fLines.toString().equals(foLines.toString()));
	}
	//Test CustomMaze
	@Test
	public void testSolveCustomMaze() throws IOException {
		PathFinder.solveMaze("CustomMaze.txt", "CustomMazeOurSol.txt");
		BufferedReader f = new BufferedReader(new FileReader(new File("CustomMazeSol.txt")));
		File output = new File("CustomMazeOurSol.txt");
		BufferedReader fo=new BufferedReader(new FileReader(output));
		ArrayList<String> fLines = new ArrayList<String>();
		ArrayList<String> foLines = new ArrayList<String>();
		String currentfLine = "";
		String currentfoLine = "";
		while(currentfLine != null){
			currentfLine = f.readLine();
			fLines.add(currentfLine);
		}
		while(currentfoLine != null){
			currentfoLine = fo.readLine();
			foLines.add(currentfoLine);
		}
		f.close();
		fo.close();
		assertTrue(fLines.toString().equals(foLines.toString()));
	}
}
