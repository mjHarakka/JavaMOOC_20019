/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
import java.util.ArrayList;

public class Kirjasto {
    private ArrayList<Kirja> kirjat;
    
    public Kirjasto() {
        kirjat = new ArrayList<>();
    }
    
    public ArrayList<Kirja> haeKirjaNimekkeella(String nimeke) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();

        for (int i = 0; i < kirjat.size(); i++) {
            if (StringUtils.sisaltaa(kirjat.get(i).nimeke(), nimeke)) {
                loydetyt.add(kirjat.get(i));
            }
        }

        return loydetyt;
    }
    public ArrayList<Kirja> haeKirjaJulkaisijalla(String julkaisija) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();

        for (int i = 0; i < kirjat.size(); i++) {
            if (StringUtils.sisaltaa(kirjat.get(i).julkaisija(), julkaisija)) {
                loydetyt.add(kirjat.get(i));
            }
        }

        return loydetyt;
    }
    
    public ArrayList<Kirja> haeKirjaJulkaisuvuodella(int julkaisuvuosi) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();

        for (int i = 0; i < kirjat.size(); i++) {
            if (kirjat.get(i).julkaisuvuosi() == julkaisuvuosi) {
                loydetyt.add(kirjat.get(i));
            }
        }

        return loydetyt;
    }
    
    public void lisaaKirja(Kirja uusiKirja) {
        this.kirjat.add(uusiKirja);
    }
    
    public void tulostaKirjat() {
        for (Kirja kirja: kirjat) {
            System.out.println(kirja);
        }
    }
    
    
    
}
