
import java.util.ArrayList;
import java.util.Scanner;

public class RajatutLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> syotetyt = new ArrayList<>();
        
        while (true) {
            int syote = Integer.valueOf(lukija.nextLine()); 
            if (syote < 0) {
                break;
            }
            syotetyt.add(syote);   
        }
        
        syotetyt.stream().filter(i -> i >= 1 && i <= 5).forEach(i -> System.out.println(i));

    }
}
