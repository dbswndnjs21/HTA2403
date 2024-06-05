package day16;

import java.util.Arrays;

public class ArraysEx02 {
    public static void main(String[] args) {

        // key 값의 index 찾기
        int[] arrNums = {5, 9, 4, 2, 1, 3};
        int index = Arrays.binarySearch(arrNums, 3);
        System.out.println(index);

        // 정렬이 전제 조건
        Arrays.sort(arrNums);
        index = Arrays.binarySearch(arrNums, 3);
        System.out.println(index);
    }
}
