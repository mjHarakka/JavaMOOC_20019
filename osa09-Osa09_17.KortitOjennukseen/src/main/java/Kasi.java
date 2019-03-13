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
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;


public class Kasi implements Comparable<Kasi> {
    private List<Kortti> kasi;

    public Kasi() {
        this.kasi = new ArrayList<>();
    }
    
    public int getArvot() {
        return kasi.stream().
                mapToInt(i -> i.getArvo()).sum();
    }
    
    public void jarjestaMaittain() {
        SamatMaatVierekkainArvojarjestykseen samatMaatVierekkainJarjestaja = new SamatMaatVierekkainArvojarjestykseen();
        
        Collections.sort(kasi, samatMaatVierekkainJarjestaja);
    }
    
    @Override
    public int compareTo(Kasi k) {
        
        if (getArvot() == k.getArvot()) {
            return 0;
        } else if (getArvot() < k.getArvot()){
            return -1;
        } else {
            return 1;
        }

    }
    
    public void jarjesta() {
        Collections.sort(kasi);
    }
    
    public void lisaa(Kortti kortti) {
        kasi.add(kortti);
    }
    
    public void tulosta() {
        kasi.stream()
            .forEach(k -> System.out.println(k));
    }
    
}
