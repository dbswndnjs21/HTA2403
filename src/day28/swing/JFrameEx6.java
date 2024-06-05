package day28.swing;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class JFrameEx6 {
    private JPanel jPanel;
    private JButton button1;

    public static void main(String args[]) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new JFrameEx6().jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public JFrameEx6() {
        jPanel.setBackground(Color.GREEN);
        // 디자인 -> 소스(메서드 추출)
        /*setResizable(false); // 창 사이즈 바꾸기 불가
        setTitle("난 타이틀");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 800);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 255, 0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btn1 = new JButton("New button");
        btn1.setBounds(12, 10, 97, 23);
        contentPane.add(btn1);*/
    }
}