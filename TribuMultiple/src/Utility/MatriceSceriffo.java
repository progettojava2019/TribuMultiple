package Utility;

import static Utility.Data.matriceMaschi;
import static Utility.Data.matriceFemmine;
import static Utility.Data.matriceFigli;

public class MatriceSceriffo extends Matrice{

    private Matrice matriceDiControllo;

    public MatriceSceriffo(){

        int nR1 = matriceMaschi.getnRigheComplete();
        int nR2 = matriceFemmine.getnRigheComplete();
        int nR3 = matriceFigli.getnRigheComplete();

        int numRighe =  nR1 + nR2 + nR3;

        matriceDiControllo = new Matrice(numRighe,2);
        for(int i = 0; i < nR1; i++){
            matriceDiControllo.addRiga(matriceMaschi.getElement(i,0), matriceMaschi.getElement(i,1));
        }
        for(int j = 0; j < nR2; j++){
            matriceDiControllo.addRiga(matriceFemmine.getElement(j,0), matriceFemmine.getElement(j,1));
        }
        for(int k = 0; k < nR3; k++){
            matriceDiControllo.addRiga(matriceFigli.getElement(k,0), matriceFigli.getElement(k,1));
        }
    }


    public boolean controlla(int x, int y, boolean b) {

        for (int k = 0; k < matriceDiControllo.getnRigheComplete(); k++) {
            if (x == matriceDiControllo.getElement(k, 0) && y == matriceDiControllo.getElement(k, 1)) {
                b = false;
            }
        }
        return b;
    }
}
