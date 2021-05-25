import javax.swing.JFrame;
import java.awt.Component;

public class TheGame extends JFrame
{
  private static final int WIDTH = 1000;
  private static final int HEIGHT = 800;
  private Tetris game;

  public TheGame()
  {
    super("TETRIS");
  
    setSize(WIDTH,HEIGHT);

    game = new Tetris();

    ((Component)game).setFocusable(true);
    getContentPane().add(game);

    setVisible(true);
    setResizable(false);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static int getDefGameWidth()
  { return WIDTH; }

  public static int getDefGameHeight()
  { return HEIGHT; }

  public static void main( String args[] )
  {
    //TheGame run = new TheGame();
  }
}