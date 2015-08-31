package graphSearch;

public class Path {

	private int pathLength;
	private Edge[] pathEdges;
	
	public Path(Edge[] pathE) {
		pathEdges = pathE;
		int pathL = 0;
		for (Edge edge : pathE) {
			pathL += edge.getWeight();
		}
		pathLength = pathL;
	}
	public int getPathLength() {
		return pathLength;
	}

	public Edge[] getPathEdges() {
		return pathEdges;
	}
}

