package day18_5_10.rambda3;


public class RambdaMain {
    public static void main(String[] args) {
        MyFunctionalInter1 f = (x) -> System.out.println("x : " + x);

        f.method(10);
        f.method(20);

        /*
        MyFunctionalInter2 f2 = (x,y) -> {
            return x + y;
        };
         */

        MyFunctionalInter2 f2 = (x,y) ->  {return x + y;};
        MyFunctionalInter2 f3 = (x,y) ->  x + y;

        System.out.println(f2.method(10,20));
        System.out.println(f3.method(30,40));

    }

}
