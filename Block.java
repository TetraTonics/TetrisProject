import java.awt.Color;
import java.awt.Graphics;

public class Block
{
  private int xPos;
  private int yPos;
  private int width;
  private int height;

  private Color color;

  public Block() //defaults
  {
    xPos = 150;
    yPos = 150;
    width = 50;
    height = 50;

    color = Color.BLACK; //r: 0, g: 0, b: 0
  }

  public Block(int x, int y) //xPos, yPos
  {
    xPos = x;
    yPos = y;
    width = 50;
    height = 50;

    color = Color.BLACK;
  }

  public Block(int x, int y, int w, int h) //xPos, yPos, width, height
  {
    xPos = x;
    yPos = y;
    width = w;
    height = h;

    color = Color.BLACK;
  }
        
  public Block(int x, int y, int w, int h, Color c) //xPos, yPos, width, height, color
  {
    xPos = x;
    yPos = y;
    width = w;
    height = h;

    color = c;
  }
        
  //add the other set methods
  public void setX(int x)
  { xPos = x; }

  public void setY(int y)
  { yPos = y; }

  public void setWidth(int w)
  { width = w; }  

  public void setHeight(int h)
  { height = h; }

  public void setPos(int x, int y)
  { 
    xPos = x;
    yPos = y;
  }

  public void setColor(Color col)
  { color = col; }

  public void draw(Graphics window)
  {
    //uncomment after you write the set and get methods
    window.setColor(color);
    window.fillRect(getX(), getY(), getWidth(), getHeight());
  }

  public void draw(Graphics window, Color col)
  {
    window.setColor(col);
    window.fillRect(getX(), getY(), getWidth(), getHeight());
  }

  //add the other get methods
  public int getX()
  { return xPos; }  
    
  public int getY()
  { return yPos; } 

  public int getWidth()
  { return width; }   

  public int getHeight()
  { return height; }

  public Color getColor()
  { return color; }

  //add a toString() method  - x , y , width, height, color
  public String toString()
  {
    return String.format("%s, %s, %s, %s, %s", getX(), getY(), getWidth(), getHeight(), getColor());
  }
}