package day16;

import java.util.Arrays;

public class ArraysEx01 {
    public static void main(String[] args) {

        // 배열의 조작
        String[] arrs = {"aaa", "bbb", "ccc"};

        System.out.println(arrs.toString());
        // 배열의 내용 확인
        System.out.println(Arrays.toString(arrs));

        // 초기화
        Arrays.fill(arrs, "xxx");
        System.out.println(Arrays.toString(arrs));

        // 0부터 2전까지 초기화
        Arrays.fill(arrs, 0, 2, "yyy"); 
        System.out.println(Arrays.toString(arrs));

        String[] arrs1 = {"aaa", "bbb", "ccc"};
        String[] arrs2 = {"aaa", "bbb", "ccc"};

        // 주소값 비교 기 때문에 false
        System.out.println(arrs == arrs2);
        // 내용 값 비교
        System.out.println(Arrays.equals(arrs1,arrs2));

        // sort
        Integer[] arrNum = {45, 345, 34, 6};
        Arrays.sort(arrNum);
        System.out.println(Arrays.toString(arrNum));
    }
}
