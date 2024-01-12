package epicode.it.be;

public  class ElementoMultimediale {
   private String titolo;
   private int durata;


    public ElementoMultimediale(String titolo){
        this.titolo = titolo;

    }

    public  ElementoMultimediale(){}

    public ElementoMultimediale(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }


    public void play(){
        System.out.println("Avvio riproduzione di "+ titolo );
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getDurata() {
        return durata;
    }

    public String getTitolo() {
        return titolo;
    }

    @Override
    public String toString() {
        return "ElementoMultimediale{" +
                "titolo='" + titolo + '\'' +
                ", durata=" + durata +
                '}';
    }


}

