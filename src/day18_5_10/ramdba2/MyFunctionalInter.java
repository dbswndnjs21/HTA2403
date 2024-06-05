package day18_5_10.ramdba2;

@FunctionalInterface // 이걸쓰면 메서드 2개쓰면 자동으로 오류냄
public interface MyFunctionalInter {
    
    // 함수형 인터페이스는 반듯이 하나만 써야함
    void method01();
    //void method02();
}
