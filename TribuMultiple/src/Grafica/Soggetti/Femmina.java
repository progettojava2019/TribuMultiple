package Grafica.Soggetti;

import java.awt.*;

import static Utility.Data.squareDimension;

public class Femmina implements Soggetto {

    private int x;
    private int y;

    public Femmina(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void Disegna(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, squareDimension, squareDimension);
    }
}
