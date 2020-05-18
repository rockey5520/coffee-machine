import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrayString = scanner.nextLine();
        String rotationString = scanner.nextLine();

        String[] s = arrayString.split(" ");
        int[] array = new int[s.length];
        for (int i = 0; i < s.length ; i++) {
            array[i] = Integer.valueOf(s[i]);
        }
        int n = Integer.valueOf(rotationString);
        n = n%array.length;

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

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}