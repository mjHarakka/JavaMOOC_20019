
public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne koodia jolla testaat ohjelmoimasi luokan toimintaa
        
        Raha a = new Raha(10, 0);
        Raha b = new Raha(3, 0);
        Raha c = new Raha(5, 0);

        System.out.println(a.vahemman(b));  // false
        System.out.println(b.vahemman(c));  // true
        
    }
}
