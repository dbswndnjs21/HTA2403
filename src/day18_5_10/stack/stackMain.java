package day18_5_10.stack;

import java.util.Stack;

public class stackMain {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        
        stack.push("홍길동");
        stack.push("박문수");

        System.out.println(stack);

        stack.add("임꺽정");
        System.out.println(stack);
        System.out.println(stack.size());

        System.out.println(stack.pop()); // 꺼내면서 보여줌
        System.out.println(stack.size());

        System.out.println(stack.get(stack.size()-1)); // 얘는 사이즈와는 상관없이 보여줌
        System.out.println(stack.size());

        //맨 마지막꺼 없애기
        stack.remove(stack.size() - 1);
        System.out.println(stack.size());

    }
}

