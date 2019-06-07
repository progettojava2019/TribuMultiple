import CreazionePopolazione.CreazionGenZero;
import SviluppoPopolazione.CrescitaFigli;
import SviluppoPopolazione.InterazioneInterSex;
import SviluppoPopolazione.InterazioneIntraSex;

import static Utility.Data.SubjectNumber;

public class Simulazione extends Thread{

    public static Thread t;

    public Simulazione() {

        System.out.println("Creazione popolazione");
        new CreazionGenZero();

        t = new Thread(this, "Primo Thread");
        t.run();
    }



    @Override
    public void run(){
        try {

            while (true) {

                    System.out.println("Interazione tra maschi e femmine");
                    new InterazioneInterSex();//potremmo chiamarla InterazioneInterSex
                    Thread.sleep(1000);

                    System.out.println("Interazione tra maschi e tra femmine");
                    new InterazioneIntraSex();//potremmo chiamarla InterazioneIntraSex
                    Thread.sleep(1000);

                    System.out.println("Crescita figli");
                    new CrescitaFigli();//potremmo chiamarla CrescitaFigli
                    Thread.sleep(1000);

            }

        } catch (Exception e) {
            System.out.println("Thread ha lanciato un'eccezione");
        }

    }
}