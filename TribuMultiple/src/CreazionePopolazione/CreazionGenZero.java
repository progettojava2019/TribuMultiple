package CreazionePopolazione;

import Grafica.CostruisciGrafico;
import Grafica.MostraGrafico;

public class CreazionGenZero {


    public CreazionGenZero(){

        CreaSoggettiGenZero crea = new CreaSoggettiGenZero();

        crea.TribuCentrale("Maschi");
        crea.TribuCentrale("Femmine");

        crea.TribuLaterali("Maschi");
        crea.TribuLaterali("Femmine");


        new CostruisciGrafico();

    }
}
