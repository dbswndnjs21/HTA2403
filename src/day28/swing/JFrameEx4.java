package day28.swing;

import javax.swing.*;
import java.awt.*;

public class JFrameEx4 extends JFrame {
    private JPanel contentPane;
    public static void main(String[] args) {
        // 프로그램 시작

        JFrameEx4 frame = new JFrameEx4();
        frame.setVisible(true);
    }

    public JFrameEx4() {
        // JFrame 설정

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,1024, 768);
        
        // 컴포넌트가 들어갈 공간
        contentPane = new JPanel();
        contentPane.setBackground(Color.GREEN);

        // null -> absolute Layout
        contentPane.setLayout(null);

        // 입력
        JButton btn1 = new JButton("난 버튼");
        btn1.setBounds(10,10,100,25);
        contentPane.add(btn1);

        JButton btn2 = new JButton("난 버튼2");
        btn2.setBounds(10,40,100,25);
        contentPane.add(btn2);
        
        // jframe 에 Panel 부착
        setContentPane((contentPane));

    }
}
