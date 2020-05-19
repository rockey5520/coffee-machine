import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] arr = new String[n][n];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ".";
            }
        }

        //fill middle row
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
        }

        //fill right diagonal column

        for (int i = 0; i < arr.length ; i++) {
            for (int j = arr.length-1-i; j > -1 ; j--) {
                arr[i][j] = "*";
                break;
            }

        }


        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}