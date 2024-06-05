package test;

public class Arr5_4 {
    public static void main(String[] args) {
        int[][] arr = {
                {5,5,5},
                {6,6},
                {7,7,7},
                {1}
        };

        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
    }
    //System.arraycopy(원본배열, 원본 배열의 복사 시작 지점, 복사할 배열, 복사할 배열의 복사 시작 지점, 복사할 요소의 개수)
//    System.arraycopy(ballArr,0, ball3,0,3);


}
