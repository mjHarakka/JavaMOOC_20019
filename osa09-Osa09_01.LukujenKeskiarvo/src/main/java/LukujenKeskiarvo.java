
import java.util.ArrayList;
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        // toteuta ohjelmasi tänne
        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");
        
        while (true) {
            String syote = lukija.nextLine();
            
            if (syote.equals("loppu")) {
                break;
            }
            
            lista.add(syote);   
        }
        
        double keskiarvo = lista.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        
        System.out.println("Lukujen keskiarvo: " + keskiarvo);
        
    }
}
