import java.awt.*;
import javax.swing.*;

public class flappyBird extends JPanel {
    int boardWidth = 360;
    int boardHeight = 640;

    flappyBird() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.blue);
    }
}