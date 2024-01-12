package epicode.it.be;

import Interface.Luminosità;
import Interface.Volume;

public class Video extends ElementoMultimediale implements Volume, Luminosità {
    private int volume = 0;
    private int luminosita =  0;

    public Video(String titolo, int durata) {
        super(titolo,durata);

    }

    public void play() {
        System.out.println("------------------");
        ;
        for (int i = 0; i < getDurata(); i++) {
            System.out.printf(getTitolo());
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            for (int j = 0; j < luminosita; j++) {
                System.out.print("*");
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
    public void alzaVolume() {
        if(this.volume < 5){
            this.volume++;
            System.out.println("Hai aumentato il volume adesso e pari a" + this.volume);
        }
    }



    @Override
    public void abbassaVolume() {
        if (this.volume > 0){
            this.volume--;
            System.out.println("Hai diminuito il volume di 1 adesso e pari a " + this.volume);
        }

    }

    @Override
    public void alzaLuminosita() {
        if(this.luminosita < 5) {
            this.luminosita++;
            System.out.println("Hai aumentato la luminosita a " + this.luminosita);
        }

    }

    @Override
    public void abbassaLuminosita() {
        if(this.luminosita > 0) {
            this.luminosita--;
            System.out.println("Hai diminuito la luminosita a " + this.luminosita);
        }
    }
}
