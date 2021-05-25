import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.FontMetrics;

public class Tetris extends Canvas implements KeyListener, Runnable
{
  private boolean[] keys;
  private BufferedImage back;

  public Tetris()
  {
    //set up all variables related to the game

    keys = new boolean[4];

    setBackground(Color.BLACK);
    setVisible(true);
                
    new Thread(this).start();
    addKeyListener(this);//starts the key thread to log key strokes
  }
        
  public void update(Graphics window)
  {
    paint(window);
  }

  public void paint(Graphics window)
  {
    //set up the double buffering to make the game animation nice and smooth
    Graphics2D twoDGraph = (Graphics2D)window;

    //take a snap shot of the current screen and save it as an image
    //that is the exact same width and height as the current screen
    if (back == null)
      back = (BufferedImage)(createImage(getWidth(),getHeight()));

    //create a graphics reference to the back ground image
    //we will draw all changes on the background image
    Graphics graphToBack = back.createGraphics();

    Block t1 = new Block(100, 100, 30, 30, Color.MAGENTA);
    Block t2 = new Block(135, 100, 30, 30, Color.MAGENTA);
    Block t3 = new Block(170, 100, 30, 30, Color.MAGENTA);
    Block t4 = new Block(205, 100, 30, 30, Color.MAGENTA);
    t1.draw(graphToBack);
    t2.draw(graphToBack);
    t3.draw(graphToBack);
    t4.draw(graphToBack);
                
    twoDGraph.drawImage(back, null, 0, 0);
  }

  public void keyPressed(KeyEvent e)
  {
    switch(toUpperCase(e.getKeyChar()))
    {
    case 'W' : keys[0]=true; break;
    case 'Z' : keys[1]=true; break;
    case 'I' : keys[2]=true; break;
    case 'M' : keys[3]=true; break;
    }
  }

  public void keyReleased(KeyEvent e)
  {
    switch(toUpperCase(e.getKeyChar()))
    {
    case 'W' : keys[0]=false; break;
    case 'Z' : keys[1]=false; break;
    case 'I' : keys[2]=false; break;
    case 'M' : keys[3]=false; break;
    }
  }

  public void keyTyped(KeyEvent e){}
        
  public void run()
  {
    try
    {
      while(true)
      {
        Thread.currentThread().sleep(8);
        repaint();
      }
    }catch(Exception e)
    {
    }
  }     
}