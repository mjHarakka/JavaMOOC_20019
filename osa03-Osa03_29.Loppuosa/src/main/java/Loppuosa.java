import java.util.Scanner;

public class Loppuosa {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna sana: ");
        String sana = lukija.nextLine();
        System.out.println("Anna pituus: ");
        int pituus = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Tulos: " + sana.substring(sana.length() - pituus));
    }
}
