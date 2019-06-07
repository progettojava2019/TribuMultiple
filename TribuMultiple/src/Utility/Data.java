package Utility;

import javax.swing.*;

public class Data {

    /*  Istanzio il frame in cui disegnare l'evoluzione della popolazione  */
    public final static JFrame frame = new JFrame("Sviluppo popolazione");


    public static final int gridWidth = 600;
    public static final int gridHeigth = 300;
    public final static int squareDimension = 10; //dimensioni del singolo quadratino della grglia


    /*
    Dati che dovranno essere presi da input
     */
    public static int SubjectNumber = 200;

    //In CreaSoggettiGenZero
    //private int heigthSubGrid = (5 * squareDimension); //altezza di ciascuna sottoGriglia
    //private int widthSubGrid = 2 * heigthSubGrid; //larghezza totale di ciascuna sottoGriglia

    /*
    */




    /*  Inzializzo le matrice di Maschi, Femmine e Figli  */

    public final static Matrice matriceMaschi = new Matrice(gridWidth*gridHeigth, 2);

    public final static Matrice matriceFemmine = new Matrice(gridWidth*gridHeigth, 2);

    public final static Matrice matriceFigli = new Matrice(gridWidth*gridHeigth, 2);


}
