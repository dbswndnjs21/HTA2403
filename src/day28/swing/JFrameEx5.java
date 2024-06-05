package day28.swing;

import javax.swing.*;
import java.awt.*;

public class JFrameEx5 extends JFrame {
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrameEx5 frame = new JFrameEx5();
                frame.setVisible(true);
            }
        });

    }

    public JFrameEx5() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1024, 768);
        contentPane = new JPanel();
        contentPane.setLayout(null);

        //나머지 컨포넌트 넣기;
        JButton btn1 = new JButton("버튼");
        btn1.setBounds(10,10,100,25);
        contentPane.add(btn1);
        
        setContentPane(contentPane);
    }
}
