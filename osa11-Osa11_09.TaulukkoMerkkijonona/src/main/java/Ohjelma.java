
public class Ohjelma {

    public static void main(String[] args) {
        // Testaa metodiasi täällä
        
        int[][] matriisi = {
            {1},
            {2, 2},
            {3, 3, 3},
            {4, 4, 4, 4}
          };
        System.out.println(taulukkoMerkkijonona(matriisi));
        
    }
    
    public static String taulukkoMerkkijonona(int[][] taulukko) {
        StringBuilder sb = new StringBuilder();
        
        
        for (int rivi = 0; rivi < taulukko.length; rivi++) {
           for (int sarake = 0; sarake < taulukko[rivi].length; sarake++) {
               sb.append(taulukko[rivi][sarake]);
           }
           if (rivi < taulukko.length - 1) {
               sb.append("\n");
           }
           
            
        }
        
        return sb.toString();
    }

}
