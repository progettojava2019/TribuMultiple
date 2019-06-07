package Grafica;

import Grafica.Soggetti.Soggetto;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static Utility.Data.*;

public class Pannello extends JPanel {

    private List<Soggetto> soggetto = new ArrayList<>();

    public void add(Soggetto s){
        soggetto.add(s);
        repaint();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);

        //linee verticali della griglia
        g.setColor(Color.LIGHT_GRAY);
        for (int i = 0; i <= gridWidth; i += squareDimension) {
            g.drawLine(i, 0, i, gridHeigth);
        }
        //linee orizzontali della griglia
        for (int j = 0; j <= gridHeigth; j += squareDimension) {
            g.drawLine(0, j, gridWidth, j);
        }
        g.setColor(Color.BLACK);
        g.drawLine(gridWidth/2, 0, gridWidth/2, gridHeigth);
        g.drawLine(0, gridHeigth/2, gridWidth, gridHeigth/2);


        try {
            for (Soggetto s : soggetto) {
                s.Disegna(g);
            }
        }catch (Exception e){
            System.out.println("Eccezione catturata nella classe Pannello");
        }


    }

}

