package MySolusions.Author;

import sun.security.x509.X500Name;

public class Poem {

    public Author getCreator;
    private Author creator;
    private int stropheNumbers;

    public Poem(Author creator, int stropheNumbers) {
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public void print() {
    }

    public X500Name getCreator() {
    }
}
