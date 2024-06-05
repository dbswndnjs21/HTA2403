package day15;

public class StringBufferEx01 {

    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        // 내부 버퍼의 크기 설정
        StringBuffer sb2 = new StringBuffer(100);
        // 문자열 바로 설정
        StringBuffer sb3 = new StringBuffer("Hello StringBuffer");

        //buffer 내부 저장소의 크기 알기
        System.out.println(sb1.capacity()); // 16 (기본사이즈)
        System.out.println(sb2.capacity());
        System.out.println(sb3.capacity()); // Hello StringBuffer + 16 = 34

        System.out.println(sb1.length()); // 0
        System.out.println(sb2.length()); // 0
        System.out.println(sb3.length()); // 18

        //charAt
        //substring
        // indexOf / lastIndexOf
        // replace

        // 문자열 조작
        // append / insert / delete
        System.out.println(sb3);
        sb3.append("안녕");
        System.out.println(sb3);
        sb3.insert(3, "추가"); // 3번째 이후에 "추가" 추가됨
        System.out.println(sb3);
        sb3.delete(0, 3);
        System.out.println(sb3);
        
        
        

    }

}
