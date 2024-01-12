package epicode.it.be;

import Interface.Luminosità;

public class Immagine extends ElementoMultimediale implements Luminosità {
      private int luminosita = 0;
    public Immagine(String titolo) {
        super(titolo);
    }

    @Override
    public void alzaLuminosita() {
        if(this.luminosita < 5) {
            this.luminosita++;
            System.out.println("Hai aumentato la luminosita a " + this.luminosita);
        }
    }

    public void show(){
        System.out.println("Titolo file:" + getTitolo());
        for(int i=0;i < luminosita;i++){
            System.out.print("*");
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
