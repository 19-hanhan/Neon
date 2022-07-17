package GamePage;

import PageOperate.IntroductionPanel;

import javax.swing.*;

public class IntroductionFrame extends JFrame{

    private int width = 600, height = 400;

    public IntroductionFrame() {
        //设置窗体标题
        this.setTitle("开发者介绍");

        //创建一个画布
        IntroductionPanel panel = new IntroductionPanel(width, height);
        //把画布加入到窗体中
        getContentPane().add(panel, "Center");

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
