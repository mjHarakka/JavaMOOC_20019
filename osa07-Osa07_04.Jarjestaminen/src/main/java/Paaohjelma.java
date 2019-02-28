import java.util.Arrays;

public class Paaohjelma {

    public static void main(String[] args) {
        int[] luvut = {8, 3, 7, 9, 1, 2, 4};
        Paaohjelma.jarjesta(luvut);
    }
    
    public static void jarjesta(int[] taulukko) {
        int pieninIndeksi = 0;
        
        for (int i = 0; i < taulukko.length; i++) {
            System.out.println(Arrays.toString(taulukko));
            pieninIndeksi = Paaohjelma.pienimmanIndeksiAlkaen(taulukko, i);
            Paaohjelma.vaihda(taulukko, i, pieninIndeksi);    
        }
        
        
    }
    
    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {

        
        int apu = taulukko[indeksi1];
        
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = apu;

    }
    
    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
       
        int pienin = taulukko[aloitusIndeksi];
        int x = 0;
        
        for (int i = aloitusIndeksi; i < taulukko.length; i++) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];
                x = i;
            }
        }
        
        int indeksi = x;
        
        while (true) {
            if (taulukko[indeksi] == pienin) {
                break;
            }
            indeksi++;
        }
        
        return indeksi;
    }
    
    public static int pienimmanIndeksi(int[] taulukko) {
        int indeksi = 0;
        int i = 0;
        
        int pienin = taulukko[0];
        
        for (int luku: taulukko) {
            if (luku < pienin) {
                pienin = luku;
                indeksi = i;
            }
            i++;
        }
        
        return indeksi;
    }
    
    public static int pienin(int[] taulukko) {
        int pienin = taulukko[0];
        
        for (int luku: taulukko) {
            if (luku < pienin) {
                pienin = luku;
            }
        }
        return pienin;
    }
    
    

}
