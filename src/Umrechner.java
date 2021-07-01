/*
import utils.IOTools;

public class Umrechner {

    public static void main(String[] args) {

        methodeHauptMenue();


    }

    private static void methodeHauptMenue() {

        do{
            int anfEinheit, zielEinheit;
            anfEinheit = IOTools.readInteger( "Der gute Temperaturumrechner\n" +
                    "Bitte geben Sie ein, aus welcher Temperatureinheit umgerechnet werden soll:\n" +
                    "Celsius:    1\n" +
                    "Kelvin:     2\n" +
                    "Fahrenheit: 3\n" +
                    "Beenden:    0\n" +
                    "Eingabe: ");

            if(anfEinheit == 0) {
                break;
            }
            else {
                methodeinCelsius(anfEinheit);
                methodeZieleinheit();

                break;
            }


        }while(true);

    }

    private static float methodeinCelsius(int anfEinheit) {
        // Umrechnung auf Basiswert Celsius
        float temp = utils.IOTools.readInteger("Bite geben Sie die Höhe der umzurechnenden Temperatur an: ");
        float celsius;
        switch(anfEinheit){
            case 1: {
                celsius = anfEinheit;
                break;
            }
            case 2: {
                celsius = (float) (anfEinheit - 273.15);
                break;
            }
            case 3: {
                celsius = (float) (anfEinheit - 32 /1.8);
                break;
            }

        }

    }
    private static void methodeZieleinheit(int zielEinheit) {
        float ergebnis;
        zielEinheit = IOTools.readInteger("Bitte geben Sie ein, in welche Einheit umgerechnet werden soll:\n" +
                "Celsius:    1\n" +
                "Kelvin:     2\n" +
                "Fahrenheit: 3\n" +
                "Beenden:    0\n" +
                "Eingabe: ");
        if(zielEinheit == 0) {
            return;
        }
        else{
            switch (zielEinheit) {
                case 1: {
                    //Celsius als Ziel
                    ergebnis = celsius;
                    break;
                }
                case 2: {
                    //Kelvin als Ziel
                    ergebnis = celsius +273.15;
                    break;
                }
                case 3: {
                    //Fahrenheit als Ziel
                    ergebnis = celsius+1.8 +32;
                    break;
                }
            }
        }


    }
}
*/
