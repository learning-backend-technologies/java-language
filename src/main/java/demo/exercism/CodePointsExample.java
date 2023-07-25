package demo.exercism;

import java.util.stream.IntStream;

public class CodePointsExample {
    public static void main(String[] args) {
        String str = "Hello 👋🌎"; // The string contains an emoji "👋" and a globe emoji "🌎".

        // Using codePointAt to get the code point at a specific index
        int codePointAtIndex1 = str.codePointAt(6); // The emoji "👋" starts at index 6.
        int codePointAtIndex2 = str.codePointAt(9); // The globe emoji "🌎" starts at index 9.

        System.out.println("Code point at index 6: " + codePointAtIndex1); // Output: Code point at index 6: 128075
        System.out.println("Code point at index 9: " + codePointAtIndex2); // Output: Code point at index 9: 127757

        // Using codePoints to iterate over all code points in the string
        IntStream codePointsStream = str.codePoints();

        // Printing all code points in the string
        System.out.println("Code points in the string:");
        codePointsStream.forEach(codePoint -> System.out.print(codePoint + " ")); // Output: 72 101 108 108 111 32 128075 127757
    }
}
