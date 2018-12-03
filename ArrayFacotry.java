public class ArrayFacotry {
    private int x;
    ArrayFacotry() {
    }

    ArrayFacotry(int x) {
        this.x = x;
    }

    public int[] oneDimension() {
        int[] oneD = new int[getX()];
        return oneD;
    }

    public int[][] twoDimension() {
        int[][] twoD = new int[getX()][getX()];
        return twoD;
    }

    public int[][] identityMatrix() {
        int[][] twoD = new int[getX()][getX()];

        for (int i = 0; i < getX(); i++) {
            for (int j = 0; j < getX(); j++) {
                if (i == j) {
                    twoD[i][j] = 1;
                }
            }
        }
        return twoD;
    }

    public int[][] identityMatrixTry() {
        int[][] twoD = new int[getX()][getX()];

        System.out.print("[");
        for (int i = 0; i < getX(); i++) {
            for (int j = 0; j < getX(); j++) {
                if (i == j) {
                    twoD[i][j] = 1;
                }
            }
        }
        System.out.print("]");
        return twoD;
    }

    public int getX() {
        return x;
    }
}
