
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Lista<String> lista = new Lista<>();
        
        lista.lisaa("testi");
        lista.lisaa("jee");
        
        for (int i = 0; i < 150; i++) {
            
                lista.lisaa("" + i);
            
        }
        
        System.out.println(lista.koko());
        lista.poista("testi");
        System.out.println(lista.koko());
    }

}
