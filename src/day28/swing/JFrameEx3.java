package day28.swing;

import javax.swing.*;
import java.awt.*;

public class JFrameEx3 extends JFrame {
    public static void main(String[] args) {
        JFrameEx3 frame = new JFrameEx3();
        frame.setVisible(true);
    }

    public JFrameEx3() {
//        setSize(1024,768);
//        setLocation(100,100);
        setBounds(100,100,1024,768);
        
        setTitle("프레임 타이틀");

        // 창닫기 버튼 누르면 프로그램 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
