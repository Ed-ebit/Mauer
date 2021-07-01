public class Mauer {

    public static void main(String[] args) {
	// Einer Methode wird die Höhe einer Mauer übergeben, die Methode gibt die benötigte Anzahl von Steinen zurück.
    // Die Mauer läuft in Form einer halben Pyramide spitz zu , die Breite ergibt sich also aus der Höhe.
    //Mauerplan

    //Höhe 1 - 1 Stein
    // Höhe 2 -3 Steine

        //Lösung1

        int zahl = bauemauer(8);
        System.out.println(zahl);

        // Lösung2
//        int höhe;
//
//        höhe = utils.IOPaneTools.readInteger("Bitte Höhe der gewünschten Mauer in ganzzahligen Steinen angeben: ");
//
//        System.out.print(" Sie benötigen " + anzahlSteine(höhe) + " Steine für eine Mauer in Höhe von " + höhe + " Steinen.");
    }

    private static int bauemauer(int hoehe) {
        int anzahl = 0;
        for (int j = 1; j <= hoehe ; j++) {
            anzahl+=j;
        }
        return anzahl;
    }

    private static int anzahlSteine(int höhe){
        int steine = (höhe*höhe+höhe)/2;
        return steine;

    }
}
