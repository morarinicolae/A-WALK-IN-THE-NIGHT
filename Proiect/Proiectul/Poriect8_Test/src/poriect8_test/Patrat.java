package poriect8_test;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
//BRIDGE
public class Patrat extends JPanel{
    int x, y;
    boolean isWall = true;

    
    BufferedImage img = null;

    public Patrat(int x, int y){
        //this.setImg("D:\\Poze\\wallpaper\\hd.JPG");
        this.x = x;
        this.y = y;
    }
    
    public void setPatrat(int x, int y){
        this.x = x;
        this.y = y;
    }
    
          public void setImg(String path) {
             try {
    this.img = ImageIO.read(new File(path));//pune aici adresa url
} catch (IOException e) {
}
    }
              @Override
  protected void paintComponent(Graphics g) {

    super.paintComponent(g);
        g.drawImage(img, 0, 0, 40,40,  null);
}
}
