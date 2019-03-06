import java.util.Set;
import java.util.HashSet;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia
        Set<String> nimet = new HashSet<>();
        nimet.add("eka");
        nimet.add("eka");
        nimet.add("toka");
        nimet.add("toka");
        nimet.add("toka");

        System.out.println(palautaKoko(nimet));
    }
    
    public static int palautaKoko(Set set) {
        return set.size();
    }

    // toteuta tänne metodi palautaKoko, joka palauttaa parametrina 
    // saamansa set-olion alkioiden lukumäärän

}
