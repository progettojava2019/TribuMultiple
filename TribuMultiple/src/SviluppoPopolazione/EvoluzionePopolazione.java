package SviluppoPopolazione;

import CreazionePopolazione.CreazioneSoggettiRandom;
import Utility.Data;
import Utility.*;

public class EvoluzionePopolazione {

    double distanzaMassima = Data.squareDimension * Math.sqrt(2); //distanza oltre la quale i soggetti non interagiscono tra loro

    public void nascitaFigli(Matrice m, Matrice f){
        for(int i = 0; i < m.getnRigheComplete(); i++) {
            for (int j = 0; j < f.getnRigheComplete(); j++) {

                float distanzaMF = new CalcolaDistanza().distanza(m.getElement(i,0), m.getElement(i,1), f.getElement(j,0), f.getElement(j,1));

                if (distanzaMF < distanzaMassima) {
                    try {
                        Data.matriceFigli.addRiga(f.getElement(j,0), f.getElement(j,1));
                        //System.out.println("È nato un figlio");
                    } catch (Exception e){
                        System.out.println("ALERT!!! Sovraffolamento, fai un po' di lotta");
                    }

                    Matrice nuovoMaschio = new Matrice(1,2);
                    nuovoMaschio = new CreazioneSoggettiRandom().crea(nuovoMaschio, 1);
                    Data.SubjectNumber++;
                    Data.matriceMaschi.sosituisciRiga(nuovoMaschio, i);

                    Matrice nuovaFemmina = new Matrice(1,2);
                    nuovaFemmina = new CreazioneSoggettiRandom().crea(nuovaFemmina, 1);
                    Data.SubjectNumber++;
                    Data.matriceFemmine.sosituisciRiga(nuovaFemmina, j);
                }
            }
        }
    }



    public void lottaSoggetti(Matrice mat, String s){
        for(int i = 0; i < mat.getnRigheComplete(); i++) {
            for (int j = 0; j < mat.getnRigheComplete(); j++) {

                float distanza = new CalcolaDistanza().distanza(
                        mat.getElement(i,0), mat.getElement(i,1), mat.getElement(j,0), mat.getElement(j,1));

                if(i != j && distanza < distanzaMassima){

                    if(s.equals("Maschi")){
                        //System.out.println("Sono morti due maschi");
                        Data.matriceMaschi.removeRiga(i);
                        Data.matriceMaschi.removeRiga(j-1);
                        i -= 1;
                        break;
                    }
                    else{
                        //System.out.println("Sono morte due femmine");
                        Data.matriceFemmine.removeRiga(i);
                        Data.matriceFemmine.removeRiga(j-1);
                        i -= 1;
                        break;
                    }

                }

            }
        }
    }



    public void crescitaFigli (Matrice figli){

        for (int i = 0; i < figli.getnRigheComplete(); i++){
            double random = Math.random();
            if(random <= 0.5) {
                //System.out.println("È femminaaaa!!!!!");
                Data.matriceFemmine.addRiga(figli.getElement(i, 0), figli.getElement(i, 1));
            }
            else{
                //System.out.println("È maschiooooo!!!!!");
                Data.matriceMaschi.addRiga(figli.getElement(i, 0), figli.getElement(i, 1));
            }
        }

        Data.matriceFigli.clearMatrice();
    }


}
