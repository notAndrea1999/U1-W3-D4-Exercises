package andreademasi.entities;

import java.util.Random;

public enum Streaming {
    TRUE, FALSE;

    private static final Random PRNG = new Random();

    public static Streaming randomInStreaming() {
        Streaming[] streaming = values();
        return streaming[PRNG.nextInt(streaming.length)];
    }
}
