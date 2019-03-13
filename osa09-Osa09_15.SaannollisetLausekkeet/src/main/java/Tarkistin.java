

public class Tarkistin {

    public boolean onViikonpaiva(String merkkijono) {
        if (merkkijono.matches("ma|ti|ke|to|pe|la|su")) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean kaikkiVokaaleja(String merkkijono) {
        if (merkkijono.matches("[a, e, i, o, u, y, å, ä, ö]*")) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean kellonaika(String merkkijono) {
        String regex = "(([0-1][0-9])|(2[0-3])):[0-5][0-9]:[0-5][0-9]";
        
        if (merkkijono.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }
    
}
