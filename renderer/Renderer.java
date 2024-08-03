package renderer;

import math.Calculation;

import java.awt.*;

public class Renderer {
    private double[][] data;
    private int sizeX, sizeY;
    private float epsilon = 0.1f;

    public Renderer(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;

        data = new double[sizeY][sizeX];
    }

    private void calculate(float t) {
        for (int i = 0; i < sizeY; i++) { //Row
            for (int j = 0; j < sizeX; j++) { //Col
                data[i][j] = Calculation.eval(
                        j / (sizeY + 0f) - 0.7f,
                        i / (sizeY + 0f) - 0.4f, t);
            }
        }
    }

    public void render(Graphics g, float t) {
        calculate(t);

        for (int i = 0; i < sizeY; i++) { //Row
            for (int j = 0; j < sizeX; j++) { //Col
                int c = Color.HSBtoRGB(
                        (float) data[i][j],
                        (float) Math.signum(data[i][j]),
                        1 - (float) (Math.sin(data[i][j]) + 1) * 0.5f
//                        1 - data[i][j]/100

                );

                g.setColor(new Color(c));

                g.fillRect(j * 3, i * 3, 3, 3);
            }
        }

//        g.drawString("Hello world!", 100, 100);
    }
}
