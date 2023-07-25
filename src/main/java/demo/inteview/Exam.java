package demo.inteview;

//        String[] phases = {"","Fresh fried fish - fish fresh fried"};
//        String[] phases = {"2here2", "is", " our STRING"};
//        String[] phases = {"123", "eat;sleep;repeat", "321"};

//        Input: ["break3ing news8:", "2A 1circle is round!"]
//        Output: "Breaking News: A Circle Is Round!"

//        Input: ["","Fresh fried fish - fish fresh fried"]
//        Output:"Fresh Fried Fish - Fish Fresh Fried"
//        Input: ["2here2", "is", " our STRING"]
//        Output: "Here Is Our STRING"
//        Input: ["123", "eat;sleep;repeat", "321"]
//        Output: "Eat;Sleep;Repeat"

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 0.- Tenemos arreglo de cadenas
 *      ["break3ing news8:", "2A 1circle is round!"]
 * 1.- Sacar las phases :
 *      "break3ing news8:"
 *      "2A 1circle is round!"
 * 2.- Sacar palabras
 *      break3ing
 *      news8:
 *      2A
 *      1circle
 *      is
 *      round!
 * 3.- Quitar numeros
 *      breaking
 *      news:
 *      A
 *      circle
 *      is
 *      round!
 * 4.- Cambiar 1ra letra a mayuscula
 *      Breaking
 *      News:
 *      A
 *      Circle
 *      Is
 *      Round!
 * 5.- Convertir lista a cadena
 */
public class Exam {

    public static void main(String[] args) {
        Exam exam = new Exam();
        String[] phrases = {"break3ing news8:", "2A 1circle is round!"};

        String result = exam.cleanPhrase(phrases);
        System.out.println("result = " + result);
    }

    private String cleanPhrase(String[] phrases) {
        System.out.println("(null instanceof Integer) = " + (null instanceof Integer));
        return Arrays.stream(phrases)
                .map(phrase ->
                        Arrays.stream(phrase.split(" "))
                            .map(word ->
                                    word.replaceAll("[0-9]", ""))
                            .map(word ->
                                    word.isEmpty() ? "" : Character.toUpperCase(word.charAt(0)) + word.substring(1))
                            .collect(Collectors.joining(" "))
                )
                .collect(Collectors.joining(" "));
    }

    private String cleanPhrase3(String[] phrases) {
        StringBuilder result = new StringBuilder();

        for (String phrase : phrases) {
            String[] words = phrase.split(" ");
            for (String word : words) {
                // Eliminar los números de la palabra
                word = word.replaceAll("[0-9]", "");

                // Convertir la primera letra de la palabra en mayúscula
                if (!word.isEmpty()) {
//                    String firstLetter = word.substring(0, 1).toUpperCase();
                    char firstLetter = Character.toUpperCase(word.charAt(0));
                    word = firstLetter + word.substring(1);
                }

                result.append(word).append(" ");
            }
        }
        return result.toString().trim(); // Eliminar el espacio adicional al final.
    }


        private String cleanPhrase2(String[] phases){
        StringBuilder result = new StringBuilder();
        for(String phase : phases){
            String words[] = phase.split(" ");
            for(String word : words){
                word = word.replaceAll("[0-9]", "");
                String firstLetter = "";
                if ( word != null && word.length() >= 1)
                    firstLetter = word.toUpperCase().substring(0,1);
                String[] wordArray = word.split("");
                wordArray[0]=firstLetter;
                String cleanWord="";
                for (String wordClean : wordArray){
                    cleanWord += wordClean;
                }
                result.append(cleanWord).append(" ");
            }
        }
        return result.toString();
    }
}
//[2:17 PM] Valentin Gonzalez
//
//public void myMethod(String... strings){
//
//// method body
//
//        }
//
//        [2:19 PM] Valentin Gonzalez
//
//        X instaceOf SomeClass
//
//        [2:19 PM] Valentin Gonzalez
//
//        new ArrayList<Integer>() {{
//
//        add(1);
//
//        add(2);
//
//        }};
//
//        [2:20 PM] Valentin Gonzalez
//
//volatile
//
//[2:20 PM] Valentin Gonzalez
//
//        syncrhonized