import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JPanel;

public class board extends JPanel {
    int numColumns = 16;
    int numRows = 16;
    int height = 800;
    int width = 800;
    int cellSizeX = height / numRows;
    int cellSizeY = width / numColumns;
    Graphics g;
    Color c;
    posistion p;
    key k;

    public board() {
        p = new posistion();
        this.k = new key();
        initBoard();
    }

    private void initBoard() {
        setPreferredSize(new Dimension(this.height, this.width));
    }

    public void setColor(Color color) {
        this.c = color;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        for (int i = 0; i < this.numColumns; i++) {
            for (int k = 0; k < this.numRows; k++) {
                if (this.p.getActive(k) == true) {
                    g.setColor(Color.BLUE);
                }
                g.fillRect((this.width / this.numColumns) * k, (this.height / this.numRows) * i, this.cellSizeX,
                this.cellSizeY);
            }
        }
        for (int i = 0; i < this.numColumns; i++) {
            for (int k = 0; k < this.numRows; k++) {
                g.setColor(Color.BLACK);
                g.drawRect((this.width / this.numColumns) * i, (this.height / this.numRows) * k, this.cellSizeX,
                        this.cellSizeY);
            }
        }
    }
    public class key extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                p.setActive(2);
                System.out.println("the up key was pressed");
                repaint();
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                System.out.println("the down key was pressed");
                repaint();
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                System.out.println("the right key was pressed");
                repaint();
            } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                System.out.println("the left key was pressed");
                repaint();
            }
            
    
        }
    
        @Override
        public void keyReleased(KeyEvent e) {
            // TODO Auto-generated method stub
    
        }
    
        @Override
        public void keyTyped(KeyEvent e) {
            // TODO Auto-generated method stub
    
        }
    }

}
