
import java.util.Scanner;

public class JokaToinenSana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

while (true) {
            String syote = lukija.nextLine();
            
            if (syote.equals("")) {
                break;
            }
            
            
            

            String[] sanat = syote.split(" ");

            int i = 0;
            while (i < sanat.length) {
                
                if (i % 2 != 0) {
                    System.out.println(sanat[i]);
                }
                i++;
            }
            
            
            
        }
        
    }
}
