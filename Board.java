import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.awt.GridLayout;
import java.awt.Color;

public class Board extends JFrame{
    public static final String title = "MY CHESS BOARD";
    public ArrayList<JButton> cells;
    Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

    int screenwidth = (int)size.getWidth();
    int screenheight = (int)size.getHeight();

    int boardsize = screenheight <= screenwidth ? screenheight:screenwidth;
    int normalizedboardsize = (int)(boardsize * 0.95);

    Board(){
        super(title);
        this.setSize(normalizedboardsize,normalizedboardsize);
        this.setVisible(true);
        this.setLayout(new GridLayout(8,8));
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.cells = new ArrayList<JButton>();
    }

    public void setBoard(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                JButton button = new JButton();
                button.setSize(boardsize/8, boardsize/8);
                if(i%2 == 0){
                    if(j%2 == 0){
                        button.setBackground(Color.LIGHT_GRAY);
                    }else{
                        button.setBackground(Color.WHITE);
                    }
                }else{
                    if(j%2 == 0){
                        button.setBackground(Color.WHITE);
                    }else{
                        button.setBackground(Color.LIGHT_GRAY);
                    }
                }
                this.add(button);
                cells.add(button);
            }
        }
        addAllPieces();
    }

    private void addAllPieces(){
        for(int i=0; i<cells.size(); i++){
            if(i/8 == 1){
                cells.get(i).setIcon(new ImageIcon("Images/Chess_pdt60.png"));
            }else if(i/8 == 6){
                cells.get(i).setIcon(new ImageIcon("Images/Chess_plt60.png"));
            }else if(i == 0){
                cells.get(i).setIcon(new ImageIcon("Images/Chess_rdt60.png"));
            }else if(i == 1){
                cells.get(i).setIcon(new ImageIcon("Images/Chess_ndt60.png"));
            }else if(i == 2){
                cells.get(i).setIcon(new ImageIcon("Images/Chess_bdt60.png"));
            }else if(i == 3){
                cells.get(i).setIcon(new ImageIcon("Images/Chess_qdt60.png"));
            }else if(i == 4){
                cells.get(i).setIcon(new ImageIcon("Images/Chess_kdt60.png"));
            }else if(i == 5){
                cells.get(i).setIcon(new ImageIcon("Images/Chess_bdt60.png"));
            }else if(i == 6){
                cells.get(i).setIcon(new ImageIcon("Images/Chess_ndt60.png"));
            }else if(i == 7){
                cells.get(i).setIcon(new ImageIcon("Images/Chess_rdt60.png"));
            }else if(i == 56){
                cells.get(i).setIcon(new ImageIcon("Images/Chess_rlt60.png"));
            }else if(i == 57){
                cells.get(i).setIcon(new ImageIcon("Images/Chess_nlt60.png"));
            }else if(i == 58){
                cells.get(i).setIcon(new ImageIcon("Images/Chess_blt60.png"));
            }else if(i == 59){
                cells.get(i).setIcon(new ImageIcon("Images/Chess_qlt60.png"));
            }else if(i == 60){
                cells.get(i).setIcon(new ImageIcon("Images/Chess_klt60.png"));
            }else if(i == 61){
                cells.get(i).setIcon(new ImageIcon("Images/Chess_blt60.png"));
            }else if(i == 62){
                cells.get(i).setIcon(new ImageIcon("Images/Chess_nlt60.png"));
            }else if(i == 63){
                cells.get(i).setIcon(new ImageIcon("Images/Chess_rlt60.png"));
            }
        }
    }

}