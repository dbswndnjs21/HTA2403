package day18_5_10.functionPack;

import java.util.function.Consumer;

public class FunctionMain {
    public static void main(String[] args) {

        // 매개변수가 1개 있고 리턴 타입이 void인 함수
        Consumer<Integer> consumer = i -> System.out.println("i + " + i);
        consumer.accept(10);

    }
}
