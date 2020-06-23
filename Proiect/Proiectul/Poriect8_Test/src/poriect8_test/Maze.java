package poriect8_test;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;

//SABLOANE BUILDER

public final class Maze extends JFrame {

    public static int rows = 10;
    public static int columns = 10;
    public static int panelSize = 25;
    public static int map[][] = new int[columns][rows];
    public static int endLevelLoc;
    public static int scor = 0;
    public static int life = 3;
    Player p;
    static final int  nrPatrate = 3;
    ArrayList<Gold> goldList = new ArrayList<>();
    ArrayList<Inamic> inamicList = new ArrayList<>();
    Timer t, t_add;
    int temp = 1;
    boolean isPressed = false;
    boolean isPressedR= false;

    public Maze(String str) {
        loadMap(str);

        this.setResizable(false);
        this.setSize((columns * panelSize) + 50, (rows * panelSize) + 120);
        this.setTitle("Maze");
        this.setLayout(null);
        JLabel labelScor = new JLabel("Trebuie sa deschizi toate portalele!" , SwingConstants.LEFT);
        labelScor.setSize(250, 20);
        labelScor.setLocation(25, 25);
        this.add(labelScor);
        JLabel labelLife = new JLabel("Life: " + life, SwingConstants.RIGHT);
        labelLife.setSize(200, 20);
        labelLife.setLocation(275, 25);
        this.add(labelLife);
        revalidate();

        this.addKeyListener(new KeyListener() {
            
            //SABLON DESIGN PATTERNS (BUTTOANE)
            
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                
                //Player movement
                if (key == KeyEvent.VK_W || key == KeyEvent.VK_UP) {
                    p.moveUp();
                }
                if (key == KeyEvent.VK_A || key == KeyEvent.VK_LEFT) {
                    p.moveLeft();
                }
                if (key == KeyEvent.VK_S || key == KeyEvent.VK_DOWN) {
                    p.moveDown();
                }
                if (key == KeyEvent.VK_D || key == KeyEvent.VK_RIGHT) {
                    p.moveRight();
                }
         for (int i = 0; i < goldList.size(); i++) {
                    if (goldList.get(i).x == p.x && goldList.get(i).y == p.y) {
                        scor++;                      
                       labelScor.setText("Portal:" + scor);
                       
                       if (goldList.get(i).isPressed()){
                           
                           goldList.get(i).setIsPressed(false);
                            goldList.get(i).setImg("D:\\Facultate\\Anul3\\IngineriaProgramelor_IP\\Proiect\\butonGI.PNG");
                            labelScor.setText("Portal:" + scor);
                       }
                       else {
                            goldList.get(i).setIsPressed(true);
                            goldList.get(i).setImg("D:\\Facultate\\Anul3\\IngineriaProgramelor_IP\\Proiect\\butonGA.PNG");
                            
                       }
                   
                    
                    }
                                         
                    
                }

                revalidate();
                repaint();
            }

            @Override
            public void keyTyped(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {

            }
        });

        this.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent me) {
                Point poz = me.getPoint();

                if (((poz.x - 23) / panelSize == p.x + 1) && ((poz.y - 25) / panelSize - 1 == p.y)) {
                    p.moveRight();
                }
                if (((poz.x - 23) / panelSize == p.x - 1) && ((poz.y - 25) / panelSize - 1 == p.y)) {
                    p.moveLeft();
                }
                if (((poz.x - 23) / panelSize == p.x) && ((poz.y - 25) / panelSize - 1 == p.y - 1)) {
                    p.moveUp();
                }
                if (((poz.x - 23) / panelSize == p.x) && ((poz.y - 25) / panelSize - 1 == p.y + 1)) {
                    p.moveDown();
                }
                for (int i = 0; i < goldList.size(); i++) {
                    if (goldList.get(i).x == p.x && goldList.get(i).y == p.y) {
                        scor++;
                        labelScor.setText("Scor: " + scor);
                        goldList.get(i).changePosition();
                    }
                }
                revalidate();
                repaint();

                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                
                System.exit(0);
            }
        });

        this.setLocationRelativeTo(null);
        int delay = 10000 / rows;

        ActionListener inamicAction = (ActionEvent evt) -> {
            
            //CONDITIA CU LEVEL TERMINAT
            boolean stop = false;
            for (int i = 0; i < temp; i++) {
                inamicList.get(i);
                for( int j = 1; j<20; j++)                    
                if (inamicList.get(i).x == p.x && inamicList.get(i).y == p.y  && stop != true) {                   
                   int counter = 0;
                   for (Gold gold: goldList){
                   if(gold.isPressed()){                       
                   counter ++;
                  // System.out.println(counter);
                   }
                   }
                   if (counter >= nrPatrate ){
                   stop = true;
                   JOptionPane.showMessageDialog(null, "Felicitari, ai terminat nivelul!" , "End Game", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    scor = 0;
                    life = 3;
                    t.stop();
                    //t_add.stop();
                    temp = 1;
                    MainMenu mainMenu = new MainMenu();
                    labelLife.setText("Life: " + life);                    
                    }
                   }             
            }
        };
        t = new Timer(delay, inamicAction);
        t.setRepeats(true);
        t.start();

        for(int i=0; i<columns/3; i++){
                Inamic in = new Inamic();
                in.setVisible(false);
                this.add(in);
                in.changePosition();
                inamicList.add(in);
        }
        inamicList.get(0).setVisible(true);
        
        //Create player
        p = new Player();
        p.setVisible(true);
        this.add(p);

        for (int i = 0; i < nrPatrate; i++) {
            Gold g = new Gold();
            g.setVisible(true);           
            this.add(g);
            g.changePosition();         
          goldList.add(g);
        }
       
        

        //Color map
        for (int y = 0; y < columns; y++) {
            for (int x = 0; x < rows; x++) {
                Patrat patrat = new Patrat(x, y);
                patrat.setSize(panelSize, panelSize);
                patrat.setLocation((x * panelSize) + 23, (y * panelSize) + 55);
                if (map[x][y] == 0) {// ce vrei sa faci ?
                    //patrat.setBackground(Color.BLUE);
                patrat.setImg("D:\\Facultate\\Anul3\\IngineriaProgramelor_IP\\Proiect\\wall.PNG");
                } else {
                   /* if (map[x][y] == 2) {
                       // patrat.setBackground(Color.RED);
                    }*/
                    if (map[x][y] == 1) {
                        patrat.setImg("D:\\Facultate\\Anul3\\IngineriaProgramelor_IP\\Proiect\\floor.PNG");
                    }
                    if (x == 0) {
                        p.setLocation((x * panelSize) + 23, (y * panelSize) + 55);
                        p.y = y;
                    }
                    if (x == columns - 1) {
                        endLevelLoc = y;
                    }
                
                }
patrat.setVisible(true);
                this.add(patrat);
                 

            }
        }
        this.setVisible(true);
    }
    public static void main(String args[]) {
        MainMenu mainMenu;
        mainMenu = new MainMenu();
    }
    public void loadMap(String str) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(str));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String mapStr = sb.toString();

            int counter = 0;
            for (int y = 0; y < columns; y++) {
                for (int x = 0; x < rows; x++) {
                    String mapChar = mapStr.substring(counter, counter + 1);
                    if (!mapChar.equals("\r\n") && !mapChar.equals("\n") && !mapChar.equals("\r")) {//If it's a number
                        //System.out.print(mapChar);
                        map[x][y] = Integer.parseInt(mapChar);
                    } else {//If it is a line break
                        x--;
                        System.out.print(mapChar);
                    }
                    counter++;
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Nu se poate incarca harta.");
        }
    }
}
