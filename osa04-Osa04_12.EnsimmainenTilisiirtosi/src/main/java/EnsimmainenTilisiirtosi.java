
public class EnsimmainenTilisiirtosi {

    public static void main(String[] args) {
        // Tili.Java:ssa olevaan koodiin ei tule koskea
        // tee ohjelmasi tänne
        Tili matinTili = new Tili("Matin Tili", 1000);
        Tili omaTili = new Tili("Oma Tili", 1000);
        matinTili.otto(100.0);
        omaTili.pano(100.0);
        System.out.println(matinTili);
        System.out.println(omaTili);
    }
}
