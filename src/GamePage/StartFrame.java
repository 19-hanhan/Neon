package GamePage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class StartFrame extends JFrame{

    private int width = 600, height = 400;

    private int size = 9;
    private JButton jButtons[] = new JButton[size];

    public StartFrame() {
        //设置窗体标题
        this.setTitle("选择关卡");

        // 创建组件
        for(int i = 0; i < size; i++){
            jButtons[i] = new JButton("1 - " + String.valueOf(i + 1));
            if (i == 0) {
                jButtons[i].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        try {
                            Process run = Runtime.getRuntime().exec("resources/Checkpoint/XiaoNi.exe");
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }

                });
            }
            else if (i == 1) {
                jButtons[i].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        try {
                            Process run = Runtime.getRuntime().exec("resources/Checkpoint/Level-02/XiaoNi.exe");
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }

                });
            }
            else {
                jButtons[i].setBackground(Color.gray);
            }
        }

        // 添加组件
        for(int i = 0; i<size; i++){
            this.add(jButtons[i]);
        }

        //设置网格布局
        this.setLayout(new GridLayout(3, 3, 10, 30));

        //设置窗体大小
        this.setSize(width, height);
        //设置能否调整窗体大小
        this.setResizable(false);
        //这句会使得在屏幕上居中显示
        this.setLocationRelativeTo(null);
        //关闭当前窗体
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        //把窗体显示出来
        this.setVisible(true);

    }

}
