package graphSearch;

import java.util.TreeMap;
import java.util.Vector;

public class Graph {
	private int numEdges;
	private int numVertices;
	private Vector<TreeMap<Integer, Integer>> adjList;
	private double[][] nodeList;
	public Graph(int n) {
		numEdges = 0;
		numVertices = n;
		adjList = new Vector<TreeMap<Integer,Integer>>();
		nodeList = new double[numVertices][2]; //x,y for each node
		for (int i = 0; i < numVertices; i++) {
			adjList.add(new TreeMap<Integer, Integer>());
		}
	}
	public int getNumEdges() {
		return numEdges;
	}
	public int getNumVertices() {
		return numVertices;
	}
	public int getEdgeWeight(Integer v, Integer w) {
		return adjList.get(v).get(w);
	}
	public void addEdge(Integer v, Integer w, int wt) {
		adjList.get(v).put(w, wt);
		adjList.get(w).put(v, wt);
		numEdges++;
	}
	public void addEdge(Edge e) {
		Integer v = e.getV();
		Integer w = e.getW();
		int wt = e.getWeight();
		addEdge(v, w, wt);
	}
	public void removeEdge(Edge e) {
		Integer v = e.getV();
		Integer w = e.getW();
		adjList.get(v).remove(w);
		adjList.get(w).remove(v);
		numEdges--;
	}
	public Edge findEdge(Integer v, Integer w) {
		int wt = adjList.get(v).get(w);
		return new Edge(v, w, wt);
	}
	public TreeMap<Integer, Integer> getAdjList(Integer v){
		return adjList.get(v);
	}
	public void addNodeXY(Integer NodeID, double nodeX, double nodeY){
		nodeList[NodeID][0] = nodeX;
		nodeList[NodeID][1] = nodeY;
	}
}