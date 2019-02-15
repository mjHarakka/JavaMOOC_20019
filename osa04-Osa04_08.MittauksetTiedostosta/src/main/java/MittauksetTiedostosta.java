
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());
        
        ArrayList<Integer> lista = new ArrayList<>();
        
        try (Scanner fileReader = new Scanner(new File(tiedosto))) {
            
            while(fileReader.hasNextInt()) {
                lista.add(fileReader.nextInt());
            }
            
        } catch (Exception e) {
            System.out.println("error");
        }
        
        int sum = 0;
        
        for (int luku: lista) {
            if (luku >= alaraja && luku <= ylaraja) {
                sum++;
            }
        }
        System.out.println("Lukuja: " + sum);

    }

}
