package andreademasi.entities;

import java.util.Random;

public enum Genere {
    CLASSICO, ROCK, POP;

    private static final Random PRNG = new Random();

    public static Genere randomGenere() {
        Genere[] genere = values();
        return genere[PRNG.nextInt(genere.length)];
    }
}
