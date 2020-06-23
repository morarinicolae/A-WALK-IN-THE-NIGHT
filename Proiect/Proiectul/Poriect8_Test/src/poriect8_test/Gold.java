package poriect8_test;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

//PROTOTYPE
public class Gold extends JPanel{
    int x, y;
    private boolean isPressed;  
    public boolean isPressed() {
        return isPressed;
    }

    public void setIsPressed(boolean isPressed) {
        this.isPressed = isPressed;
    }
    public void setImg(String path) {
             try {
    this.img = ImageIO.read(new File(path));
} catch (IOException e) {}
    }  
    BufferedImage img = null;

    public Gold(){
  
       setImg("D:\\Facultate\\Anul3\\IngineriaProgramelor_IP\\Proiect\\butonGI.PNG");
        this.setSize(Maze.panelSize, Maze.panelSize);
    }
  
    
    @Override
  protected void paintComponent(Graphics g) {

    super.paintComponent(g);
        g.drawImage(img, 0, 0, 23,23,  null);
}
    public void changePosition(){
        Random r = new Random();
        int tx = r.nextInt(Maze.columns);
        int ty = r.nextInt(Maze.rows);
    while(Maze.map[tx][ty] != 1){
            tx = r.nextInt(Maze.columns);
            ty = r.nextInt(Maze.rows);
        }
        this.x = tx;
        this.y = ty;
        this.setLocation((this.x*Maze.panelSize)+23, (this.y*Maze.panelSize)+55);
    }

    void changeColor(Color RED) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean Backround(Color BLACK) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
