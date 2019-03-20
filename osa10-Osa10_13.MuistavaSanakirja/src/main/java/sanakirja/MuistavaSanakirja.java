/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanakirja;

/**
 *
 * @author mikkoharakka
 */
import java.io.File;
import java.io.PrintWriter;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class MuistavaSanakirja {
    private String tiedosto;
    private Map<String, String> sanat;
    
    public MuistavaSanakirja(String tiedosto) {
        this.tiedosto = tiedosto;
        this.sanat = new HashMap<>();
    }

    public MuistavaSanakirja() {
        this.sanat = new HashMap<>();
    }
    
    public boolean tallenna() {
        try (PrintWriter kirjoittaja = new PrintWriter(tiedosto) ) {
            
            for (String sana: sanat.keySet()) {
                kirjoittaja.write(sana + ":" + sanat.get(sana) + "\n");
            }
            kirjoittaja.close();
            return true;
        } catch (Exception e) {
            System.out.println("Can't save into file: " + e.getMessage());
            return false;
        }
    }
       
    public boolean lataa() {
        try (Scanner tl = new Scanner(new File(tiedosto))) {
            
            while (tl.hasNextLine()) {
                String[] rivi = tl.nextLine().split(":");
                lisaa(rivi[0], rivi[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Ei skulaa " + e.getMessage());
            return false;
        }  
        
    }
    
    public void lisaa(String sana, String kaannos) {
        if (!sanat.containsKey(sana)) {
            sanat.put(sana, kaannos);
        }
    }
    
    public String kaanna(String sana) {
        String palautettava = null;
        
        for (String s: sanat.keySet()) {
            if (sana.equals(s)) {
                palautettava = sanat.get(s);
                
            } else if (sana.equals(sanat.get(s))) {
                palautettava = s;
            }
        }      
        return palautettava;
    }
    
    public void poista(String sana) {
        
        if (sanat.containsKey(sana)) {
            sanat.remove(sana);
        } else if (sanat.containsKey(kaanna(sana))) {
            sanat.remove(kaanna(sana));
        }
    }
    
}
