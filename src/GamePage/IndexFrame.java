package GamePage;

import PageOperate.IndexPanel;

import javax.swing.JFrame;

public class IndexFrame extends JFrame{
	
	private int width = 600, height = 400;
	
	public IndexFrame() {
		//设置窗体标题
		this.setTitle("小霓的星辰大海");
		
		//创建一个画布
		IndexPanel panel = new IndexPanel(width, height);
		//把画布加入到窗体中
		getContentPane().add(panel, "Center");
		
		//设置窗体大小
		this.setSize(width, height); 
		//设置能否调整窗体大小
		this.setResizable(false); 
		//这句会使得在屏幕上居中显示
		this.setLocationRelativeTo(null);
		//当关闭窗体的时候退出程序
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		//把窗体显示出来
		this.setVisible(true); 
	}
	
}