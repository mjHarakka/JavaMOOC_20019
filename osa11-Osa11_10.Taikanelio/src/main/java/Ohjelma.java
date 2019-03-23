
public class Ohjelma {

    public static void main(String[] args) {
        // Testaa Taikanelio-luokkaasi täällä
        Taikaneliotehdas tt = new Taikaneliotehdas();
        
        Taikanelio tn = tt.luoTaikanelio(9);
        
        
        System.out.println(tn);
        System.out.println(tn.rivienSummat());
        System.out.println(tn.sarakkeidenSummat());
        
        
    }
}
