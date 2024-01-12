import epicode.it.be.Audio;
import epicode.it.be.ElementoMultimediale;
import epicode.it.be.Immagine;
import epicode.it.be.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Video audio1 = new Video( "ciao",10);

        //Qui si puo provare la funzionalita audio e luminosità istanziando nuovi oggetti(audio,video o img)
        audio1.play();
        audio1.alzaVolume();audio1.alzaVolume();
        audio1.alzaLuminosita();

        audio1.alzaLuminosita();
        audio1.play();

        ElementoMultimediale[] collezione = new ElementoMultimediale[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < collezione.length; i++) {
            System.out.print("Scegli il tipo di file (1-Audio, 2-Immagine, 3-Video): ");
            int tipoFile = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Titolo del file " + (i + 1) + ": ");
            String titolo = scanner.nextLine();

            switch (tipoFile) {
                case 1:
                    System.out.print("Durata dell'audio: ");
                    int durataAudio = scanner.nextInt();
                    scanner.nextLine();
                    collezione[i] = new Audio(titolo, durataAudio);
                    break;
                case 2:
                    collezione[i] = new Immagine(titolo);
                    break;
                case 3:
                    System.out.print("Durata del video: ");
                    int durataVideo = scanner.nextInt();
                    scanner.nextLine();
                    collezione[i] = new Video(titolo, durataVideo);
                    break;
                default:
                    System.out.println("Scelta non valida");
                    i--;
            }
        }

        System.out.println("Dati dei file inseriti:");
        for (int i = 0; i < collezione.length; i++) {
            System.out.println(collezione[i]);
        }


        int fileDaRiprodurre;
        do {
            System.out.print("Scegli il file da riprodurre (1-" + collezione.length + "): ");
            fileDaRiprodurre = scanner.nextInt();

            if (fileDaRiprodurre < 1 || fileDaRiprodurre > collezione.length) {
                System.out.println("Scelta non valida. Riprova.");
            }
        } while (fileDaRiprodurre < 1 || fileDaRiprodurre > collezione.length);

        ElementoMultimediale fileCorrente = collezione[fileDaRiprodurre - 1];
        System.out.println("File selezionato: " + fileCorrente);


        if (fileCorrente instanceof Audio || fileCorrente instanceof Video) {

            ((ElementoMultimediale) fileCorrente).play();
        } else if (fileCorrente instanceof Immagine) {

            ((Immagine) fileCorrente).show();
        } else {
            System.out.println("Tipo di elemento multimediale non supportato");
        }


        scanner.close();


    }
}