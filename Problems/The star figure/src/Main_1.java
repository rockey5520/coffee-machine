import java.util.Scanner;

class Main_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        int counter = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = counter;
                counter++;
            }
        }

       /* //fill middle row
        int middlerow = arr.length/2;
        for (int i = 0; i < arr[middlerow].length ; i++) {
            arr[middlerow][i] = "*";
        }

        //fill middle column
        int middleColumn = arr.length/2;
        for (int i = 0; i < arr.length ; i++) {
            arr[i][middleColumn] = "*";
        }

        //fill left diagonal column
        for (int i = 0; i < arr.length ; i++) {
            arr[i][i] = "*";
        }*/

        //fill right diagonal column
        for (int i = arr.length-1; i > 0 ; i--) {
            System.out.println(i);
            System.out.println(arr[i][i]);
            //arr[i][i] = "*";
        }


        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}