
import java.util.ArrayList;

public class Paaohjelma {

    public static void main(String[] args) {
        Ihminen eka = new Ihminen("Aku", 0);
        Ihminen toka = new Ihminen("Roope", 2147483647);
        System.out.println(eka.compareTo(toka));
        

        /*
         * Poista alla olevat kommentit, kun olet tehnyt compareTo metodin.
         */
        //Collections.sort(ihmisia);
    }
}
