package question;

public class Q427 {
    public Node construct(int[][] grid) {
        return build(grid, grid.length, 0, 0);
    }

    public Node build(int[][] grid, int n, int x, int y) {
        if (n <= 0) return null;

        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (grid[i][j] == grid[x][y]) continue;

                return new Node(true, false,
                        build(grid, n / 2, x, y),
                        build(grid, n / 2, x, y + n / 2),
                        build(grid, n / 2, x + n / 2, y),
                        build(grid, n / 2, x + n / 2, y + n / 2));
            }
        }

        return new Node(grid[x][y] == 1, true, null, null, null, null);
    }

    class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;


        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    }
}

/*
427. Construct Quad Tree
 */
