package SviluppoPopolazione;

import Grafica.CostruisciGrafico;
import Utility.Data;

//maschi e femmine interagiscono. Se posti in casella vicine della griglia generano figli
public class InterazioneInterSex {

    public InterazioneInterSex(){

        new EvoluzionePopolazione().nascitaFigli(Data.matriceMaschi, Data.matriceFemmine);

        new CostruisciGrafico();
    }
}