package window;

import renderer.Renderer;

import javax.swing.*;
import java.awt.*;

public class Window extends JPanel {
    private int sizeX, sizeY;
    private String title;

    private JFrame frame;
    private float t = 0;

    private Renderer renderer;

    public Window(String title, int sizeX, int sizeY) {
        renderer = new Renderer(sizeX, sizeY);

        frame = new JFrame(title);
        frame.setSize(sizeX, sizeY);

        frame.setUndecorated(true);
        frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.add(this);

        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        t += 0.001f;

        renderer.render(g, t);

        repaint();
    }
}
