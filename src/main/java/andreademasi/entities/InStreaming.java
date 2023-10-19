package andreademasi.entities;

import java.util.Random;

public enum InStreaming {
    TRUE, FALSE;

    private static final Random PRNG = new Random();

    public static InStreaming randomInStreaming() {
        InStreaming[] streaming = values();
        return streaming[PRNG.nextInt(streaming.length)];
    }
}
