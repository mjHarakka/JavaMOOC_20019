

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia josta kutsut ohjelmoitavia metodeja  
        Tarkistin t = new Tarkistin();
        
        if (t.kellonaika("11:24:00")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        if (t.kellonaika("3:59:31")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        if (t.kellonaika("abc")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        if (t.kellonaika("33:33:33")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
    }
}
