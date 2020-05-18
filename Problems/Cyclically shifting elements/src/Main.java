import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length ; i++) {
            array[i] = scanner.nextInt();
        }

        int n = 1;

        for (int i = 0; i < n ; i++) {
            int last = array[array.length-1];
            for (int j = array.length-1; j > 0 ; j--) {
                array[j] = array[j-1];
            }
            array[0] = last;
        }

        for (int i = 0; i < array.length ; i++) {
            System.out.print(" "+array[i]);
        }


    }
}