package baekjoon;

public class Main6 {
    public static void main(String[] args) {
        String str = "abcdef";

        //String result = str.substring(str.indexOf(" "));
        // " " 값 부터 호출
        //System.out.println(result);

        String[] arr = str.split("");

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
