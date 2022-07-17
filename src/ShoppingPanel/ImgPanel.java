package ShoppingPanel;

import javax.swing.*;
import java.awt.*;

public class ImgPanel extends JPanel {

    private String imgStr = new String();

    public ImgPanel(String imgStr) {
        this.imgStr = imgStr;
    }

    public void paintComponent(Graphics g) {

        Image tmpImg = new ImageIcon("img/宝珠.png").getImage();
        g.drawImage(tmpImg, 20, 20, this);

    }

}
