package sanakirja;

public class Main {
    public static void main(String[] args) {
        // Testaa sanakirjaa täällä
        MuistavaSanakirja s = new MuistavaSanakirja("test-97356.txt");
        s.lisaa("tietokone", "computer");
        System.out.println(s.kaanna("tietokone"));
        s.tallenna();
        
    }
}
