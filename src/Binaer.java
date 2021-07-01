public class Binaer {

    // aus einer Binärzahl eine Dezimalzahl erzeugen
    // 1. Methode boolean isBinary (String Binaär) - true or false, ob die binär ist hab ich gefragt!!!
    // 2. Methode int binaerToDecimal (String binaer)

    public static boolean isBinary(String binaer) { //Ziel: 4 verschiedene Lösungen! + Hexadez.
        for (int i = 0; i < binaer.length(); i++) {
            if (binaer.charAt(i) == '0' || binaer.charAt(i) == '1') {
            } else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
//        String binaer = "10111111";
        String binaer = utils.IOTools.readLine("Bitte geben Sie eine Binärzahl (ohne Leerzeichen) ein: ");

        if (isBinary(binaer)) {
            int wert = binaerToDecimal(binaer);
            System.out.printf("Der Binärwert %s ergibt dezimal %d.", binaer, wert);
        } else {
            System.out.println(binaer + " ist keine Binärzahl");
        }

    }

    static int binaerToDecimal(String binaer) {
//        int i = binaer.length()-1;
//        int j = 0;
//        double dezwert = 0;
//        while (i >= 0){
//            if (binaer.charAt(i) == '0'){
//            }
//            else{
//                dezwert += Math.pow(2, j);
//            }
//            i--;
//            j++;
//        }
//        int wert = (int) dezwert;
//        return wert;

        int ergebnis = 0;
        for (int i = 0; i <= binaer.length() - 1; i++) {
            ergebnis = ergebnis * 2 + (binaer.charAt(i) - 48);
//            int zeichen = binaer.charAt(j)-48; /*('0')*/
//            ergebnis = ergebnis*2 + zeichen;
        }
        return ergebnis;

    }
}

