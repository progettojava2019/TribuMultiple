package SviluppoPopolazione;

import Grafica.CostruisciGrafico;
import Utility.Data;

//maschi interagiscono tra loro e femmine interagiscono tra loro. Se due maschi o due femmine si trovano
// in casella vicine della griglia si uccidono e spariscono dalla griglia
public class InterazioneIntraSex {

    public InterazioneIntraSex(){

        new EvoluzionePopolazione().lottaSoggetti(Data.matriceMaschi, "Maschi");
        new EvoluzionePopolazione().lottaSoggetti(Data.matriceFemmine, "Femmine");

        new CostruisciGrafico();
    }

}
