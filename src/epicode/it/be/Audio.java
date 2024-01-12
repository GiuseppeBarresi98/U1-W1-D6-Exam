package epicode.it.be;

import Interface.Volume;

public class Audio extends ElementoMultimediale implements Volume {
    private int volume = 0;

    public Audio(String titolo,int durata) {
        super(titolo,durata);
    }

    @Override
    public void alzaVolume() {
       if(this.volume < 5){
           this.volume++;
           System.out.println("Hai aumentato il volume adesso e pari a" + this.volume);
       }

    }

    public void play() {
        System.out.println("------------------");
        ;
        for (int i = 0; i < getDurata(); i++) {
            System.out.printf(getTitolo());
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }

            if (i == getDurata() - 1) {
                break;
            } else {
                System.out.println(" ");
            }
        }
        System.out.println(" ");
        System.out.println("------------------");


    }



    @Override
    public void abbassaVolume() {
        if (this.volume > 0){
            this.volume--;
            System.out.println("Hai diminuito il volume di 1 adesso e pari a " + this.volume);
        }





    }
}
