package maatila;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Maitosailio sailio = new Maitosailio();
        Maatila tila = new Maatila("pekka", new Navetta( sailio ));
        tila.asennaNavettaanLypsyrobotti( new Lypsyrobotti() );
        tila.lisaaLehma( new Lehma("Lehmä 1") );
        tila.lisaaLehma( new Lehma("Lehmä 2") );
        tila.lisaaLehma( new Lehma("Lehmä 3") );
        tila.lisaaLehma( new Lehma("Lehmä 4") );
        tila.lisaaLehma( new Lehma("Lehmä 5") );
        tila.eleleTunti();
        
        System.out.println(tila);
    }
}
