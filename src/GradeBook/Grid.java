public class Grid {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                a[row][col] = row + 1 + col * 5;
            }
            }
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++)
            System.out.print(a[row][col] + " \t");
        }
        System.out.println();


    }
}


