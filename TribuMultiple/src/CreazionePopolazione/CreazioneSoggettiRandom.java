package CreazionePopolazione;

import Utility.Matrice;
import Utility.MatriceSceriffo;
import Utility.Random;

import static Utility.Data.*;

public class CreazioneSoggettiRandom {

    public Matrice crea(Matrice mat, int numSoggetti){

        MatriceSceriffo matriceSceriffo = new MatriceSceriffo();


        for(int i = 0; i < numSoggetti; i++) {

            int x = new Random().randomizza(0, gridWidth - squareDimension);
            int y = new Random().randomizza(0, gridHeigth - squareDimension);

            boolean controllore = true;
            controllore = new MatriceSceriffo().controlla(x, y, controllore);
            if (controllore) {
                mat.addRiga(x, y);
                matriceSceriffo.addRiga(x, y);
            } else {
                System.out.println("Sono uno sceriffo e ho fatto il mio lavoro");
                i -= 1;
            }
        }
        return mat;
    }
}
