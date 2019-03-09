
import java.util.ArrayList;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        
        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");
        
        while (true) {
            String syote = lukija.nextLine();
            
            if (syote.equals("loppu")) {
                break;
            }
            
            lista.add(syote);   
        }
        
        double positiivistenKeskiarvo = lista.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(s -> s > 0)
                .average()
                .getAsDouble();
                
        double negatiivistenKeskiarvo = lista.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(s -> s < 0)
                .average()
                .getAsDouble();        
                        
        System.out.println("Tulostetaanko negatiivisten vai positiivisten"
                + "lukujen keskiarvo? (n/p)");
        String kumpi = lukija.nextLine();
        
        if (kumpi.equals("p")) {
            System.out.println("Positiivistne lukujen keskiarvo: " + positiivistenKeskiarvo);
        } else if (kumpi.equals("n")) {
            System.out.println("Positiivistne lukujen keskiarvo: " + negatiivistenKeskiarvo);
        }
        
        

    }
}
