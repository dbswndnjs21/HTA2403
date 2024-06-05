package day15;

public class StringEx01 {
    public static void main(String[] args) {
        // 문자열 저장
        // String / StringBuffer / StringBuilder

        String str1 = "Hello String";

        String str2 = new String("Hello String");

        char[] charArray = {'H', 'e', 'l','l', 'o'};
        String str3 = new String(charArray);

        System.out.println(str3);

        // 문자열 비교
        String str11 = "Hello String";
        String str22 = "Hello String";

        System.out.println(str11.equals(str22));
        System.out.println(str11 == str22);

        String str33 = new String("Hello String");
        String str44 = new String("Hello String");

        System.out.println(str33.equals(str44));
        System.out.println(str33 == str44);

    }
}
