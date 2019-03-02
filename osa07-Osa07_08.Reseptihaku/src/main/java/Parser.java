
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Parser {
    private File tiedosto;
    private ArrayList<String> lines;
    private ArrayList<Resepti> reseptit;
    
    public Parser(File tiedosto) {
        this.tiedosto = tiedosto;
    }
    
    public void parse() {
        lines = new ArrayList<>();
        
        try (Scanner tiedostoLukija = new Scanner(tiedosto)) {
            int i = 0;
            
            while (true) {
                
                
                this.lines.add(tiedostoLukija.nextLine());
                
                if (!tiedostoLukija.hasNextLine()) {
                    break;
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
    public void parseIntoObjects() {
        this.reseptit = new ArrayList<>();
        
        int index = 0;
        int i = 0;
        String reseptiNimi = "";
        int keittoAika = 0;
        ArrayList<String> raakaAineet = new ArrayList<>();
        
        while (i < lines.size()) {

            if (index == 0) {
                 reseptiNimi = lines.get(i);
            } else if (index == 1) {
                keittoAika = Integer.parseInt(lines.get(i));
            } else if (index > 1) {
                raakaAineet.add(lines.get(i));
            }
            
            
            index++;
            
            
            if (lines.get(i).isEmpty()) {
                this.reseptit.add(new Resepti(reseptiNimi, keittoAika, raakaAineet));
                raakaAineet = new ArrayList<>();
                index = 0;
                
            }
            
            i++;
            
        }
   
    }
    
    public Resepti getResepti(int luku) {
        return this.reseptit.get(luku);
    }
    
}
