
import java.util.ArrayList;
import java.util.Collections;

public class Taikanelio {

    private int[][] nelio;

    // valmis konstruktori
    public Taikanelio(int koko) {
        if (koko < 2) {
            koko = 2;
        }

        this.nelio = new int[koko][koko];
    }

    // toteuta nämä kolme metodia
    public ArrayList<Integer> rivienSummat() {
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int rivit = 0; rivit < nelio.length; rivit++) {
            int summa = 0;
            for (int sarakkeet = 0; sarakkeet < nelio.length; sarakkeet++) {
                summa += nelio[rivit][sarakkeet];
            }
            al.add(summa);
        }
        
        return al;
    }

    public ArrayList<Integer> sarakkeidenSummat() {
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int rivit = 0; rivit < nelio.length; rivit++) {
            int summa = 0;
            for (int sarakkeet = 0; sarakkeet < nelio.length; sarakkeet++) {
                summa += nelio[sarakkeet][rivit];
            }
            al.add(summa);
        }
        
        return al;
    }

    public ArrayList<Integer> lavistajienSummat() {
        ArrayList<Integer> al = new ArrayList<>();
        int lavistajienLkm = nelio.length*2 -1;
         
            int sum = 0;
            int x = 0;
            
            for (int i = 0; i < nelio.length; i++) {
                sum += nelio[i][x];
                x++;
            }
            al.add(sum);
            x = 0;
            sum = 0;
            
            for (int i = 1; i <= nelio.length; i++) {
                sum += nelio[nelio.length-i][x];
                x++;
            }
            al.add(sum);
           
        
        
        
        
        
        // https://stackoverflow.com/questions/20420065/loop-diagonally-through-two-dimensional-array
        /*
        for(int k = 0 ; k < nelio.length * 2 - 1; k++ ) {
            int sum = 0;
            
            for( int j = 0 ; j <= k ; j++ ) {
                
                int i = k - j;
                
                if( i < nelio.length && j < nelio.length ) {
                    sum += nelio[i][j];
                }
                
            }
            
            al.add(sum);
        }
        
        int sum = 0;
        sum += al.get(0);
        sum += al.get(al.size()-1);
        al.remove(0);
        al.remove(al.size()-1);
        al.add(sum);
        */
        
        return al;
    }

    // valmiit apumetodit -- älä koske näihin
    public boolean onTaikanelio() {
        return summatSamat() && kaikkiNumerotEri();
    }

    public ArrayList<Integer> annaKaikkiNumerot() {
        ArrayList<Integer> numerot = new ArrayList<>();
        for (int rivi = 0; rivi < nelio.length; rivi++) {
            for (int sarake = 0; sarake < nelio[rivi].length; sarake++) {
                numerot.add(nelio[rivi][sarake]);
            }
        }

        return numerot;
    }

    public boolean kaikkiNumerotEri() {
        ArrayList<Integer> numerot = annaKaikkiNumerot();

        Collections.sort(numerot);
        for (int i = 1; i < numerot.size(); i++) {
            if (numerot.get(i - 1) == numerot.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean summatSamat() {
        ArrayList<Integer> summat = new ArrayList<>();
        summat.addAll(rivienSummat());
        summat.addAll(sarakkeidenSummat());
        summat.addAll(lavistajienSummat());

        if (summat.size() < 3) {
            return false;
        }

        for (int i = 1; i < summat.size(); i++) {
            if (summat.get(i - 1) != summat.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int annaArvo(int x, int y) {
        if (x < 0 || y < 0 || x >= getLeveys() || y >= getKorkeus()) {
            return - 1;
        }

        return this.nelio[y][x];
    }

    public void asetaArvo(int x, int y, int arvo) {
        if (x < 0 || y < 0 || x >= getLeveys() || y >= getKorkeus()) {
            return;
        }

        this.nelio[y][x] = arvo;
    }

    public int getLeveys() {
        return this.nelio.length;
    }

    public int getKorkeus() {
        return this.nelio.length;
    }

    @Override
    public String toString() {
        StringBuilder palautus = new StringBuilder();
        for (int rivi = 0; rivi < nelio.length; rivi++) {
            for (int sarake = 0; sarake < nelio[rivi].length; sarake++) {
                palautus.append(nelio[rivi][sarake]).append("\t");
            }

            palautus.append("\n");
        }

        return palautus.toString();
    }
}
