import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Board extends JFrame{
    public static final String title = "MY CHESS BOARD";
    Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    Board(){
        super(title);
        this.setSize(size);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}