import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInputNLMorse;
        String userInputNLMorseLC;
        String userSelection;

        String[] alfabetNederlands = {" ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y",
                "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", ",",
                "?", "!", "`", "\"", "(", ")", "&", ":", ";", "/", "_", "=", "+",
                "-", "$", "@"};

        String[] alfabetMorse = {"   ", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",
                ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", ".-.-.-", "--..--", "..--..", "-.-.--", ".----.", ".-..-.",
                "-.--.", "-.--.-", ".-...", "---...", "-.-.-.", "-..-.", "..--.-",
                "-...-", ".-.-.", "-....-", "...-..-", ".--.-."};

        System.out.println("Voer de tekst in om naar morse over te zetten:");
        userInputNLMorse = scanner.nextLine();

        userInputNLMorseLC = userInputNLMorse.toLowerCase();

        String[] splitString = userInputNLMorseLC.split("");

        for (int i = 0; i < userInputNLMorseLC.length(); i++) {
            for(int j = 0; j < alfabetNederlands.length; j++) {
                if (splitString[i].equals(alfabetNederlands[j])) {
                    System.out.print(alfabetMorse[j] + " ");
                }
            }
        }

        System.out.println("");

        System.out.println("Wilt u de morsecode terug vertalen naar Nederlands? (Y/N)");

        while (true) {
            userSelection = scanner.nextLine();

            userSelection = userSelection.toLowerCase();

            if (userSelection.equals("y")) {
                System.out.println(userInputNLMorse);
                break;
            } else if (userSelection.equals("n")) {
                System.out.println("Tot ziens!");
                break;
            } else {
                System.out.println("Verkeerde input. Probeer opnieuw a.u.b.");
            }
        }
    }
}