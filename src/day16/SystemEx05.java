package day16;

public class SystemEx05 {
    public static void main(String[] args) {
        
        // 시스템에 대한 환경 정보
        System.out.println(System.getProperty("os.name"));

        // 사용자의 이름
        System.out.println(System.getProperty("user.name"));

        // 사용자의 로그인 디렉토리
        System.out.println(System.getProperty("user.home"));

        // 환경 변수 정보
        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.getenv("Path"));
    }
}
