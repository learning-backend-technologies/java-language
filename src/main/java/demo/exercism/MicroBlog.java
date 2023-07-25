package demo.exercism;

import java.text.BreakIterator;

public class MicroBlog {

    public static void main(String[] args) {
        MicroBlog mb = new MicroBlog();

//        String input = "\uD83D\uDEF3☃\uD83C\uDF0F❄🌡🤧🤒🏥🕰😀";
        String input = "h❄o🌡l🤧a🤒🏥🕰😀";
//        String input = "holaamigo";
        int maxLength = 5;

        String res = mb.truncate(input, maxLength);
        System.out.println("res = " + res);
    }

    private String truncate(String input, int maxLength) {
        if (input == null || input.length() <= maxLength)
            return input;

        return input.codePoints()
                .limit(maxLength)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }

    private String truncate3(String input, int maxLength) {
        if (input == null || input.length() <= maxLength)
            return input;

        StringBuilder truncated = new StringBuilder();
        int count = 0;

        for (int i = 0; i < input.length(); ) {
            int codePoint = input.codePointAt(i);
            int codePointLength = Character.charCount(codePoint);

//            if (count + codePointLength <= maxLength) {
            if (count < maxLength) {
                truncated.appendCodePoint(codePoint);
//                count += codePointLength;
                count++;
            } else {
                break;
            }

            i += codePointLength;
        }

        return truncated.toString();
    }

    private String truncate2(String input, int maxLength) {
        if (input == null || input.length() <= maxLength)
            return input;

        StringBuilder truncated = new StringBuilder();
        int count = 0;

        BreakIterator breakIterator = BreakIterator.getCharacterInstance();
        breakIterator.setText(input);

        for (int i = breakIterator.first(); i != BreakIterator.DONE; i = breakIterator.next()) {
            int j = breakIterator.next();
            System.out.println("i = " + i);
        }
        System.out.println("-------------------------------");





        int previousValue = -1;
        for (int currentValue = breakIterator.first(); currentValue != BreakIterator.DONE; currentValue = breakIterator.next()) {
            int nextValue = breakIterator.next();

            boolean isInit = (previousValue == -1);
            boolean isEnd = (nextValue == -1);

            if (!isInit){
                System.out.println("i = " + previousValue + " j : " + currentValue + ": SIZE => " + (currentValue - previousValue));
            }
            if (!isEnd){
                System.out.println("i = " + currentValue + " j : " + nextValue+ ": SIZE => " + (nextValue - currentValue));
            }
            previousValue = nextValue;
        }



        System.out.println("-------------------------------");
        previousValue = -1;
        for (int i = breakIterator.first(); i != BreakIterator.DONE; i = breakIterator.next()) {
            int j = breakIterator.next();
            String characterPrev = "";

            if (count >= maxLength)
                break;

            if (previousValue!=-1){
                characterPrev = input.substring(previousValue, i);
                truncated.append(characterPrev);
                count++;
            }
            if (count >= maxLength)
                break;
            String characterCurr = "";
            if (j != -1){
                characterCurr = input.substring(i, j);
                truncated.append(characterCurr);
                count++;
            }
            previousValue = j;

        }
//        input = "h\uD83C\uDF0Fl🌡a🤧🤒🏥🕰😀";
//        System.out.println("character = " + input.substring(0, 1));
//        System.out.println("character = " + input.substring(1, 2));
//        System.out.println("character = " + input.substring(2, 3));
//        System.out.println("character = " + input.substring(3, 5));
//        System.out.println("character = " + input.substring(5, 6));
//        System.out.println("character = " + input.substring(6, 8));
//        System.out.println("character = " + input.substring(8, 10));
//        System.out.println("character = " + input.substring(10, 12));

        return truncated.toString();
        //return input.substring(0, maxLength);
    }
}
