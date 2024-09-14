import javax.swing.*;
import java.awt.*;

public class SnakeGame extends JPanel {

    private  class Tile{
        int x;
        int y;

        Tile(int x, int y){
            this.x = x;
            this.y = y;

        }
    }

    int boardWidth;
    int boardHeight;
    int tileSize = 25;

    Tile snakeHead;

    SnakeGame(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        setPreferredSize(new Dimension(this.boardWidth, this.boardHeight));
        setBackground(Color.black);

        snakeHead = new Tile(5,5);
    }

    public  void  paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public  void  draw(Graphics g){
        //Snake


    }


}
