package core.basesyntax.gui.screen;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class HomeScreen extends JFrame {
    public HomeScreen() {
        super("Mafia assistant");
        super.setSize(800, 500);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(3, 1, 2, 2));

        JLabel title = new JLabel("Mafia assistant", SwingConstants.CENTER);
        title.setSize(100, 100);
        
        container.add(title);
    }
}
