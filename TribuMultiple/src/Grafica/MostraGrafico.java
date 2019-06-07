package Grafica;

import Grafica.Soggetti.*;
import Utility.Matrice;

import javax.swing.*;
import java.awt.*;

import static Utility.Data.gridHeigth;
import static Utility.Data.gridWidth;

public class MostraGrafico {

    private Pannello pannello = new Pannello();

    public void riempiGrafico(Matrice mat, String str, JFrame fr){

        //Container c = fr.getContentPane();

        for(int i = 0; i < mat.getnRigheComplete(); i++) {
            if (str.equals("Maschi")) {
                Maschio maschio = new Maschio(mat.getElement(i, 0), mat.getElement(i, 1));
                pannello.add(maschio);
            } else if (str.equals("Femmine")) {
                Femmina femmina = new Femmina(mat.getElement(i, 0), mat.getElement(i, 1));
                pannello.add(femmina);
            } else if (str.equals("Figli")) {
                Figlio figlio = new Figlio(mat.getElement(i, 0), mat.getElement(i, 1));
                pannello.add(figlio);
            }
        }
        fr.add(pannello);


        fr.setBounds(400, 200, gridWidth + 2, gridHeigth + 110);
        fr.setMinimumSize(new Dimension(gridWidth + 2, gridHeigth + 110));
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
