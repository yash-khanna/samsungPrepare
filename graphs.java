class graph {
	private boolean matrix [][];
	public graph (int nodes) {
		matrix = new boolean[nodes][nodes];
	}

	public void addEdge (int i, int j) {
		matrix[i][j] = true;
		matrix[j][i] = true;
	}

	public void  removeEdge (int i, int j) {
		matrix[i][j] = false;
		matrix[j][i] = false;
	}

	public void display () {
		for (int i = 0 ; i < matrix.length ; i++) {
			for (int j = 0 ; j < matrix.length ; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main (String args[]) {
		graph g = new graph(4);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,2);
		g.addEdge(2,0);
		g.addEdge(2,3);
		g.addEdge(3,3);
		g.display();
		
	}
}
