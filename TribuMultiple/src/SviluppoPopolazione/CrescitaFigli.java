package SviluppoPopolazione;

import Grafica.CostruisciGrafico;
import Utility.Data;

//i figli diventano maschi o femmini in maniera random, con la stessa probabilità


//////////////////////
///Potremmo rendere selezionabile anche la probabilità con cui nascono maschi o femmine
//////////////////////



public class CrescitaFigli {

    public CrescitaFigli() {

        new EvoluzionePopolazione().crescitaFigli(Data.matriceFigli);

        new CostruisciGrafico();

    }

}