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
public class Inamic extends JPanel{
    int x, y;
   private boolean isPressedR;  
    public boolean isPressedR() {
        return isPressedR;
    }

    public void setIsPressedR(boolean isPressedR) {
        this.isPressedR = isPressedR;
    }
     public void setImg(String path) {
             try {
    this.img = ImageIO.read(new File(path));//pune aici adresa url
} catch (IOException e) {
}
    }
    
    BufferedImage img = null;

    public Inamic(){
  
       setImg("D:\\Facultate\\Anul3\\IngineriaProgramelor_IP\\Proiect\\butonAA.PNG");
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
        //this.setLocation((this.x*BuilderMaze.panelSize)+23, (this.y*BuilderMaze.panelSize)+55);
         while(Maze.map[tx][ty] != 1){
            tx = r.nextInt(Maze.columns);
            ty = r.nextInt(Maze.rows);
        }
        this.x = tx;
        this.y = ty;
        this.setLocation((this.x*Maze.panelSize)+23, (this.y*Maze.panelSize)+55);
    }
}
    
    /*
    public void downInamic(){
        if(this.y < BuilderMaze.columns - 2){
            this.y ++;
            this.setLocation((this.x*BuilderMaze.panelSize)+23, (this.y*BuilderMaze.panelSize)+55);
        }
        else{
            this.changePosition();
        }
    }*/
//}
/*
public class Gold extends JPanel{
    int x, y;
    
    public Gold(){
        this.setBackground(Color.YELLOW);
        this.setSize(BuilderMaze.panelSize, BuilderMaze.panelSize);
    }
    
    public void changePosition(){
        Random r = new Random();
        int tx = r.nextInt(BuilderMaze.columns);
        int ty = r.nextInt(BuilderMaze.rows);
    while(BuilderMaze.map[tx][ty] != 1){
            tx = r.nextInt(BuilderMaze.columns);
            ty = r.nextInt(BuilderMaze.rows);
        }
        this.x = tx;
        this.y = ty;
        this.setLocation((this.x*BuilderMaze.panelSize)+23, (this.y*BuilderMaze.panelSize)+55);
    }
}
*/