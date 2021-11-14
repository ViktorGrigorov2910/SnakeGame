import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameMenu extends JFrame implements ActionListener {
    static final int SCREEN_WIDTH = 800;
    static final int SCREEN_HEIGHT = 800;
    Image backgroundMenu;
    ImageIcon iconBackGRNDMenu;
    JLabel JlBackgrundImageMenu;
    GameMenu() {
        this.setLayout(null);

        backgroundMenu = getToolkit().getImage("F:\\Projects\\Snake\\src\\wp2409719.jpg");

        iconBackGRNDMenu = new ImageIcon(backgroundMenu);

        JlBackgrundImageMenu = new JLabel(iconBackGRNDMenu);

        JlBackgrundImageMenu.setBounds(0, 0, 800, 800);
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setFocusable(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

