package egor;
import java.util.Arrays;

public class Lesson3 {

    public static void main(String[] args) {
        zero01();
        zero100();
        zero62();
        zero57();
        
    }

    static void zero01() {
        int[] arr = {1, 0, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        System.out.println(Arrays.toString(arr));

    }

    static void zero100() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void zero62() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
                System.out.println(Arrays.toString(arr));
            }

        }
    }

    static void zero57() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++)
            arr[i][i] = 1;
        System.out.println(Arrays.toString(arr));
    }
}


















