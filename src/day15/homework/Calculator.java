package day15.homework;

public class Calculator {

    public Calculator(String str) {
        String[] arr = str.split(" ");

        int value1 = Integer.parseInt(arr[0]);
        String oper = arr[1];
        int value2 = Integer.parseInt(arr[2]);

        if (oper.trim().equals("+")) {
            add(value1, value2);
        } else if (oper.trim().equals("*")) {
            multiply(value1, value2);
        } else if (oper.trim().equals("-")) {
            subtract(value1, value2);
        }
    }

   void add(int a, int b ) {
       System.out.println(a+ b);
    }

    void multiply (int a, int b) {
        System.out.println(a * b);
    }

    void subtract(int a, int b) {
        System.out.println(a - b);
    }

}


