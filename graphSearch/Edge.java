package graphSearch;

class Edge {
	private Integer v,w;
	private int weight;
	public Edge(Integer first, Integer second, int edgeWeight) {
		v = first;
		w = second;
		weight = edgeWeight;
	}
	public Integer getV() {
		return v;
	}
	public Integer getW() {
		return w;
	}
	public int getWeight() {
		return weight;
	}
	
}


