
import java.util.ArrayList;
import java.util.Random;

public class Lottorivi {

    private ArrayList<Integer> numerot;
    private Random r;

    public Lottorivi() {
        this.numerot = new ArrayList<>();
        this.r = new Random();
        this.arvoNumerot();
    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
    }

    public void arvoNumerot() {
        // Alustetaan lista numeroille
        this.numerot = new ArrayList<>();
        // Kirjoita numeroiden arvonta tänne
        // kannattanee hyödyntää metodia sisaltaaNumeron
        for (int i = 0; i < 7; i++) {
            
            int randVal = r.nextInt(40) + 1;
            
            if (!sisaltaaNumeron(randVal)) {
                this.numerot.add(randVal);
            } else {
                i--;
            }
            
            
        }
    }

    public boolean sisaltaaNumeron(int numero) {
        
        if (this.numerot.contains(numero)) {
            return true;
        } else {
            return false;
        }
        
    }
}
