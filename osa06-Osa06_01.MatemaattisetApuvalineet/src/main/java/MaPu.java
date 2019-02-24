
import java.util.ArrayList;

public class MaPu {

    // toteuta apumetodit tänne
    
    public static double keskiarvo(ArrayList<Integer> Luvut) {
        
        int summa = 0;
        
        for (int luku: Luvut) {
            summa += luku;
        }
        
        return summa / (double)Luvut.size();
        
    }
    
}
