package com.epicness.alejandria.showcase.constants;

public class MusicIntervals {
    // Chromatic scale pitch multipliers (as floats for faster calculations)
    public static final float OCTAVE_BELOW = 0.5f;                // n = -12 (2^(-12/12))
    public static final float MAJOR_SEVENTH_BELOW = 0.5297316f;    // n = -11 (≈2^(-11/12))
    public static final float MINOR_SEVENTH_BELOW = 0.5612310f;    // n = -10
    public static final float MAJOR_SIXTH_BELOW = 0.5946036f;      // n = -9
    public static final float MINOR_SIXTH_BELOW = 0.6299606f;      // n = -8
    public static final float PERFECT_FIFTH_BELOW = 0.6674199f;    // n = -7
    public static final float TRITONE_BELOW = 0.7071068f;          // n = -6 (≈2^(-6/12) = 1/√2)
    public static final float PERFECT_FOURTH_BELOW = 0.7491536f;   // n = -5
    public static final float MAJOR_THIRD_BELOW = 0.7937006f;      // n = -4
    public static final float MINOR_THIRD_BELOW = 0.8408964f;      // n = -3
    public static final float MAJOR_SECOND_BELOW = 0.8908987f;     // n = -2
    public static final float MINOR_SECOND_BELOW = 0.9438743f;     // n = -1
    public static final float UNISON = 1.0f;                      // n = 0
    public static final float MINOR_SECOND = 1.0594631f;          // n = 1 (2^(1/12))
    public static final float MAJOR_SECOND = 1.1224620f;          // n = 2
    public static final float MINOR_THIRD = 1.1892071f;           // n = 3
    public static final float MAJOR_THIRD = 1.2599211f;           // n = 4
    public static final float PERFECT_FOURTH = 1.3348399f;        // n = 5
    public static final float TRITONE = 1.4142135f;               // n = 6 (√2)
    public static final float PERFECT_FIFTH = 1.4983071f;         // n = 7
    public static final float MINOR_SIXTH = 1.5874011f;           // n = 8
    public static final float MAJOR_SIXTH = 1.6817929f;           // n = 9
    public static final float MINOR_SEVENTH = 1.7817974f;          // n = 10
    public static final float MAJOR_SEVENTH = 1.8877486f;          // n = 11
    public static final float OCTAVE_ABOVE = 2.0f;                // n = 12

    // Array of all 12 semitones (ascending)
    public static final float[] CHROMATIC_SCALE = {
        OCTAVE_BELOW,
        MAJOR_SEVENTH_BELOW,
        MINOR_SEVENTH_BELOW,
        MAJOR_SIXTH_BELOW,
        MINOR_SIXTH_BELOW,
        PERFECT_FIFTH_BELOW,
        TRITONE_BELOW,
        PERFECT_FOURTH_BELOW,
        MAJOR_THIRD_BELOW,
        MINOR_THIRD_BELOW,
        MAJOR_SECOND_BELOW,
        MINOR_SECOND_BELOW,
        UNISON,
        MINOR_SECOND,
        MAJOR_SECOND,
        MINOR_THIRD,
        MAJOR_THIRD,
        PERFECT_FOURTH,
        TRITONE,
        PERFECT_FIFTH,
        MINOR_SIXTH,
        MAJOR_SIXTH,
        MINOR_SEVENTH,
        MAJOR_SEVENTH,
        OCTAVE_ABOVE
    };

    public static final float[] MAJOR_SCALE = {
        OCTAVE_BELOW,
        MINOR_SEVENTH_BELOW,
        MINOR_SIXTH_BELOW,
        PERFECT_FIFTH_BELOW,
        PERFECT_FOURTH_BELOW,
        MINOR_THIRD_BELOW,
        MINOR_SECOND_BELOW,
        UNISON,
        MAJOR_SECOND,
        MAJOR_THIRD,
        PERFECT_FOURTH,
        PERFECT_FIFTH,
        MAJOR_SIXTH,
        MAJOR_SEVENTH,
        OCTAVE_ABOVE
    };

    public static final float[] MINOR_PENTATONIC_SCALE = {
        OCTAVE_BELOW,
        MAJOR_SIXTH_BELOW,
        PERFECT_FIFTH_BELOW,
        PERFECT_FOURTH_BELOW,
        MAJOR_SECOND_BELOW,
        UNISON,
        MINOR_THIRD,
        PERFECT_FOURTH,
        PERFECT_FIFTH,
        MINOR_SEVENTH,
        OCTAVE_ABOVE
    };
    public static final float[] MAJOR_PENTATONIC_SCALE = {
        OCTAVE_BELOW,
        MINOR_SEVENTH_BELOW,
        MINOR_SIXTH_BELOW,
        PERFECT_FOURTH_BELOW,
        MINOR_THIRD_BELOW,
        UNISON,
        MAJOR_SECOND,
        MAJOR_THIRD,
        PERFECT_FIFTH,
        MAJOR_SIXTH,
        OCTAVE_ABOVE
    };
    public static final float[] MAJOR_ADD_2_ARPEGGIO = {
        OCTAVE_BELOW,
        MINOR_SEVENTH_BELOW,
        MINOR_SIXTH_BELOW,
        PERFECT_FOURTH_BELOW,
        UNISON,
        MAJOR_SECOND,
        MAJOR_THIRD,
        PERFECT_FIFTH,
        OCTAVE_ABOVE
    };

    public static final float[] WHOLE_TONE_SCALE = {
        OCTAVE_BELOW,
        MINOR_SEVENTH_BELOW,
        MINOR_SIXTH_BELOW,
        TRITONE_BELOW,
        MAJOR_THIRD_BELOW,
        MAJOR_SECOND_BELOW,
        UNISON,
        MAJOR_SECOND,
        MAJOR_THIRD,
        TRITONE,
        MINOR_SIXTH,
        MINOR_SEVENTH,
        OCTAVE_ABOVE
    };
}
