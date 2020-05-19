import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner stdin = new Scanner(System.in);
        int m = stdin.nextInt();
        int n = stdin.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                arr[i][j] = Integer.valueOf(stdin.next());
            }
        }

        int k = stdin.nextInt();
        System.out.println(findRow(arr,k));
    }

    private static int findRow(int[][] matrix, int seats) {
        int consequence = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    consequence += 1;
                } else {
                    consequence = 0;
                }
                if (consequence == seats) {
                    return i + 1;
                }
            }
            consequence = 0;
        }
        return 0;
    }
}
