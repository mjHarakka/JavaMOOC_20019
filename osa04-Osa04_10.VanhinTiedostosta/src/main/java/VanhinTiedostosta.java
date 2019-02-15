
import java.io.File;
import java.util.Scanner;
import java.util.HashMap;

public class VanhinTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        HashMap<Integer, String> lista = new HashMap<>();

        System.out.println("Mikä tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        
        int i = 0;
        
        try (Scanner fileReader = new Scanner(new File(tiedosto))) {         
            while (fileReader.hasNextLine()) {
                String rivi = fileReader.nextLine();
                
                String[] sanat = rivi.split(",");
            
                lista.put(Integer.valueOf(sanat[1]), sanat[0]);
                
                if (Integer.valueOf(sanat[1]) > i) {
                    i = Integer.valueOf(sanat[1]);
                }
                
            } 
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        // Null blogin nimeksi
        System.out.println(lista);
        System.out.println("Vanhin oli: " + lista.get(i));
        
    }
}
