package day28.pack8;

public class MainEx {
    public static void main(String[] args) {
        
        // 한개의 계좌로 한 이유는 한 계좌로 한번에 두개의 일을 할수 없기때문에 
        //synchronized 예를 보여주기 위해서임
        Account account = new Account();

        Client client1 = new Client(account);
        Client client2 = new Client(account);

        Thread t1 = new Thread(client1);
        Thread t2 = new Thread(client2);

        System.out.println("시작");
        t1.start();
        t2.start();
        System.out.println("종료");
    }
}
