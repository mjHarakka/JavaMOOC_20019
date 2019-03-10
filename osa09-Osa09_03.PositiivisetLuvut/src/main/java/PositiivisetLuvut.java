
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiivisetLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> syotteet = new ArrayList<>();

        // luetaan syotteet
        while (true) {
            String rivi = lukija.nextLine();
            if (rivi.equals("loppu")) {
                break;
            }

            syotteet.add(Integer.valueOf(rivi));
        }
        
        System.out.println(positiiviset(syotteet));

    }

    public static List<Integer> positiiviset(List<Integer> luvut) {
        return luvut.stream().filter(luku -> luku > 0).collect(Collectors.toList());
    }
    
}
