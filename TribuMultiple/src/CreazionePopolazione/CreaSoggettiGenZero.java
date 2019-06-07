package CreazionePopolazione;

import Utility.Data;
import Utility.MatriceSceriffo;
import Utility.Random;

import static Utility.Data.*;

public class CreaSoggettiGenZero {

    private MatriceSceriffo matriceSceriffo = new MatriceSceriffo();

    //In questo modo c'è spazio per 50 soggetti per ogni sottoGriglia --> Numero max soggetti 50 * 8 = 400
    //N.B.: la porzione centrale è composta da 4 sottoGriglie
    private int heigthSubGrid = (5 * squareDimension); //altezza di ciascuna sottoGriglia
    private int widthSubGrid = 2 * heigthSubGrid; //larghezza totale di ciascuna sottoGriglia

    //Crea soggetti nella zona centrale
    public void TribuCentrale(String string){

        //Range per Width
        int subGridStartW  = gridWidth/2 - widthSubGrid;
        int subGridEndW  = gridWidth/2 + (widthSubGrid - squareDimension);

        //Range per Heigth
        int subGridStartH = Data.gridHeigth/2 - heigthSubGrid;
        int subGridEndH = Data.gridHeigth/2 + (heigthSubGrid-squareDimension);


        int numeroSoggetti = (SubjectNumber/2); // metà dei soggetti si trovano nella porzione centrale
        numeroSoggetti = numeroSoggetti/2; //metà maschi e metà femmine
        for(int i = 0; i < numeroSoggetti; i++){

            int x = new Random().randomizza(subGridStartW, subGridEndW);
            int y = new Random().randomizza(subGridStartH, subGridEndH);

            i = verifica(x, y, i, string); //controlla che i soggetti non si sovrappongano

        }

    }



    public void TribuLaterali(String str){


        //System.out.println(heigthSubGrid*squareDimension);
        //System.out.println(widthSubGrid * squareDimension);

        // metà dei soggetti si trovano nelle porzioni laterali
        int numeroSoggetti = SubjectNumber/2;// 2/3 dei soggetti si dividono nei rettangoli esterni
        numeroSoggetti = numeroSoggetti/4;// 1/4 dei 2/3 si trova qui
        numeroSoggetti = numeroSoggetti/2;// metà maschi e metà femmine
        System.out.println("Numero maschi/femmine per porzione = " + numeroSoggetti);

        //porzione in alto a sinistra
        for(int i = 0; i < numeroSoggetti; i++){

            int widthSubGridStart = 0;
            int widthSubGridEnd = widthSubGrid - squareDimension;
            int x1 = new Random().randomizza(widthSubGridStart, widthSubGridEnd);

            int heigthSubGridStart = 0;
            int heigthSubGridEnd = heigthSubGrid - squareDimension;
            int y1 = new Random().randomizza(heigthSubGridStart, heigthSubGridEnd);

            i = verifica(x1, y1, i, str);

            System.out.println("Larghezza subGrid = " + widthSubGridStart + " - " + widthSubGridEnd);
            System.out.println("Altezza subGrid = " + heigthSubGridStart + " - " + heigthSubGridEnd);
        }


        //porzione in alto a destra
        for(int j = 0; j < numeroSoggetti; j++){

            int widthSubGridStart = gridWidth - widthSubGrid;
            int widthSubGridEnd = Data.gridWidth - squareDimension;
            int x2 = new Random().randomizza(widthSubGridStart, widthSubGridEnd);

            int heigthSubGridStart = 0;
            int heigthSubGridEnd = heigthSubGrid - squareDimension;
            int y2 = new Random().randomizza(heigthSubGridStart, heigthSubGridEnd);

            j = verifica(x2, y2, j, str);

            System.out.println("Larghezza subGrid = " + widthSubGridStart + " - " + widthSubGridEnd);
            System.out.println("Altezza subGrid = " + heigthSubGridStart + " - " + heigthSubGridEnd);
        }


        //porzione in basso a sinistra
        for(int k = 0; k < numeroSoggetti; k++){

            int widthSubGridStart = 0;
            int widthSubGridEnd = widthSubGrid - squareDimension;
            int x3 = new Random().randomizza(widthSubGridStart, widthSubGridEnd);

            int heigthSubGridStart = gridHeigth - heigthSubGrid;
            int heigthSubGridEnd = gridHeigth - squareDimension;
            int y3 = new Random().randomizza(heigthSubGridStart, heigthSubGridEnd);

            k = verifica(x3, y3, k, str);

            System.out.println("Larghezza subGrid = " + widthSubGridStart + " - " + widthSubGridEnd);
            System.out.println("Altezza subGrid = " + heigthSubGridStart + " - " + heigthSubGridEnd);
        }

        //porzione in basso a destra
        for(int l = 0; l < numeroSoggetti; l++){

            int widthSubGridStart = gridWidth - widthSubGrid;
            int widthSubGridEnd = Data.gridWidth - squareDimension;
            int x4 = new Random().randomizza(widthSubGridStart, widthSubGridEnd);

            int heigthSubGridStart = gridHeigth - heigthSubGrid;
            int heigthSubGridEnd = gridHeigth - squareDimension;
            int y4 = new Random().randomizza(heigthSubGridStart, heigthSubGridEnd);

            l = verifica(x4, y4, l, str);

            System.out.println("Larghezza subGrid = " + widthSubGridStart + " - " + widthSubGridEnd);
            System.out.println("Altezza subGrid = " + heigthSubGridStart + " - " + heigthSubGridEnd);
        }


    }



    public int verifica(int x, int y, int numIterazione, String s){

        boolean controllore = true;
        controllore = new MatriceSceriffo().controlla(x, y, controllore);
        if(controllore && s.equals("Maschi")){
            matriceMaschi.addRiga(x, y);
            matriceSceriffo.addRiga(x,y);
        } else if(controllore && s.equals("Femmine")){
            matriceFemmine.addRiga(x, y);
            matriceSceriffo.addRiga(x,y);
        }
        else{
            System.out.println("Sono uno sceriffo e ho fatto il mio lavoro");
            numIterazione -= 1;
        }
        return numIterazione;
    }




}

