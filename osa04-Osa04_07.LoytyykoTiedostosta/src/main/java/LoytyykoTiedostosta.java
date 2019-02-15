
import java.io.File;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();
        
        boolean loytyiko = false;

        try (Scanner fileReader = new Scanner(new File(tiedosto))) {
            
            while(fileReader.hasNextLine()) {
                if (etsittava.equals(fileReader.nextLine())){
                    loytyiko = true;
                } 
            }
            
        } catch (Exception e) {
            System.out.println("Tiedoston lukeminen epäonnistui.");
        }
        
        if (loytyiko) {
            System.out.println("Löytyi!");
        } else {
            System.out.println("Ei löytynyt.");
        }
        
    }
}
