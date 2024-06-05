package day15;

public class ExceptionEx21 {
    public static void main(String[] args) {

        System.out.println("프로그램 시작");

        int index = 6;

        String[] datas = {"1", "2", "3"};

        if (index < datas.length) {
            System.out.println(datas[index]);
        } else {
            System.out.println("인덱스가 적당하지 않음");
        } 
        
        System.out.println("프로그램 끝");


    }
}
