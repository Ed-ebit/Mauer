public class Rechteck {

    public static void main(String[] args) {

       int x = utils.IOTools.readInteger("Bitte Länge der x-Achse in ganzen Zahlen:");
       int y = utils.IOTools.readInteger("Bitte Länge der y-Achse in ganzen Zahlen:");
       System.out.println();

       for (int i = 1; i<= y; i++) {

           for (int j = 1; j <= x; j++) {
               System.out.print("  +");
           }
           System.out.println();
       }
       }

    }
