
import java.util.Scanner;

public class YkkostenOsuus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int maara = 0;
        int ykkoset = 0;
        
        while(true) {
            
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku == 0 && maara > 0) {
                System.out.println(ykkoset/(double)maara);
                break;
            } else if (luku == 0 && maara == 0) {
                System.out.println("Ykkösten osuutta ei voida laskea");
                break;
            }
            
            maara++;
            
            if (luku == 1) {
                ykkoset++;
            }
            
            
            
        }

    }
}
