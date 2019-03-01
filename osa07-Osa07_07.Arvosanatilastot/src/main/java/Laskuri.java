import java.util.ArrayList;

public class Laskuri {
    
    private ArrayList<Integer> pisteet;
    
    public Laskuri() {
        pisteet = new ArrayList<>();
    }
    
    public double keskiarvo(int jaettava, int jakaja) {
        
        double keskiarvo = 0;
        
        keskiarvo = (double)jaettava / jakaja;
        
        if (jaettava == 0) {
            keskiarvo = 0;
        }
            return keskiarvo;
    }
    
    public void lisaa(int luku) {
        pisteet.add(luku);
    }
    
    public String tahtiTehdas(int arvosana) {
        
        String tahti = "";
        
        for (int i = 0; i < arvosana; i++) {
            tahti += "*";
        }
        
        return tahti;
        
    }
    

    
}