
import java.util.Scanner;

public class Nuorin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int pienin = 9999;
        String henkilo = "";
        
        while (true) {
            String syote = lukija.nextLine();   
            if (syote.equals("loppu")) {
                System.out.println("Nuorin oli: " + henkilo);
                break;
            }
          
            String numero = syote.substring(syote.indexOf(",") + 1);
            
            if (Integer.parseInt(numero) < pienin) {
                pienin = Integer.parseInt(numero);
                henkilo = syote.substring(0, syote.indexOf(","));
            }
            
        }
        
        
        
    }
}
