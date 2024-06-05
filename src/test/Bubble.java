package test;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 1, 8, 5, 3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -i -1; j ++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = 0;
                    tmp = arr[j]; //tep = 1
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + " ");
        }
    }
}
