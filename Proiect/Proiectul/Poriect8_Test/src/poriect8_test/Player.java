package poriect8_test;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Player extends JPanel{
	int x, y,tileX, tileY;
	public Image playerImage;
        //SINGLETON
    public void setImg(String path) {
             try {
    this.img = ImageIO.read(new File(path));//pune aici adresa url
} catch (IOException e) {
}
    }
    
    BufferedImage img = null;

    public Player(){
  
       setImg("D:\\Facultate\\Anul3\\IngineriaProgramelor_IP\\Proiect\\player.PNG");
        this.setSize(Maze.panelSize, Maze.panelSize);
    }
    //STAI ASA
    
    @Override
  protected void paintComponent(Graphics g) {

    super.paintComponent(g);
        g.drawImage(img, 0, 0, 23,23,  null);
        
        //public Player() {

        this.setBackground(Color.getHSBColor(0.3f, 0.3f, 1));
        
       //this.setImageResource("D:\\Poze\\Student\\student.jpg");
    	this.setSize(Maze.panelSize, Maze.panelSize);
    }

    public void moveLeft() {
    	if(x > 0 && Maze.map[x-1][y] >= 1){
	    	this.setLocation(this.getX()-25, this.getY());
	    	x--;
    	}
    }

    public void moveRight() {
    	if(x < Maze.columns-1 && Maze.map[x+1][y] >= 1){
	    	this.setLocation(this.getX()+25, this.getY());
	    	x++;
    	}
    }

    public void moveUp() {
    	if(y > 0 && Maze.map[x][y-1] >= 1){
	    	this.setLocation(this.getX(), this.getY()-25);
	    	y--;
    	}
    }

    public void moveDown() {
    	if(y < Maze.rows-1 && Maze.map[x][y+1] >= 1){
	    	this.setLocation(this.getX(), this.getY()+25);
	    	y++;
    	}
    }
}

    
   
    
    
    
    
//    boolean isBackgroundSet(Color black) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    boolean Backround(Color BLACK) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//}
