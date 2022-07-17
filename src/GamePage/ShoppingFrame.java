package GamePage;

import ShoppingPanel.ImgPanel;

import javax.swing.*;
import java.awt.*;

public class ShoppingFrame extends JFrame{

    private int width = 600, height = 400;

    public ShoppingFrame() {
        //设置窗体标题
        this.setTitle("游戏商店");

        this.setLayout(new GridLayout(2, 2, 10, 20));
        JButton btn1 = new JButton("宝珠");
        btn1.setBackground(Color.green);
        JButton btn2 = new JButton("药瓶");
        btn2.setBackground(Color.green);
        JButton btn3 = new JButton("骰子");
        btn3.setBackground(Color.green);
        JButton btn4 = new JButton("魔法书");
        btn4.setBackground(Color.green);
        this.add(btn1); this.add(btn2); this.add(btn3); this.add(btn4);

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
