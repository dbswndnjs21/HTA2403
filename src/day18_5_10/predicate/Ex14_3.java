package day18_5_10.predicate;

import java.util.function.Predicate;

public class Ex14_3 {
    public static void main(String[] args) {

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i % 2 == 0;
        Predicate<Integer> notP = p.negate();

        Predicate<Integer> all = notP.and(q.or(r));
        System.out.println(all.test(150));


        String str1 = "abc";
        String str2 = "abc";
        
        // str1과 str2가 같은지 비교한결과를 반환
        Predicate<String> p2 = Predicate.isEqual(str1);
        boolean result = p2.test(str2);
        System.out.println(result);
    }
}
