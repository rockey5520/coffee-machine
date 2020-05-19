import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] input = new int[n][n];
        for (int i = 0; i < input.length ; i++) {
            for (int j = 0; j <input[i].length ; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < input.length ; i++) {
            for (int j = 0; j <input[i].length ; j++) {
                if(input[i][j] == input[j][i]){
                    continue;
                }else {
                    System.out.println("NO");
                    System.exit(0);
                }
            }
        }

        System.out.println("YES");

/*



        for (int i = 0; i < input.length ; i++) {
            for (int j = 0; j <input[i].length ; j++) {
                System.out.print(input[i][j]);
            }
            System.out.println();
        }
*/


    }
}