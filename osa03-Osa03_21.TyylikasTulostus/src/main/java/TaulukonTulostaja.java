
public class TaulukonTulostaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        // Kirjoita koodia tänne
        
        for (int i = 0; i < taulukko.length; i++) {
            if (i == taulukko.length - 1) {
                System.out.print(taulukko[i]);
            } else {
                System.out.print(taulukko[i] + ", ");
            }
        }
 
    }
}
