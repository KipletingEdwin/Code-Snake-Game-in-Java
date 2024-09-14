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

        //Snake
        snakeHead = new Tile(5,5);

        //Food
        Tile food;
    }

    public  void  paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public  void  draw(Graphics g){
        //Grid
        for(int i = 0; i < boardWidth/tileSize; i++){
            //(x1, y2, x2, y2)
            g.drawLine(i*tileSize,0,i*tileSize,boardHeight);
            g.drawLine(0,i*tileSize,boardWidth,i*tileSize);
        }
        //Snake
        g.setColor(Color.green);
        g.fillRect(snakeHead.x * tileSize, snakeHead.y * tileSize,tileSize,tileSize);
    }


}
