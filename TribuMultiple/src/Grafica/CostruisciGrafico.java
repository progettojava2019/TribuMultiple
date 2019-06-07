package Grafica;

import Utility.Data;

public class CostruisciGrafico {

    private MostraGrafico grafico = new MostraGrafico();

    public CostruisciGrafico() {

        grafico.riempiGrafico(Data.matriceMaschi, "Maschi", Data.frame);

        grafico.riempiGrafico(Data.matriceFemmine, "Femmine", Data.frame);

        if(Data.matriceFigli.getnRigheComplete() !=0)
            grafico.riempiGrafico(Data.matriceFigli, "Figli", Data.frame);

    }
}
